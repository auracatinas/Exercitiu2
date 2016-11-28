package com.company;

/*Read numbers from the keyboard and
       a. Print the on the screen until you read an odd number
       b. And count how many you read until you read an even number
       c. Sum them until you read a number that can be divided by 5. Print the resulting sum*/

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        //punctA();
        //punctB();
        punctC();
    }

    public static void punctA() {
        // punct a

        int N;
        int rest;
        //prima citire
        System.out.print("Dati numarul : ");
        N = new Scanner(System.in).nextInt();
        rest = N % 2;

        while (rest == 0) {
            System.out.println(N);

            System.out.print("Dati numarul : ");
            N = new Scanner(System.in).nextInt();

            rest = N % 2;

        }
    }

    public static void punctB() {
        // punct b

        int N;
        int rest;
        //prima citire
        System.out.print("Dati numarul : ");
        N = new Scanner(System.in).nextInt();
        rest = N % 2;
        int count = 0;
        while (rest == 1) {
            count++;
            System.out.println(N);

            System.out.print("Dati numarul : ");
            N = new Scanner(System.in).nextInt();

            rest = N % 2;


        }
        System.out.print(" count = " + count);
    }

    public static void punctC() {
        // punct b

        int N;
        int rest;
        //prima citire
        System.out.print("Dati numarul : ");
        N = new Scanner(System.in).nextInt();
        rest = N % 5;
        int sum = N;
        while (rest != 0 ) {
            System.out.println(N);
            System.out.print("Dati numarul : ");
            N = new Scanner(System.in).nextInt();
            rest = N % 5;
            sum= sum+N;
        }
        System.out.print(" sum = " + sum);
    }
}