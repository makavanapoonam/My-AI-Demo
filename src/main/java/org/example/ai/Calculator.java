package org.example.ai;

@FunctionalInterface
public interface Calculator {

    int add(int a, int b);

    default void info() {
        System.out.println("calculator demo");
    }
}
