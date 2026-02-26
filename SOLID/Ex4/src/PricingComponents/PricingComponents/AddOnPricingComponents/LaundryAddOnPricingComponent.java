package PricingComponents.PricingComponents.AddOnPricingComponents;

import PricingComponents.PricingComponents.Prices;
import PricingComponents.PricingComponents.PricingComponent;

public class LaundryAddOnPricingComponent implements PricingComponent {
    @Override
    public double price() {
        return Prices.laundryAddOnPrice;
    }
}
