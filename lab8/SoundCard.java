package lab8;
public class SoundCard {
    private int channels;
    private int sampleRate;
    private String brand;
    private String interfce;
    public SoundCard(int channels, int sampleRate, String brand, String interfce) {
        this.channels = channels;
        this.sampleRate = sampleRate;
        this.brand = brand;
        this.interfce = interfce;
    }
    public void printInfo() {
        System.out.println("--- SoundCard Info ---");
        System.out.println("Channels: " + channels);
        System.out.println("Sample Rate: " + sampleRate + "kHz");
        System.out.println("Brand: " + brand);
        System.out.println("Interface: " + interfce);
    }
}

