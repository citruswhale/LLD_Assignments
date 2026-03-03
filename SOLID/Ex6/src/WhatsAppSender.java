public class WhatsAppSender extends NotificationSender {

    public WhatsAppSender(AuditLog audit) {
        super(audit);
    }

    @Override
    protected void validate(Notification n) {
        if (n.phone == null || !n.phone.startsWith("+")) {
            throw new IllegalArgumentException("phone must start with + and country code");
        }
    }

    @Override
    protected void doSend(Notification n) {
        String msg = "WA -> to=" + n.phone + " body=" + n.body;
        ConsolePreview.preview(msg);
    }

    @Override
    protected String channelName() {
        return "wa";
    }
}
