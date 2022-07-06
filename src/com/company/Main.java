package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String newWord = ("Мой возраст и имя:");
        final int NUM = 13;
        String word = (", Илим");
        System.out.println(newWord + NUM + word);
        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else System.out.println("Вы сохранили ноль");
        Scanner s = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String string = s.nextLine();
        System.out.println("Здраствуйте " + string);


    }

}
