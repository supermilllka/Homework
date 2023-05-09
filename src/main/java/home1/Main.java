package home1;

import java.time.LocalTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {
/*1. �������� �����, ����������� �� ���� ��� ���������: len � initialValue, � ������������ ���������� ������ ���� int
 ������ len, ������ ������ �������� ����� initialValue;*/
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


    /*2. ������ ���������� ������ � ����� � ��� ����������� � ������������ �������� ;*/

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


/*4. ������� ���������� ��������� ������������� ������ (���������� ����� � �������� ����������), � � ������� �����(-��)
��������� ��� ������������ �������� ��������� (����� ������ ���� �� ����������, ���� ��� ������). ���������� ��������
����� �� ���������� ����� �� ���������� ��������: ������� ����� ��������� �����, �� ���� [0][0], [1][1], [2][2], �, [n][n];*/
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

/*4. � ������� ��������� ��� ������������. � ����������� �� �������� �������, ������� ����������� ����:
"������ ����, <���>!", ���� ����� �� 05:00 �� 11:59
"������ ����, <���>!", ���� ����� �� 12:00 �� 17:59;
"������ �����, <���>!", ���� ����� �� 18:00 �� 22:59;
"������ ����, <���>!", ���� ����� �� 23:00 �� 4:59*/

    private static void ex4() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("������� ��� ������������: ");
        String name = iScanner.nextLine();

        LocalTime curTime = LocalTime.now();
        LocalTime morningTime = LocalTime.of(11, 59);
        LocalTime dayTime = LocalTime.of(17, 59);
        LocalTime eveningTime = LocalTime.of(22, 59);
        LocalTime night = LocalTime.of(4, 59);

        if (curTime.isBefore(morningTime)) {
            System.out.println("������ ����");
        }
        if (curTime.isBefore(dayTime)) {
            System.out.println("������ ����");
        }
        if (curTime.isBefore(eveningTime)) {
            System.out.println("������ �����");
        } else {
            System.out.println("������ ����");
        }

            System.out.println("Current time of the day: " + curTime);

            System.out.printf("������, %s!%n", name);
        }


    }



