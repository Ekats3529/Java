public class Main {
    public static void main(String[] args) {
        Ellipse ellipse1 = new Ellipse();
        Ellipse ellipse2 = new Ellipse();
        Hyperbole hyperbole1 = new Hyperbole();
        Hyperbole hyperbole2 = new Hyperbole();
        Parabola parabola1 = new Parabola();
        Parabola parabola2 = new Parabola();
        CompositeGraphic graphic = new CompositeGraphic();
        CompositeGraphic graphic1 = new CompositeGraphic();
        CompositeGraphic graphic2 = new CompositeGraphic();

        graphic1.add(ellipse1);
        graphic1.add(ellipse2);
        graphic1.add(parabola1);
        graphic2.add(parabola2);
        graphic2.add(hyperbole2);
        graphic.add(graphic1);
        graphic.add(graphic2);
        graphic.add(hyperbole1);
        graphic.print();
    }
}
