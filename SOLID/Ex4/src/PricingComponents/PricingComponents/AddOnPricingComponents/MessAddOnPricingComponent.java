package PricingComponents.PricingComponents.AddOnPricingComponents;

import PricingComponents.PricingComponents.Prices;
import PricingComponents.PricingComponents.PricingComponent;

public class MessAddOnPricingComponent implements PricingComponent {
    @Override
    public double price() {
        return Prices.messAddOnPrice;
    }
}
