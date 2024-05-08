package com.example.springDocumentation;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.SpelParserConfiguration;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import com.example.springDocumentation.SpEL.Demo;

public class SpEL_03_ParserConfiguration {
    public static void main(String[] args) {
        // SpelParserConfiguration의 두 매개변수는 '자동 null 참조 초기화'와 '자동 컬렉션 증가'를 활성화함.
        SpelParserConfiguration config = new SpelParserConfiguration(true, true);

        ExpressionParser parser = new SpelExpressionParser(config);

        Expression expression = parser.parseExpression("list[3]");

        Demo demo = new Demo();

        @SuppressWarnings("unused")
        Object o = expression.getValue(demo); // demo.list는 이제 4개의 항목을 가진 실제 컬렉션이 됨. 각 항목은 새로운 빈 문자열임.
        System.out.println(demo.list.size()); // 4
    }
}
