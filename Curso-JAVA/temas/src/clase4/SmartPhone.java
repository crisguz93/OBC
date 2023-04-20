package clase4;

public class SmartPhone extends SmartDevice {
    private int batteryLife;
    private int storage;

    public SmartPhone() {
    }

    public SmartPhone(String brand, String model, double price, int batteryLife, int storage) {
        super(brand, model, price);
        this.batteryLife = batteryLife;
        this.storage = storage;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }
}