package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int firstNumber, secondNumber;
        String action;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please. enter the first integer number:");
        firstNumber = scanner.nextInt();
        System.out.println("Please. enter the math operand (+, -, * , /)");
        action = scanner.next();
        System.out.println("Please. enter the second integer number:");
        secondNumber = scanner.nextInt();

        switch (action) {
            case "+":
                System.out.println("The result is: " + (firstNumber + secondNumber));
                break;
            case "-":
                System.out.println("The result is: " + (firstNumber - secondNumber));
                break;
            case "*":
                System.out.println("The result is: " + (firstNumber * secondNumber));
                break;
            case "/":
                if (secondNumber!=0) {
                    System.out.println("The result is: " + ((float) firstNumber / secondNumber));
                } else{
                    System.out.println("!!! ERROR !!! Division by zero!!!!");
                }
                break;
            default:
                System.out.println("Нou entered an incorrect math operand!");
        }
    }
}
