public class Vegetable implements ItemElement {

    private double pricePerKg;
    private double weight;
    private String name;

    public Vegetable(double priceKg, double wt, String nm) {
        this.pricePerKg = priceKg;
        this.weight = wt;
        this.name = nm;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }


    public double getWeight() {
        return weight;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }

}
