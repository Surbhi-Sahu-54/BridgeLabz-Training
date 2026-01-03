package smarthomeautomationsystem;

class Light extends Appliance {

    Light() {
        super(60); // default power usage
    }

    public void turnOn() {
        setOn(true);
        displayStatus("Light");
    }

    public void turnOff() {
        setOn(false);
        displayStatus("Light");
    }
}
