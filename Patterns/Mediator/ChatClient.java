
public class ChatClient {

    public static void main(String[] args) {
        Mediator messenger = new MediatorImpl();

        User user1 = new UserImpl(messenger, "Peter", 1);
        User user2 = new UserImpl(messenger, "Lisa", 2);
        User user3 = new UserImpl(messenger, "Sam",3);
        User user4 = new UserImpl(messenger, "Ban", 4);
        User user5 = new UserImpl(messenger, "Sara", 5);

        messenger.addUser(user1);
        messenger.addUser(user2);
        messenger.addUser(user3);
        messenger.addUser(user4);
        messenger.addUser(user5);

        user3.sendAll("Hi!");
        System.out.println("\n");

        messenger.deleteUser(user3);

        user4.sendAll("Where's Sam?");
        System.out.println("\n");

        //user1.sendUser("How are you?", 3);
        user1.sendUser("How are you?", 2);

    /*
    Peter: Sending Message : How are you?
    Unable to send message to unexistable user
    */
    }

}
