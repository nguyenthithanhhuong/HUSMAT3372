package oop.lab11.bridge.ex2;

public class Tv implements Device {
    private boolean state;
    private int volume;
    private int channel;

    @Override
    public boolean isEnable() {
        return this.state;
    }

    @Override
    public void enable() {
        this.state = true;
    }

    @Override
    public void disable() {
        this.state = false;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void setVolume(int percent) {
        this.volume = percent;
    }

    @Override
    public int getChannel() {
        return this.channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }
}
