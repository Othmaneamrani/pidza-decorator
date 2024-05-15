package org.btb.pizzapattern.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("mar")
public class Margarita extends PizzaImpl{

    public Margarita(){
        description="Margarita";
        price=40;
    }


}
