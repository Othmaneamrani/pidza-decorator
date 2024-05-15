package org.btb.pizzapattern.decorator;

import lombok.Getter;
import lombok.Setter;
import org.btb.pizzapattern.models.Pizza;
import org.btb.pizzapattern.models.PizzaImpl;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class UnSuppFrites extends PizzaDecorator{
    public UnSuppFrites(PizzaImpl pizza) {
        super(pizza);
        pizza.setPrice(pizza.getPrice() - 15.0); ;
    }

    public UnSuppFrites() {
    }

}
