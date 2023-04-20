public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

    @Override
    public double visit(Shampoo shampoo) {
        double cost = 0;
        if (shampoo.getName().equals("Жумайсынба")) { // shampoo Жумайсынба free
            cost = 0;
        }
        else if (shampoo.getVolume() > 0.7) {  //30 % discount if volume > 0.7
            cost = shampoo.getPrice() * 0.65;
        }
        else{
            cost = shampoo.getPrice();
        }
        System.out.println("Shampoo name " + shampoo.getName() + " cost = " + cost);
        return cost;
    }

    @Override
    public double visit(Vegetable vegetable) {
        double cost = vegetable.getPricePerKg() * vegetable.getWeight();
        System.out.println(vegetable.getName() + " cost = " + cost);
        return cost;
    }

}
