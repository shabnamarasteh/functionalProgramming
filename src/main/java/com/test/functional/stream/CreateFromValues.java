package com.test.functional.stream;

import java.util.Date;
import java.util.stream.Stream;

public class CreateFromValues {
    public static void main(String[] args) {
        Stream.of(new Date()).map(date -> date.getTime()).map(aLong -> Long.valueOf(aLong).toString()).toArray();
        Stream.of(1, 2, 3).map(integer -> integer.toString()).toArray();
        Stream.builder().add("String").add(656);
        //if need to specify input, Define stream generic
        Stream.Builder<String> builder = (Stream.Builder<String>) Stream.<String>builder().add("test").build();
    }
}
