package com.company;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in_case = new Scanner(System.in);
        System.out.println("Введите номер задания (от 1 до 3): ");
        int a;
        do {
            a = in_case.nextInt();
            switch (a) {
                case 0:
                    break;
                case 1:
                    Task1();
                    break;
                case 2:
                    Task2();
                    break;
                case 3:
                    Task3();
                    break;
                default:
                    System.out.println("Неверное число, введите номер задания (от 1 до 3): ");
                    break;
            }
        }
        while ( (a < 1 | a > 3) && a!=0);
    }

    public static void Task1(){
        Scanner in_num = new Scanner(System.in);
        System.out.println("Введите число");
        int num = in_num.nextInt();
        if (num > 7)
            System.out.println("Привет");
        return;
    }

    public static void Task2(){
        Scanner in_name = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = in_name.next();
        if (Objects.equals(name, "Вячеслав"))
            System.out.println("Привет, " + name);
        return;
    }

    public static void Task3(){
        int[] arr = {0,1,2,3,4,5,6,7,8,9,12,40,42};
        System.out.println("Массив:" + Arrays.toString(arr));
        System.out.println("Числа в массиве, кратные 3:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0)
                System.out.print(arr[i] + " ");
        }
        return;
    }
}
