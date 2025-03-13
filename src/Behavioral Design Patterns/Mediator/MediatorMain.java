public class MediatorMain {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User user1 = new ChatUser(chatRoom, "Alice");
        User user2 = new ChatUser(chatRoom, "Bob");
        User user3 = new ChatUser(chatRoom, "Charlie");

        user1.sendMessage("Hello, everyone!");
        user3.sendMessage("Hi Alice!");
    }
}
