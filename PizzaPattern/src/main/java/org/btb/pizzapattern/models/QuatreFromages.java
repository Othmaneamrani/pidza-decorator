package org.btb.pizzapattern.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("fro")
public class QuatreFromages extends PizzaImpl{

    public QuatreFromages(){
        description="Quatre Fromages";
        price=60;
    }

}
