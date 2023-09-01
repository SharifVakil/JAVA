package com.company;

import java.util.Scanner;

public class cwh_13_strings {
    public static void main(String[] args) {
//    String name = new String("Harry");
//    String name ="Harry";/
//    System.out.println("The name is: ");
////    System.out.print(name);
    int a = 6;
    float b = 5.6454f;
//    System.out.printf("The value of a is %d and value of b is %f" , a, b);
    System.out.printf("The value of a is %d and value of b is %8.2f" , a, b);
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(st);
    }
}