
import java.util.List;

public class PrototypePatternTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Pizza pz = new Pizza();

        pz.MakeDefault();
        pz.setName("margarita");

        //добавим новую пиццу и новый ингридиент
        Pizza pz1 = (Pizza) pz.clone();

        pz1.setName("pepperoni");
        pz1.addIng("pepperoni", -60);

        //добавим новую пиццу и новый ингридиент
        Pizza pz2 = (Pizza) pz.clone();

        pz2.setName("cheesy");
        pz2.removeIng("tomato souse");
        pz2.removeIng("cheese");
        //pz2.addIng("blue cheese", 70);

        System.out.println(pz.getInfo());
        System.out.println(pz1.getInfo());
        System.out.println(pz2.getInfo());


    }

}


/*
---------------------------------------
Pizza name: margarita
tomato souse  15
cheese  30
Total: 45
---------------------------------------

---------------------------------------
Pizza name: pepperoni
pepperoni  60
tomato souse  15
cheese  30
Total: 105
---------------------------------------

---------------------------------------
Pizza name: cheesy
blue cheese  70
cheese  30
Total: 100
---------------------------------------
*/
