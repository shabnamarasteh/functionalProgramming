package com.test.functional.function;

import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;

public class CommonFunction {
    public static void main(String[] args) {
        IntFunction<String> stringIntFunction = value -> Integer.toHexString(value);
        System.out.println(stringIntFunction.apply(Integer.parseInt("input type is generic but output is Integer")));

        ToDoubleFunction<Integer> integerToDoubleFunction = Integer::doubleValue;
        System.out.println("-input type just double and output is generic");

        Predicate<Integer> even = integer -> integer % 2 == 0; //return boolean
        even.negate().test(4);//negate -> inverse result
        even.and(integer -> integer % 5 == 0).test(4);
        even.or(integer -> integer % 5 == 0).test(4);

        Predicate<String> predicate = Predicate.isEqual("java");
        predicate.test("java");
    }
}
