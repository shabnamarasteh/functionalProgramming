package com.test.functional.stream;

import java.util.function.Consumer;
import java.util.stream.IntStream;

public class _Primitive {
    public static void main(String[] args) {
        //create a range of data ex: between 0 ,10 (10 not in range)
        IntStream.range(0,10).iterator().forEachRemaining((Consumer<? super Integer>) value -> System.out.println(value));
        //create a range of data ex: between 0 ,10 (10 in range)
        IntStream.rangeClosed(0,10).iterator().forEachRemaining((Consumer<? super Integer>) value -> System.out.println(value));

    }
}
