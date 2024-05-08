package com.example.springDocumentation;

import java.util.GregorianCalendar;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import com.example.springDocumentation.SpEL.Inventor;

public class SpEL_01_Evaluation {
    public static void main(String[] args) {

        System.out.println("1. evaluate the literal string expression");
        ExpressionParser parser = new SpelExpressionParser();
        Expression exp = parser.parseExpression("'Hello World'");
        String message = (String) exp.getValue();
        System.out.println(message);
        System.out.println("=============================================");

        System.out.println("2. concat method");
        parser = new SpelExpressionParser();
        exp = parser.parseExpression("'Hello World'.concat('!')");
        message = (String) exp.getValue();
        System.out.println(message);
        System.out.println("=============================================");

        System.out.println("3. how to access the Bytes JavaBean property of the string literal");
        parser = new SpelExpressionParser();
        exp = parser.parseExpression("'Hello World'.bytes"); // invokes 'getBytes()'
        byte[] bytes = (byte[]) exp.getValue();
        System.out.println(bytes);
        System.out.println("=============================================");

        System.out.println("4. how to use dot notation to get the length of a string literal");
        parser = new SpelExpressionParser();
        exp = parser.parseExpression("'Hello World'.bytes.length"); // invokes 'getBytes().length'
        Integer length = exp.getValue(Integer.class);
        System.out.println(length);
        System.out.println("=============================================");

        System.out.println("5. expression string that is evaluated against a specific object instance");
        // Create and set a calendar
        GregorianCalendar c = new GregorianCalendar();
        c.set(1856, 7, 9);

        // The constructor arguments are name, birthday, and nationality.
        Inventor tesla = new Inventor("Nikola Tesla", c.getTime(), "Serbian");

        parser = new SpelExpressionParser();

        exp = parser.parseExpression("name"); // Parse name as an expression
        String name = (String) exp.getValue(tesla);
        System.out.println(name); // name == "Nikola Tesla"

        exp = parser.parseExpression("name == 'Nikola Tesla'");
        Boolean result = exp.getValue(tesla, Boolean.class);
        System.out.println(result);
        System.out.println("=============================================");
    }
}
