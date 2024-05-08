package com.example.springDocumentation.SpEL;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Society {
    private String name;
    public static String Advisors = "advisors";
    public static String President = "president";
    private List<Inventor> members = new ArrayList<>();
    @SuppressWarnings("rawtypes")
    private Map officers = new HashMap();

    @SuppressWarnings("rawtypes")
    public List getMembers() {
        return members;
    }

    @SuppressWarnings("rawtypes")
    public Map getOfficers() {
        return officers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMember(String name) {
        for (Inventor inventor : members) {
            if (inventor.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
}
