public class UserImpl extends User {

    public UserImpl(Mediator med, String name, Integer id) {
        super(med, name, id);
    }

    @Override
    public void sendUser(String msg, Integer userId){
        System.out.println(this.getName()+": Sending Message : "+msg);
        mediator.sendMessage(msg, userId);
    }

    @Override
    public void sendAll(String msg){
        System.out.println(this.getName()+": Sending Message : "+msg);
        mediator.sendAll(msg, this.getId());
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name+": Received Message : "+msg);
    }

}
