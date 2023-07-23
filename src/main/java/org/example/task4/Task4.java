package org.example.task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string;
        System.out.println("Введите НЕ пустую строку: ");
        string = scan.nextLine();
        isEmptyString(string);
    }

    private static void isEmptyString(String string) {
        if (string.isBlank()){
            throw new RuntimeException("Пустые строки вводить нельзя!");
        }
    }

}
