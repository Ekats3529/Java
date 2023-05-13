
import java.util.*;

interface Graphic {
    public void print();
}

class CompositeGraphic implements Graphic {
    //Список состоящий из дочерних элементов
    private List<Graphic> mChildGraphics = new ArrayList<Graphic>();
    //Реализация метода print()
    public void print() {
        System.out.println("CompositeGraphic:\n");
        for (Graphic graphic : mChildGraphics) {
            graphic.print();
        }
        System.out.println("\nend\n");
    }

    //Добавление графика в список дочерних элементов
    public void add(Graphic graphic) {
        mChildGraphics.add(graphic);
    }
    //Удаление графика в список дочерних элементов
    public void remove(Graphic graphic) {
        mChildGraphics.remove(graphic);
    }
}

class Ellipse implements Graphic {
    public void print() {
        System.out.println("Ellipse");
    }
}

class Parabola implements Graphic {
    public void print() {
        System.out.println("Parabola");
    }
}

class Hyperbole implements Graphic {
    public void print() {
        System.out.println("Hyperbole");
    }
}
