package com.company;
import java.util.Scanner;

public class cwh_11_ex1_sol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Physics marks: ");
        int physics = sc.nextInt();
        System.out.println("Enter your English marks: ");
        int English = sc.nextInt();
        System.out.println("Enter your Chemistry marks: ");
        int Chemistry = sc.nextInt();
        System.out.println("Enter your Mathematics marks: ");
        int Mathematics = sc.nextInt();
        System.out.println("Enter your Computer Science marks: ");
        int ComputerScience  = sc.nextInt();
        float percentage = ((physics+English+Chemistry+Mathematics+ComputerScience)/500.0f)*100;
        System.out.println("percentage : ");
        System.out.println(percentage);
    }

}
