package smarthomeautomationsystem;

class UserController {

    public void operateDevice(Controllable device, boolean turnOn) {
        if (turnOn) {
            device.turnOn();
        } else {
            device.turnOff();
        }
    }
}
