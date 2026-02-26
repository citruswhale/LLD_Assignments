package PricingComponents.PricingComponents.AddOnPricingComponents;

import PricingComponents.PricingComponents.Prices;
import PricingComponents.PricingComponents.PricingComponent;

public class GymAddOnPricingComponent implements PricingComponent {
    @Override
    public double price() {
        return Prices.gymAddOnPrice;
    }
}
