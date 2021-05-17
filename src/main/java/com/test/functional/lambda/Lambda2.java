package com.test.functional.lambda;

public class Lambda2 {
    public static void main(String[] args) {
        Lambda2 lambda2 = new Lambda2();
        //lambda2.method((str, str2) -> str+str2);
        //1
        lambda2.method((AggregationInterface) (x, y) -> x + y);
        //2
        AggregationInterface aggregationInterface = (x, y) -> x + y;
        lambda2.method(aggregationInterface);
    }

    public void method(ConcatInterface concatInterface) {
        concatInterface.concat("hi", "how are you?");
    }

    public void method(AggregationInterface aggregationInterface) {
        aggregationInterface.sum(2, 3);
    }

    @FunctionalInterface
    interface ConcatInterface {
        String concat(String str, String str2);
    }

    @FunctionalInterface
    interface AggregationInterface {
        int sum(int x, int y);
    }
}
