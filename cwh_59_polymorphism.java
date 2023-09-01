package com.company;

interface MyCamera2{
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
interface MyWifi2{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone2{
    void callNumber(int phonenumber){
        System.out.println("Calling"+ phonenumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }

}
class MySmartPhone2 extends MyCellPhone2 implements MyWifi2, MyCamera2{
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
    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }
        public void sampleMeth() {
            System.out.println("Meth");
        }
    }

public class cwh_59_polymorphism {
    public static void main(String[] args) {
        MyCamera2 cam1 = new MySmartPhone2();// This is a smartphone but use it as a camera.
//        cam1.getNetworks(); --> Not Allowed
//        cam1.sampleMeth();--> Not Allowed
        cam1.record4kvideo();
        MySmartPhone2 s = new MySmartPhone2();
        s.sampleMeth();
        s.recordVideo();
        s.getNetworks();
        s.callNumber(7979);
        }
}