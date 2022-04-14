package ru.skypro;

import java.util.Arrays;

public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        // Задание 1
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int all = 0; all < arr.length; all++) {
            sum += arr[all];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        // Задание 2

        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) ;
            {
                min = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");


        // Задание 3

        double average = 0;
        for (double d : arr) {
            average += d;
        }
        System.out.println("Средняя сумма трат за 30 дней " + average / arr.length);

        // Задание 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int size = reverseFullName.length;
        for (int i = 0; i < size/2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[size - 1 - i];
            reverseFullName[size - 1 - i] = temp;
        }
        System.out.print(reverseFullName);

    }

        }






