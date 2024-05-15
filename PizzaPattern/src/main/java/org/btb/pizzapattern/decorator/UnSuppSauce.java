package org.btb.pizzapattern.decorator;

import lombok.Getter;
import lombok.Setter;
import org.btb.pizzapattern.models.Pizza;
import org.btb.pizzapattern.models.PizzaImpl;
import org.springframework.stereotype.Component;

@Getter
@Component
@Setter
public class UnSuppSauce extends PizzaDecorator{
    public UnSuppSauce(PizzaImpl pizza) {
        super(pizza);
        pizza.setPrice(pizza.getPrice() - 5.0); ;
    }

    public UnSuppSauce() {
    }

}
