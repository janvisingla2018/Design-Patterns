public class EmailSender implements MessageSender{
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending via Email: " + message);
    }
}
