package Bridge;

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
