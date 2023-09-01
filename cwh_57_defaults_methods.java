package com.company;
interface MyCamera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4kvideo() {
        greet();
        System.out.println("Recording in 4k..." );
    }

}
interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone{
    void callNumber(int phonenumber){
        System.out.println("Calling"+ phonenumber);
    } void pickCall(){
        System.out.println("Connecting...");
    }

}
class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
       public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Taking snap");
    }
    public void record4kVideo(){
        System.out.println("Taking snap and recording in 4k");
    }
    public String[] getNetworks(){
        System.out.println("Getting list of Networks");
        String[] networkList= {"Harry", "Prashanth", "Anjali5G"};
        return networkList;
    }
public void connectToNetwork(String network){
    System.out.println("Connecting to "+ network);

  }
}
public class cwh_57_defaults_methods {
    public static void main(String[] args) {
        MySmartPhone ms= new MySmartPhone();
        ms.record4kvideo();
      //  ms.greet();  --> Throws an error!
        String[] ar = ms.getNetworks();
        for (String item: ar){
            System.out.println(item);
        }
    }
}
