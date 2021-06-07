package com.test.functional.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class _Optional {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Jack"));
        people.add(new Person("Martin"));
        people.add(new Person("Ramin"));
        Optional<Person> jack = findPersonByFirstName("Jack", people);
        if(jack.isPresent()){
            System.out.println(jack.get());
        }
        Optional<Person> joe = findPersonByFirstName("Joe", people);
        System.out.println(joe.orElse(new Person("Joe")));
        joe.orElseThrow(IllegalArgumentException::new);
    }

    public static Optional<Person> findPersonByFirstName(String firstName, List<Person> people){
        for (Person p : people){
            if(firstName.equals(p.getFirstName())){
                return Optional.of(p);
            }
        }
        return Optional.empty();
    }


}
