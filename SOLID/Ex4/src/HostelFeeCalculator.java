public class HostelFeeCalculator {
    private final FakeBookingRepo repo;
    private final PricingManager pricingManager;

    public HostelFeeCalculator(FakeBookingRepo repo, PricingManager pricingManager) {
        this.repo = repo;
        this.pricingManager = pricingManager;
    }

    public void process(BookingRequest req) {
        Money monthly = pricingManager.calculateMonthly(req);
        Money deposit = new Money(5000.00);

        ReceiptPrinter.print(req, monthly, deposit);

        String bookingId = IdUtil.generate();
        repo.save(bookingId, req, monthly, deposit);
    }
}
