public abstract class User {
    protected Mediator mediator;
    protected String name;
    protected Integer id;
    public abstract void sendUser(String msg, Integer id);
    public abstract void sendAll(String msg);
    public abstract void receive(String msg);
    public User(Mediator med, String name, Integer id){
        this.mediator=med;
        this.name=name;
        this.id = id;
    }
    public Integer getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}
