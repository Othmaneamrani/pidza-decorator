package org.btb.pizzapattern.service;


import org.btb.pizzapattern.models.Pizza;
import org.btb.pizzapattern.models.PizzaImpl;

import java.util.List;

public interface IPizzaService {

    Pizza suppCheese (PizzaImpl pizza);
    Pizza suppSauce (PizzaImpl pizza);
    Pizza suppFrites (PizzaImpl pizza);

    Pizza unSuppCheese (PizzaImpl pizza);
    Pizza unSuppSauce (PizzaImpl pizza);
    Pizza unSuppFrites (PizzaImpl pizza);

    void addPizza(String type);

    Pizza choisirPizza(String type);
    List<Pizza> getAllPizzas();

}
