package smarthomeautomationsystem;

class Fan extends Appliance {

    Fan(int powerUsage) {
        super(powerUsage); // user-defined setting
    }

    public void turnOn() {
        setOn(true);
        displayStatus("Fan");
    }

    public void turnOff() {
        setOn(false);
        displayStatus("Fan");
    }
}
