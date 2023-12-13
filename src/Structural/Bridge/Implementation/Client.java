package Structural.Bridge.Implementation;

public class Client {
    public static void testDevice(Device device){
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.volumeUp();
        basicRemote.volumeDown();
    }
    public static void main(String[] args) {
        testDevice(new Radio());
        testDevice(new TV());
    }
}
