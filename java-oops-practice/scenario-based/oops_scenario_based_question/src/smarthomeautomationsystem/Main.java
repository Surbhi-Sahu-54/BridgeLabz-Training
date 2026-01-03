package smarthomeautomationsystem;

public class Main {
    public static void main(String[] args) {

        Controllable light = new Light();
        Controllable fan = new Fan(120);
        Controllable ac = new AC(1800);

        UserController controller = new UserController();

        controller.operateDevice(light, true);
        controller.operateDevice(fan, true);
        controller.operateDevice(ac, true);

        System.out.println("------------------");

        controller.operateDevice(light, false);
        controller.operateDevice(ac, false);
    }
}
