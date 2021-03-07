package com.knoldus;

import java.util.Scanner;
import java.util.function.LongUnaryOperator;

public class LongEvenNumber {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        long input = scanner.nextLong();
        LongUnaryOperator longUnaryOperator = x -> x + 2 - (x % 2);
        long result = longUnaryOperator.applyAsLong(input);
        System.out.println(result);
    }
}
