package home1;

import java.time.LocalTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {
/*1. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int
 длиной len, каждая ячейка которого равна initialValue;*/
        ex1();
        //ex2();
        //ex3();
        //ex4();

    }

    private static void ex1() {
        int[] arr = new int[3];
        Arrays.fill(arr, 4);

        System.out.println(Arrays.toString(arr));

    }


    /*2. Задать одномерный массив и найти в нем минимальный и максимальный элементы ;*/

    private static void ex2() {
        int[] arr = new int[]{8, 91, 0, 5, 103, -7};
        int maxValue = 0;
        for (int i : arr) {
            if (i > maxValue) {
                maxValue = i;
            }

        }
        System.out.println(maxValue);

    }


/*4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы
одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];*/
    private static void ex3() {
        int[][] array = new int[4][4];

        for (int i = 0; i < array.length; i ++) {
            for (int j = 0; j < array[i].length; j ++) {
                array[i][i] = 1;
            }
        }
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }

/*4. В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
"Доброе утро, <Имя>!", если время от 05:00 до 11:59
"Добрый день, <Имя>!", если время от 12:00 до 17:59;
"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
"Доброй ночи, <Имя>!", если время от 23:00 до 4:59*/

    private static void ex4() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите имя пользователя: ");
        String name = iScanner.nextLine();

        LocalTime curTime = LocalTime.now();
        LocalTime morningTime = LocalTime.of(11, 59);
        LocalTime dayTime = LocalTime.of(17, 59);
        LocalTime eveningTime = LocalTime.of(22, 59);
        LocalTime night = LocalTime.of(4, 59);

        if (curTime.isBefore(morningTime)) {
            System.out.println("Доброе утро");
        }
        if (curTime.isBefore(dayTime)) {
            System.out.println("Добрый день");
        }
        if (curTime.isBefore(eveningTime)) {
            System.out.println("Добрый вечер");
        } else {
            System.out.println("Доброй ночи");
        }

            System.out.println("Current time of the day: " + curTime);

            System.out.printf("Привет, %s!%n", name);
        }


    }



