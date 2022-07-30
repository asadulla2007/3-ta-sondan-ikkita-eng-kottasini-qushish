package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(in);

        int a =scanner.nextInt();

        int b = scanner.nextInt();

        int c = scanner.nextInt();

        if (a > b && a > c) {
            System.out.println(a);
        }
        if (b > a && b > c) {
            System.out.println(b);
        }
        if (a > b && a>c) {
            System.out.println(a);
        }
        if (b > a && b< c ) {
            System.out.println(b);
        }
        if (c>a&& c<b) {
            System.out.println(c);
        }









        System.out.println( a + b + c);

    }
}
