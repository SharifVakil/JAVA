package com.company;


interface Bicycle{
    int a = 45;
    void applyBreak(int decrement);
    void speedUp (int increment);
}
interface HornBicycle{
    void blowHornk3g();
    void blowHornmhn();
}

class AvonCycle implements Bicycle , HornBicycle{
    void blowHorn (){
        System.out.println("Pee Pee Poo Poo");
    }
  public void applyBreak (int decrement ){
        System.out.println("Applying Brake");
    }
    public void speedUp (int increment){
        System.out.println("Applying SpeedUP");
    }
   public void blowHornk3g(){
        System.out.println("Kabhi Khushi Kabhi gum pee pee pee pee");
    }
    public void blowHornmhn() {

        System.out.println("Main Hoon naa poo poo poo poo");
    }
}
public class cwh_55_abstractclassvsInterfaceclass {
    public static void main(String[] args) {
        AvonCycle cycleHarry = new AvonCycle();
        cycleHarry.applyBreak(1);
        //you can create properties in Interfaces
        System.out.println(cycleHarry.a);
        // you cannot modify the properties in Interfaces as they are final
//        cycleHarry.a = 454;
       // System.out.println(cycleHarry.a);

        cycleHarry.blowHornk3g();
        cycleHarry.blowHornmhn();
    }
}
