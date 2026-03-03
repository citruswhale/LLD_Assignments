import java.util.*;

public class DeviceRegistry {
    private final List<Object> devices = new ArrayList<>(); // Keep generic ArrayList for diversied devices

    public void add(Object d) { devices.add(d); } // Allow adding any type of device

    public <T> T getFirstWithAll(List<Class<?>> capabilities) {
        for (Object d : devices) {
            boolean matches = true;

            for (Class<?> cap : capabilities) {
                if (!cap.isInstance(d)) {
                    matches = false;
                    break;
                }
            }

            if (matches) {
                return (T) d;
            }
        }

        throw new IllegalStateException("No device supports all required capabilities");
    }
}
