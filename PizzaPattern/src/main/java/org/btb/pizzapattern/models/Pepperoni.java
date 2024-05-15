package org.btb.pizzapattern.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("pep")
public class Pepperoni extends PizzaImpl{

    public Pepperoni(){
        description="Pepperoni";
        price=50;
    }


}
