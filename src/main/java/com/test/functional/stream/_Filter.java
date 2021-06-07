package com.test.functional.stream;

import java.util.Arrays;
import java.util.List;

public class _Filter {
    public static void main(String[] args) {
        //stream focus on calculate on the datasource object
        //stream not used memory
        //filter is predicate method
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().filter(number-> number % 2 ==1)
                .map(number->number*number)
                .reduce(0 , Integer::sum);
        System.out.println(sum);
    }
}
