package concretesPizza;

import abstraites.PizzaR;

public class PizzaRus implements PizzaR {

    @Override
    public void service() {
      System.out.println("Une pizza  reine � l'am�ricaine");
    }

}
