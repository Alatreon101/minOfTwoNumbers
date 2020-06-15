package com.dragon;

import java.util.Scanner;

/*
 *
 */

public class TwoNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число.");
        int firstNumber = sc.nextInt();
        System.out.println("Введите второе число.");
        int secondNumber = sc.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println(secondNumber + " - меньше чем первое!");
        } else if (firstNumber < secondNumber) {
            System.out.println(firstNumber + " - меньше чем второе!");
        } else {
            System.out.println("Данные числа равны!");
        }

    }
}
