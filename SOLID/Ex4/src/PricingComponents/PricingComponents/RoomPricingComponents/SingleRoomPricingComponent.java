package PricingComponents.PricingComponents.RoomPricingComponents;

import PricingComponents.PricingComponents.Prices;
import PricingComponents.PricingComponents.PricingComponent;

public class SingleRoomPricingComponent implements PricingComponent {
    @Override
    public double price() {
        return Prices.singleRoomPrice;
    }
}
