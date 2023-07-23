package org.example.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("input() = " + input());
    }

    public static float input(){
        float number = 0;
        String in;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите дробное число: ");
        in = scan.nextLine();
        while (!isFloat(in)){
            System.out.println("Вы ввели не дробное число, введите еще раз: ");
            in = scan.nextLine();
        }
        number = Float.parseFloat(in);
        return number;
    }

    public static boolean isFloat(String str) {
        try {
            Float.parseFloat(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}