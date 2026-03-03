import java.util.List;

public class ClassroomController {
    private final DeviceRegistry reg;

    public ClassroomController(DeviceRegistry reg) { this.reg = reg; }

    public void startClass() {
        Projector projector = reg.getFirstWithAll(List.of(PowerControllable.class, InputConnectable.class));
        projector.powerOn();
        projector.connectInput("HDMI-1");

        BrightnessControllable lights = reg.getFirstWithAll(List.of(PowerControllable.class, BrightnessControllable.class));
        lights.setBrightness(60);

        TemperatureControllable ac = reg.getFirstWithAll(List.of(PowerControllable.class, TemperatureControllable.class));
        ac.setTemperatureC(24);

        AttendanceScannable scan = reg.getFirstWithAll(List.of(AttendanceScannable.class));
        System.out.println("Attendance scanned: present=" + scan.scanAttendance());
    }

    public void endClass() {
        System.out.println("Shutdown sequence:");
        ((PowerControllable)reg.getFirstWithAll(List.of(PowerControllable.class, InputConnectable.class))).powerOff();
        ((PowerControllable)reg.getFirstWithAll(List.of(PowerControllable.class, BrightnessControllable.class))).powerOff();
        ((PowerControllable)reg.getFirstWithAll(List.of(PowerControllable.class, TemperatureControllable.class))).powerOff();
    }
}
