import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator{
    List<User> userList = new ArrayList<>();

    @Override
    public void sendMessage(User sender, String message) {
        for (User user : userList) {
            if (user != sender) { // Don't send message to the sender itself
                user.receiveMessage(message, sender.getName());
            }
        }
    }

    @Override
    public void addUser(User user) {
        userList.add(user);
    }
}
