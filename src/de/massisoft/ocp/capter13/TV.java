package de.massisoft.ocp.capter13;

public class TV implements Device {
    private int channel = 1;

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getChannel() {
        return this.channel;
    }

    @Override
    public void reset() {
        this.channel = 0;
    }

}