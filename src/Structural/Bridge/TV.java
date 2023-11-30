package Structural.Bridge;

public class TV implements Device{
    private int volume = 30;
    @Override
    public void setVolume(int percent) {
        volume = volume * (percent/100);
    }

    @Override
    public int getVolume() {
        return this.volume;
    }
}
