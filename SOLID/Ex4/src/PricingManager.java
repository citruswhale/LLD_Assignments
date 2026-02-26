import PricingComponents.PricingComponents.PricingComponent;

import java.util.HashMap;
import java.util.Map;
import PricingComponents.PricingComponents.Prices;

public class PricingManager {
    Map<Integer, PricingComponent> roomPricingComponents;
    Map<AddOn, PricingComponent> addOnPricingComponents;

    public PricingManager() {
        roomPricingComponents = new HashMap<>();
        addOnPricingComponents = new HashMap<>();
    }

    public void addRoomPricingComponent(Integer roomType, PricingComponent PricingComponent) {
        roomPricingComponents.put(roomType, PricingComponent);
    }

    public void addAddOnPricingComponent(AddOn addOn, PricingComponent PricingComponent) {
        addOnPricingComponents.put(addOn, PricingComponent);
    }

    public Money calculateMonthly(BookingRequest req) {
        double base = (roomPricingComponents.containsKey(req.roomType)?
                roomPricingComponents.get(req.roomType).price():
                Prices.defaultRoomPrice);

        double add = 0.0;
        for (AddOn a : req.addOns) {
            add += addOnPricingComponents.get(a).price();
        }

        return new Money(base + add);
    }
}
