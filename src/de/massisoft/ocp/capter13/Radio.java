package de.massisoft.ocp.capter13;

public class Radio implements Device {
    private double frequency = 1.1;

    public void setFrequency(int freq) {
        this.frequency = freq;
    }

    public double getFrequency() {
        return this.frequency;
    }

    @Override
    public void reset() {
        this.frequency = 0.0;
    }
}