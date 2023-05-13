import static org.junit.Assert.*;
import org.example.Pizza;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.*;
import java.util.List;
public class PizzaTest {

    @Test
    public final void test1() throws CloneNotSupportedException {

        Integer expectedResult = 45;

        Pizza pz = new Pizza();

        pz.MakeDefault();
        pz.setName("margarita");

        Pizza pz1 = (Pizza) pz.clone();

        Integer actualResult = pz1.getPrice();


        System.out.println("Test with no changes of cloned pizza");

        assertEquals(actualResult, expectedResult);

    }

    @Test
    public final void test2() throws CloneNotSupportedException {

        Integer expectedResult = 105;

        Pizza pz = new Pizza();

        pz.MakeDefault();
        pz.setName("margarita");

        Pizza pz1 = (Pizza) pz.clone();

        pz1.setName("pepperoni");
        pz1.addIng("pepperoni", 60);

        Integer actualResult = pz1.getPrice();

        System.out.println("Test with adding element to cloned pizza\n");

        assertEquals(actualResult, expectedResult);

    }

    @Test
    public final void test3() throws CloneNotSupportedException {

        Integer expectedResult = 30;

        Pizza pz = new Pizza();

        pz.MakeDefault();
        pz.setName("margarita");

        Pizza pz2 = (Pizza) pz.clone();

        pz2.setName("cheesy");
        pz2.removeIng("tomato souse");
        //pz2.addIng("blue cheese", 70);

        Integer actualResult = pz2.getPrice();

        System.out.println("Test with removing element to cloned pizza\n");

        assertEquals(actualResult, expectedResult);

    }

    @Test
    public final void test4() throws CloneNotSupportedException {

        Integer expectedResult = 100;

        Pizza pz = new Pizza();

        pz.MakeDefault();
        pz.setName("margarita");

        Pizza pz2 = (Pizza) pz.clone();

        pz2.setName("cheesy");
        pz2.removeIng("tomato souse");
        pz2.addIng("blue cheese", 70);

        Integer actualResult = pz2.getPrice();

        System.out.println("Test with removing & adding elements to cloned pizza\n");

        assertEquals(actualResult, expectedResult);

    }

    @Test
    public final void test5() throws CloneNotSupportedException {

        Integer expectedResult = 45;

        Pizza pz = new Pizza();

        pz.MakeDefault();
        pz.setName("margarita");

        Pizza pz2 = (Pizza) pz.clone();

        pz2.setName("cheesy");
        pz2.removeIng("tomato souse");
        pz2.addIng("blue cheese", 70);
        pz2.MakeDefault();

        Integer actualResult = pz2.getPrice();

        System.out.println("Test with removing & adding elements to cloned pizza \n" +
                "then make clone default\n");

        assertEquals(actualResult, expectedResult);

    }

    @Rule
    public ExpectedException exception = ExpectedException.none();
    @Test
    public final void test6() throws CloneNotSupportedException {

        Integer expectedResult = 45;

        Pizza pz = new Pizza();

        pz.MakeDefault();
        pz.setName("margarita");

        Pizza pz2 = (Pizza) pz.clone();

        pz2.setName("cheesy");

        System.out.println("Test with adding ingridient with negative price\n");

        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Price of ingridient must be more than 0");

        pz2.addIng("blue cheese", -70);

    }

    @Test
    public final void test7() throws CloneNotSupportedException {

        Integer expectedResult = 45;

        Pizza pz = new Pizza();

        pz.MakeDefault();
        pz.setName("margarita");

        Pizza pz2 = (Pizza) pz.clone();

        pz2.setName("cheesy");

        pz2.removeIng("tomato souse");
        pz2.removeIng("cheese");

        System.out.println("Test with trying to make pizza with 0 ingridients\n");

        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Count of ingridients must be more than 0");

        System.out.println(pz2.getInfo());

    }
}
