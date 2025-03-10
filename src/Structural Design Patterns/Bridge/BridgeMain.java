public class BridgeMain {
    public static void main(String[] args) {
        Message textViaWhatsApp = new TextMessage(new WhatsAppSender());
        Message emailViaSMS = new EmailMessage(new SMSSender());

        textViaWhatsApp.send("Hello, this is a WhatsApp message!");
        emailViaSMS.send("Your verification code is 1234.");
    }
}
