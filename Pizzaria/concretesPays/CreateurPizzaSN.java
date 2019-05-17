package concretesPays;

import abstraites.CreateurPizza;
import abstraites.PizzaF;
import abstraites.PizzaO;
import abstraites.PizzaR;
import concretesPizza.PizzaFsn;
import concretesPizza.PizzaOsn;
import concretesPizza.PizzaRsn;

public class CreateurPizzaSN implements CreateurPizza {
    
    @Override
    public PizzaF CreerPizzaF() {
        PizzaF pf= new PizzaFsn();
        pf.service();;
        return pf;
        
    }

    @Override
    public PizzaO CreerPizzaO() {
        PizzaO po= new PizzaOsn();
        po.service();
        return po;
    }

    @Override
    public PizzaR CreerPizzaR() {
        PizzaR pr= new PizzaRsn();
        pr.service();
        return pr;
    }

    

}
