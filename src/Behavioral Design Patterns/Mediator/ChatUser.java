public class ChatUser extends User {
    public ChatUser(ChatMediator chatMediator, String name) {
        super(name, chatMediator);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(name + " sends: " + message);
        chatMediator.sendMessage(this, message);
    }

    @Override
    public void receiveMessage(String message, String sender) {
        System.out.println(name + " receives from " + sender + ": " + message);
    }
}
