package com.company;

import java.util.Scanner;

public class CWH_06_ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of physics: ");
        float physics = sc.nextFloat();
        System.out.println("Enter marks of mathematics: ");
        float mathematics = sc.nextFloat();
        System.out.println("Enter marks of chemistry: ");
        float chemistry = sc.nextFloat();
        System.out.println("Enter marks of social science: ");
        float socialscience = sc.nextFloat();
        System.out.println("Enter marks of physical education ");
        float physicaleducation = sc.nextFloat();
        float percentage = (physics+chemistry+mathematics+socialscience+physicaleducation)/500*100;
        System.out.println("Total percentage of sharif is: ");
        System.out.println(percentage);
    }
}
