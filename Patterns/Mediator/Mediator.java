public interface Mediator {

    public void sendMessage(String msg, Integer userId);

    public void sendAll(String msg, Integer sendId);

    void addUser(User user);

    void deleteUser(User user);
}


