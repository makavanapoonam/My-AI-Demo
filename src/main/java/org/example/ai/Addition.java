package org.example.ai;

public class Addition {

    public static void main(String args[]) {

        Calculator calculator = (int a, int b) -> a + b;

        int result = calculator.add(5, 3);

        System.out.println(result);
        calculator.info();

    }
}
