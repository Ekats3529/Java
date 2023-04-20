public class Main {

    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[]{

                new Shampoo(100, 0.6, "Жумайсынба"),
                new Shampoo(150, 0.8, "Shauma"),
                new Shampoo(200,  0.5, "Syoss"),
                new Shampoo(160, 1.2, "Жумайсынба"),

                new Vegetable(10.2, 4.5, "Tomato"),
                new Vegetable(5.6, 0.5, "Cucumber"),
                new Vegetable(21.3, 2.75, "Pepper")};

        double total = calculatePrice(items);
        System.out.println("------------------------------------");
        System.out.println("Total = " + total);
    }

    private static double calculatePrice(ItemElement[] items) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        double sum = 0;
        for (ItemElement item : items) {
            sum = sum + item.accept(visitor);
        }
        return sum;
    }

}

