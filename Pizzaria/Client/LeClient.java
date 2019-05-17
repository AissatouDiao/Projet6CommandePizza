package Client;

import abstraites.CreateurPizza;
import concretesPays.*;

public class LeClient {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        CreateurPizza commande= new CreateurPizzaSN();
        commande.CreerPizzaF();
        CreateurPizza commande1= new CreateurPizzaUS();
        commande1.CreerPizzaF();
        CreateurPizza commande2= new CreateurPizzaFR();
        commande2.CreerPizzaF();
    }

}
