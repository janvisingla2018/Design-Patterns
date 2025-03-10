public class TextMessage extends Message {

    TextMessage(MessageSender sender) {
        super(sender);
    }

    @Override
    void send(String message) {
        sender.sendMessage(message);
    }
}
