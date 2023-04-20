package clase4;

public class SmartWatch extends SmartDevice {
    private boolean hasGPS;
    private String color;

    public SmartWatch() {
    }

    public SmartWatch(String brand, String model, double price, boolean hasGPS, String color) {
        super(brand, model, price);
        this.hasGPS = hasGPS;
        this.color = color;
    }

    public boolean isHasGPS() {
        return hasGPS;
    }

    public void setHasGPS(boolean hasGPS) {
        this.hasGPS = hasGPS;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
