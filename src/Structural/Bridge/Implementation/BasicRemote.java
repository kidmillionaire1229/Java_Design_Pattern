package Structural.Bridge.Implementation;

/**
 * Abstraction
 * 상위 수준의 제어 논리 제공
 * Implementation 객체에 의존하여 실제 하위 수준의 작업을 수행한다.
 */
public class BasicRemote {
    protected Device device;

    public BasicRemote(Device device) {
        this.device = device;
    }

    public void volumeDown(){
        int current = device.getVolume();
        device.setVolume(current-10);
    }

    public void volumeUp(){
        int current = device.getVolume();
        device.setVolume(current+10);
    }

}
