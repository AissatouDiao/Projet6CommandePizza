package concretesPays;

import abstraites.CreateurPizza;
import abstraites.PizzaF;
import abstraites.PizzaO;
import abstraites.PizzaR;
import concretesPizza.PizzaFus;
import concretesPizza.PizzaOus;
import concretesPizza.PizzaRus;

public class CreateurPizzaUS implements CreateurPizza{

    @Override
    public PizzaF CreerPizzaF() {
        PizzaF pf= new PizzaFus();
        pf.service();;
        return pf;
    }

    @Override
    public PizzaO CreerPizzaO() {
        PizzaO po= new PizzaOus();
        po.service();
        return po;
    }

    @Override
    public PizzaR CreerPizzaR() {
        PizzaR pr= new PizzaRus();
        pr.service();
        return pr;
    }

    
        
    

}
