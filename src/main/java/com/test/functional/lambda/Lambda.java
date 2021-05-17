package com.test.functional.lambda;

import java.util.ArrayList;
import java.util.Date;

public class Lambda {
    public static void main(String[] args) throws Exception {
        StringToInt stringToInt = (String str) -> {
            if(str == null)
                throw  new Exception();
            return str.length();};

        int length = stringToInt.map("test");
        System.out.println(length);

        //StandAlone expression -> type is declare
        new Date();
        //polyExpression -> type not declare;
        new ArrayList();
        //lambda is a polyexpression-> target type is compiler guess of lambda type
    }
    interface StringToInt {
        int map(String str) throws Exception;
    }
}
