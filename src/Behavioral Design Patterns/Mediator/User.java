public abstract class User {
    protected String name;
    protected ChatMediator chatMediator;

    public User(String name, ChatMediator chatMediator) {
        this.name = name;
        this.chatMediator = chatMediator;
        chatMediator.addUser(this);
    }

    public String getName() {
        return name;
    }

    public abstract void sendMessage(String message);
    public abstract void receiveMessage(String message, String sender);
}
