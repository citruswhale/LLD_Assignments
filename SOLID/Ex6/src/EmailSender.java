public class EmailSender extends NotificationSender {
    public EmailSender(AuditLog audit) {
        super(audit);
    }

    @Override
    protected void validate(Notification n) {
        if (n.email == null) {
            throw new IllegalArgumentException("email required");
        }
    }

    @Override
    protected void doSend(Notification n) {
        String msg = "EMAIL -> to=" + n.email + " subject=" + n.subject + " body=" + n.body;
        ConsolePreview.preview(msg);
    }

    @Override
    protected String channelName() {
        return "email";
    }
}
