package concretesPays;

import abstraites.CreateurPizza;
import abstraites.PizzaF;
import abstraites.PizzaO;
import abstraites.PizzaR;
import concretesPizza.PizzaFfr;
import concretesPizza.PizzaOfr;
import concretesPizza.PizzaRfr;

public class CreateurPizzaFR implements CreateurPizza {

    @Override
    public PizzaF CreerPizzaF() {
        PizzaF pf= new PizzaFfr();
        pf.service();;
        return pf;
    }

    @Override
    public PizzaO CreerPizzaO() {
        PizzaO po= new PizzaOfr();
        po.service();
        return po;
    }

    @Override
    public PizzaR CreerPizzaR() {
        PizzaR pr= new PizzaRfr();
        pr.service();
        return pr;
    }

    
}
