package org.btb.pizzapattern.decorator;

import lombok.Getter;
import lombok.Setter;
import org.btb.pizzapattern.models.Pizza;
import org.btb.pizzapattern.models.PizzaImpl;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class UnSuppCheese extends PizzaDecorator{
    public UnSuppCheese(PizzaImpl pizza) {
        super(pizza);
        pizza.setPrice(pizza.getPrice() - 10.0);
    }

    public UnSuppCheese() {
    }

}
