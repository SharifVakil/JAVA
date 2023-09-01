package com.company;

class Practise13 extends Thread {
    public void run() {
        while (true) {
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Good Morning!");
        }
    }
}
class Practise13b extends Thread {
    public void run() {
//        while (true) {
//
//            System.out.println("Welcome");
//        }
    }
}
public class cwh_76_practise13 {
    public static void main(String[] args) {
        Practise13 p1 = new Practise13();
        Practise13b p2 = new Practise13b();
//        p1.setPriority(6);
//        p2.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        System.out.println(p2.getState());
//        p1.start();
        p2.start();
        System.out.println(p2.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
