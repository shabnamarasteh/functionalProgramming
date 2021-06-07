package com.test.functional.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class _Foreach {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4);
        Iterator<Integer> iterator = numbers.stream().iterator();
        iterator.forEachRemaining(integer -> System.out.println(integer));

        numbers.stream().forEach(integer -> System.out.println(integer));
        //when set stream parallel, stream use forkJoin framework and arrangment of data is lose.
        numbers.stream().parallel().forEach(integer -> System.out.println(integer));
        //get thread name
        numbers.stream().parallel().forEach(integer -> System.out.println(Thread.currentThread().getName()+"----------"+integer));
        //for set arrangment in parallel stream (after do work arrangment them):
        numbers.stream().parallel().forEachOrdered(integer -> System.out.println(Thread.currentThread().getName()+"----------"+integer));
        //force parallel stream to do operation on ordered data( methods like skip, limit, findfirst, distinct , ... need to sequential array)
        numbers.stream().skip(1).limit(2).findFirst().ifPresent(integer -> System.out.println(integer));
        //if arrangmrnt of array is unimportant, use unorderde
        numbers.stream().unordered().skip(1).limit(2).findFirst().ifPresent(integer -> System.out.println(integer));

    }
}
