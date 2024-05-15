package org.btb.pizzapattern.decorator;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.btb.pizzapattern.models.Pizza;
import org.btb.pizzapattern.models.PizzaImpl;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public abstract class PizzaDecorator extends PizzaImpl {
    @JsonIgnore
    protected PizzaImpl pizza;

}
