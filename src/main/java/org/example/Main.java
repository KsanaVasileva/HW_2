package org.example;

public class Main {

    // 1. Необходимо вывести на экран числа от 1 до 10. На экране должно быть:
    //1 2 3 4 5 6 7 8 9 10
    public static void printNumbersFrom1To10() {
        System.out.println("Необходимо вывести на экран числа от 1 до 10");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // 2. Необходимо вывести на экран числа от 10 до 5. На экране должно быть:
    //10 9 8 7 6 5
    public static void printNumbersFrom10To5() {
        System.out.println(" Необходимо вывести на экран числа от 10 до 5");
        int i = 10;
        do {
            System.out.print(i + " ");
            i--;
        } while (i >= 5);
        System.out.println();
    }

    // 3.    Необходимо вывести на экран таблицу умножения на 3:
    public static void printMultiplicationTableBy3() {
        System.out.println("Таблица умножения на 3");
        for (int i = 1; i <= 10; i++) {
            int res = 3 * i;
            System.out.println("3*" + i + "=" + res);
        }
    }
    public static void main(String[] args) {
        printNumbersFrom1To10();
        printNumbersFrom10To5();
        printMultiplicationTableBy3();
     }
}

