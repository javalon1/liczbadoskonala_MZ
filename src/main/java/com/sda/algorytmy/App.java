package com.sda.algorytmy;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

    Scanner sk = new Scanner(System.in);
    int x = sk.nextInt();

    int sumaDzielenia = 0;
    int i = 1;

        while (i <= x/2) {

            if (x % i == 0) {
                sumaDzielenia = sumaDzielenia + i;
            }
            i = i + 1;

        }
        if (x == sumaDzielenia) {
            System.out.println(x + " " + "Jest liczba doskonala.");

        } else {
            System.out.println(x + " " + "Nie jest liczba doskonala.");
        }
    }

}
