package com.company;

abstract class Parent2{
    public Parent2(){
        System.out.println("Mai base2 ka constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class Child2 extends Parent2 {
    public void greet() {
        System.out.println("Good Morning");
    }

    public void greet2() {
        System.out.println("Good Afternoon");
    }
}
 abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("I am good");
    }
}

public class cwh_53_abstract {
    public static void main(String[] args) {
//            Parent2 p = new Parent2();n  -- error
            Child2 c = new Child2();
//            Child3 c3 = new child3(); -- error

        }
    }

