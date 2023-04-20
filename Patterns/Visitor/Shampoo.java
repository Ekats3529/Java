public class Shampoo implements ItemElement {

    private double price;

    private double volume;
    private String name;

    public Shampoo(double cost, double volume, String name){
        this.price=cost;
        this.name =name;
        this.volume = volume;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }

}


