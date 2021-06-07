package com.test.functional.lambda;

public class Generic {
    @FunctionalInterface
    public interface Appender<T> {
        T append(T str1, T str2);
    }

    public interface Function<T,R>{
        R append(T str1, T str2);
    }
    public static void main(String[] args) {
        Appender<String> appender = (x, y) -> x + " " + y;

        appender.append("Hello", "How Are You?");
        Function<String, Long> function = ((str1, str2) -> 12L);
    }
}
