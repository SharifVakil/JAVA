package com.company;
class Myemployee{
   private int id;
    private String name;
    public String getName(){
        return name;
    }
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
public class cwh_40_ch_9 {
    public static void main(String[] args) {
      Myemployee harry = new Myemployee();
     // harry.id = 45;
     // harry.name = "codeWithHarry";--> Throws an error due to private access modifier
        harry.setName("codeWithHarry");
        System.out.println(harry.getName());
        harry.setId(234);
        System.out.println(harry.getId());

    }
}
