public class SMSSender implements MessageSender{
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending via SMS: " + message);
    }
}
