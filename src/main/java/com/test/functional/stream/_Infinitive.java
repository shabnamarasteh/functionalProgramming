package com.test.functional.stream;

import java.math.BigInteger;
import java.util.stream.Stream;

public class _Infinitive {
    public static void main(String[] args) {
        Stream.iterate(0L, aLong-> aLong+10).filter(aLong -> aLong < 100).limit(5)
                .forEach(aLong -> System.out.println(aLong));
        System.out.println("------------------------");
        Stream.iterate(BigInteger.ONE, bigInteger -> bigInteger.multiply(BigInteger.valueOf(2))).limit(10).
                forEach(bigInteger -> System.out.println(bigInteger));

        //generate
        Stream.generate(() -> "Hi").limit(10).forEach(s -> System.out.println(s));
    }
}
