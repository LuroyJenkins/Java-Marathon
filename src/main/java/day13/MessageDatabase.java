package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text) {
        Message message = new Message(u1, u2, text);
        messages.add(message);
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        for (Message dialogList : messages) {
            if ((dialogList.getSender() == u1 | dialogList.getSender() == u2) && (dialogList.getReceiver() == u2 | dialogList.getReceiver() == u1))
                System.out.println(dialogList.getSender()+": "+dialogList.getText());
        }
    }
}
