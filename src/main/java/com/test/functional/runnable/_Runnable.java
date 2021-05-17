package com.test.functional.runnable;

public class _Runnable {
    public static void main(String[] args) {
        //Runnable Interface With lambda Expression
        Runnable helloWorld = () -> System.out.println("HelloWorld");
        helloWorld.run();

        //Runnable Interface with anonymous class
        Runnable threadAnonymous = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1 start");
            }
        };

        Runnable threadLambda = () -> System.out.println("Thread 2 Start");
        threadAnonymous.run();
        threadLambda.run();
    }
}
