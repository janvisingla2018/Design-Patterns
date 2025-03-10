public class WhatsAppSender implements MessageSender{
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending via WhatsApp: " + message);
    }
}
