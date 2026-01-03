package smarthomeautomationsystem;

class AC extends Appliance {

    AC(int powerUsage) {
        super(powerUsage);
    }

    public void turnOn() {
        setOn(true);
        displayStatus("AC");

        if (getPowerUsage() > 1500) {
            System.out.println("⚠ High power consumption detected!");
        }
    }
    public void turnOff() {
        setOn(false);
        displayStatus("AC");
    }
}
