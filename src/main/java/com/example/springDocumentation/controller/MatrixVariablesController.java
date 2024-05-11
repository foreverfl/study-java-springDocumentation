package com.example.springDocumentation.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MatrixVariablesController {
    @GetMapping("/pets/{petId}") // http://localhost:8080/pets/10;q=100
    public Map<String, Object> findPet(@PathVariable String petId, @MatrixVariable int q) {

        Map<String, Object> response = new HashMap<>();
        response.put("petId", petId);
        response.put("q", q);
        return response;
    }

    @GetMapping("/owners/{ownerId}/pets/{petId}") // http://localhost:8080/owners/1;q=11/pets/2;q=22
    public Map<String, Object> findPetByOwner(
            @MatrixVariable(name = "q", pathVar = "ownerId") int q1,
            @MatrixVariable(name = "q", pathVar = "petId") int q2) {
        Map<String, Object> response = new HashMap<>();
        response.put("q1", q1);
        response.put("q2", q2);
        return response;
    }

    @GetMapping("/pets1/{petId}") // http://localhost:8080/pets1/42
    public Map<String, Object> findPetWithDefaultQ(@PathVariable String petId,
            @MatrixVariable(required = false, defaultValue = "1") int q) {
        Map<String, Object> response = new HashMap<>();
        response.put("petId", petId);
        response.put("q", q);
        return response;
    }

    @GetMapping("/owners1/{ownerId}/pets/{petId}") // http://localhost:8080/owners1/1;q=11;r=12/pets/2;q=22;s=23
    public Map<String, Object> findPetWithMatrixVars(
            @MatrixVariable MultiValueMap<String, String> matrixVars,
            @MatrixVariable(pathVar = "petId") MultiValueMap<String, String> petMatrixVars) {
        Map<String, Object> response = new HashMap<>();
        response.put("matrixVars", matrixVars);
        response.put("petMatrixVars", petMatrixVars);
        return response;
    }
}
