import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Hostel Fee Calculator ===");
        BookingRequest req = new BookingRequest(LegacyRoomTypes.DOUBLE, List.of(AddOn.LAUNDRY, AddOn.MESS));
        PricingManager pricingManager = new PricingManager();
        PricingComponentUtil.makeAddOnPricingComponentsList(pricingManager);
        PricingComponentUtil.makeRoomPricingComponentsList(pricingManager);
        HostelFeeCalculator calc = new HostelFeeCalculator(new FakeBookingRepo(), pricingManager);
        calc.process(req);
    }
}
