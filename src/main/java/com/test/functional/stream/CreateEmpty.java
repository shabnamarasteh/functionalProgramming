package com.test.functional.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateEmpty {
    public static void main(String[] args) {
        Stream<String> stream = Stream.empty();
        IntStream numbers = IntStream.empty();
    }
}
