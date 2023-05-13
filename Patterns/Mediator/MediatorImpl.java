import java.util.*;

public class MediatorImpl implements Mediator {

    private Map<Integer, User> users = new HashMap<>();

    @Override
    public void addUser(User user){
        this.users.put(user.getId(), user);
    }

    @Override
    public void deleteUser(User user){
        this.users.keySet().remove(user.getId());
    }

    @Override
    public void sendMessage(String msg, Integer id) {
        User user = users.get(id);
        try{
            user.receive(msg);
        } catch (NullPointerException e){
            System.out.println("Unable to send message to unexistable user");
        }

    }

    @Override
    public void sendAll(String msg, Integer sendId) {
        for(Map.Entry<Integer, User> entry: users.entrySet()) {
            if (!Objects.equals(entry.getKey(), sendId)){
                try{
                    entry.getValue().receive(msg);
                } catch (NullPointerException e){
                    System.out.println("Unable to send message to unexistable user");
                }

            }
        }
    }

}
