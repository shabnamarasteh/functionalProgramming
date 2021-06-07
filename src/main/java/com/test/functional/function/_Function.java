package com.test.functional.function;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        //Function interface : first argument is input and second is output type
        //This method applies the given function on its only argument

        Function<Integer, Integer> doubleValueFunction =
        value -> value * value;
        System.out.println(doubleValueFunction.apply(10));

        //if use andThen instead Of apply we have a new Function
        doubleValueFunction = doubleValueFunction.andThen(value -> 2*value);
        System.out.println(doubleValueFunction.apply(5));

//         first call the Function passed as parameter to compose(),
//         and then it will call the Function which compose() was called on.

        Function<Integer, Integer> multiply = (value) -> value * 2;
        Function<Integer, Integer> add = (value) -> value + 3;
        Function<Integer, Integer> addThenMultiply = multiply.compose(add);
        System.out.println("-----compose : "+addThenMultiply.apply(5));

        //identity return input for output
        Function<String, String> function = Function.identity();
        System.out.println("---identity--"+function.apply("hello"));

    }
}
