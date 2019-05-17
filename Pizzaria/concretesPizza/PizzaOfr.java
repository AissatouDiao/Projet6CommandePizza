package concretesPizza;

import abstraites.PizzaO;

public class PizzaOfr implements PizzaO {

    @Override
    public void service() {
        System.out.println("une pizza orientale à la française");

    }

}
