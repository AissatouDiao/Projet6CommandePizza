package concretesPizza;

import abstraites.PizzaR;

public class PizzaRsn implements PizzaR {

    @Override
    public void service() {
        System.out.println("une pizza reine à la senegalaise");
    }

}
