package com.test.functional.stream;

import java.util.regex.Pattern;

public class _chars_Split {
    public static void main(String[] args) {
        String str = "Str1,Str2,Str3";
        str.chars().map(operand -> ((char)operand == ',' ? '-' : (char)operand )
        ).forEach(value -> System.out.println((char) value));
        Pattern.compile(",").splitAsStream(str).forEach(System.out::println);
    }
}
