package com.company;

class MyMainemployee{
    private int id;
    private String name;

    public MyMainemployee(){
        id = 0;
        name = "Your-Name-Here";
    }
    public MyMainemployee(String myName, int myId){
        id = myId;
        name = myName;
    }
    public MyMainemployee(String myName){
        id = 1;
        name = myName;
    }
    public String getName(){return name;}
    public void setName (String n){
        this.name =n;
    }
    public void setId(int i){
        this.id= i;
    }
    public int getId(){
        return id;
    }
}
public class cwh_42_constructors {
    public static void main(String[] args) {
//        MyMainemployee harry= new MyMainemployee("ProgrammingWithHarry",12);
        MyMainemployee harry= new MyMainemployee();
//        harry.setName("codeWithHarry");
//        harry.setId(34);
        System.out.println(harry.getId());
        System.out.println(harry.getName());
    }
}
