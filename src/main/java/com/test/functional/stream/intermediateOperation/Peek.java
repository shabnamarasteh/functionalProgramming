package com.test.functional.stream.intermediateOperation;

import com.test.functional.stream.Person;

import java.util.ArrayList;
import java.util.List;

public class Peek {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Jack"));
        people.add(new Person("Martin"));
        people.add(new Person("Ramin"));
        people.stream().peek(person -> System.out.println("The Value passed :"+person.getFirstName() ))
                .filter(person -> !"Martin".equals(person.getFirstName()
                ))
                .forEach(person -> System.out.println(person));
    }
}
