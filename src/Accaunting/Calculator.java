package Accaunting;

import java.math.BigDecimal;
import java.util.Scanner;

import java.math.BigDecimal;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal a = scanner.nextBigDecimal();
        String formula = scanner.next();
        BigDecimal b = scanner.nextBigDecimal();

        BigDecimal result;

        if (formula.equals("*")) {
            result = a.multiply(b);
        } else if (formula.equals("/")) {
            result = a.divide(b);
        } else if (formula.equals("+")) {
            result = a.add(b);
        } else if (formula.equals("-")) {
            result = a.subtract(b);
        } else {
            System.out.println("Invalid formula");
            return;
        }
        System.out.println("Result: " + result);
    }
}

