public class SmsSender extends NotificationSender {
    public SmsSender(AuditLog audit) {
        super(audit);
    }

    @Override
    protected void validate(Notification n) {
        if (n.phone == null) {
            throw new IllegalArgumentException("phone required");
        }
    }

    @Override
    protected void doSend(Notification n) {
        String msg = "SMS -> to=" + n.phone + " body=" + n.body;
        ConsolePreview.preview(msg);
    }

    @Override
    protected String channelName() {
        return "sms";
    }
}
