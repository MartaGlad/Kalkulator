package com.kodilla;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("10 + 20 = " +calculator.add(10, 20));
        System.out.println("10 - 20 = " +calculator.subtract(10, 20));
    }
}

