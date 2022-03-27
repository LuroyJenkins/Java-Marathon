package day13;

public class Task1 {
    public static void main(String[] args) {
        User u1 = new User("luroy");
        User u2 = new User("bogdanka_polina");
        User u3 = new User("svyazhin");

        MessageDatabase.addNewMessage(u1, u2, "Привет!");
        MessageDatabase.addNewMessage(u1, u2, "Как ты?");
        MessageDatabase.addNewMessage(u2, u1, "Привет!");
        MessageDatabase.addNewMessage(u2, u1, "Все супер! Живу по-тихоньку");
        MessageDatabase.addNewMessage(u2, u1, "Ты как?");
        MessageDatabase.addNewMessage(u3, u1, "Здравствуй!");
        MessageDatabase.addNewMessage(u3, u1, "Слушай, просьба есть");
        MessageDatabase.addNewMessage(u3, u1, "Можешь денег занять?");
        MessageDatabase.addNewMessage(u1,u3,"Здарова");
        MessageDatabase.addNewMessage(u1,u3,"Ты меня заколебал уже");
        MessageDatabase.addNewMessage(u1,u3,"Сколько?");
        MessageDatabase.addNewMessage(u3,u1,"5000р, если можешь");

        u1.subscribe(u2);
        u3.subscribe(u2);
        u1.subscribe(u3);
        u3.subscribe(u1);

       // System.out.println(u1.isFriend(u2));
        System.out.println(u1.isFriend(u3));
        System.out.println(u3.isFriend(u1));

        MessageDatabase.showDialog(u1,u3);
        //System.out.println(MessageDatabase.getMessages());
    }
}
