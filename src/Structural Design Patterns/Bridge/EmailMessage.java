public class EmailMessage extends Message {

    EmailMessage(MessageSender sender) {
        super(sender);
    }

    @Override
    void send(String message) {
        sender.sendMessage(message);
    }
}
