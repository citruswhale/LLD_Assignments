import PricingComponents.PricingComponents.AddOnPricingComponents.GymAddOnPricingComponent;
import PricingComponents.PricingComponents.AddOnPricingComponents.LaundryAddOnPricingComponent;
import PricingComponents.PricingComponents.AddOnPricingComponents.MessAddOnPricingComponent;
import PricingComponents.PricingComponents.RoomPricingComponents.DoubleRoomPricingComponent;
import PricingComponents.PricingComponents.RoomPricingComponents.SingleRoomPricingComponent;
import PricingComponents.PricingComponents.RoomPricingComponents.TripleRoomPricingComponent;


public class PricingComponentUtil {
    public static void makeRoomPricingComponentsList(PricingManager pricingManager) {
        pricingManager.addRoomPricingComponent(LegacyRoomTypes.SINGLE, new SingleRoomPricingComponent());
        pricingManager.addRoomPricingComponent(LegacyRoomTypes.DOUBLE, new DoubleRoomPricingComponent());
        pricingManager.addRoomPricingComponent(LegacyRoomTypes.TRIPLE, new TripleRoomPricingComponent());
    }
    public static void makeAddOnPricingComponentsList(PricingManager pricingManager) {
        pricingManager.addAddOnPricingComponent(AddOn.MESS, new MessAddOnPricingComponent());
        pricingManager.addAddOnPricingComponent(AddOn.LAUNDRY, new LaundryAddOnPricingComponent());
        pricingManager.addAddOnPricingComponent(AddOn.GYM, new GymAddOnPricingComponent());
    }
}
