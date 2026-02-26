package PricingComponents.PricingComponents.RoomPricingComponents;

import PricingComponents.PricingComponents.Prices;
import PricingComponents.PricingComponents.PricingComponent;

public class DoubleRoomPricingComponent implements PricingComponent {
    @Override
    public double price() {
        return Prices.doubleRoomPrice;
    }
}
