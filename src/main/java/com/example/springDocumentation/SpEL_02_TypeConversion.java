package com.example.springDocumentation;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;

import com.example.springDocumentation.SpEL.Simple;

public class SpEL_02_TypeConversion {
    public static void main(String[] args) {
        // Simple 인스턴스 생성
        Simple simple = new Simple();
        simple.booleanList.add(true);

        EvaluationContext context = SimpleEvaluationContext.forReadOnlyDataBinding().build();
        ExpressionParser parser = new SpelExpressionParser();
        parser.parseExpression("booleanList[0]").setValue(context, simple, "false"); // Simple 인스턴스 안의 배열에 "false"를 집어넣음
        Boolean b = simple.booleanList.get(0);
        System.out.println(b); // false
    }
}
