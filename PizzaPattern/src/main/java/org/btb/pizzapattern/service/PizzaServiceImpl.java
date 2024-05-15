package org.btb.pizzapattern.service;

import lombok.AllArgsConstructor;
import org.btb.pizzapattern.decorator.*;
import org.btb.pizzapattern.models.*;
import org.btb.pizzapattern.repository.IPizzaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PizzaServiceImpl implements IPizzaService {

    private IPizzaRepository iPizzaRepository;



    @Override
    public Pizza suppCheese(PizzaImpl pizza) {
        Pizza pizzaDecorator = new SuppCheese(pizza);
        return pizza;
    }



    @Override
    public Pizza suppSauce(PizzaImpl pizza) {
        Pizza pizzaDecorator = new SuppSauce(pizza);
        return pizza;
    }




    @Override
    public Pizza suppFrites(PizzaImpl pizza) {
        Pizza pizzaDecorator = new SuppFrites(pizza);
        return pizza;
    }

    @Override
    public Pizza unSuppCheese(PizzaImpl pizza) {
        Pizza pizzaDecorator = new UnSuppCheese(pizza);
        return pizza;
    }

    @Override
    public Pizza unSuppSauce(PizzaImpl pizza) {
        Pizza pizzaDecorator = new UnSuppSauce(pizza);
        return pizza;    }

    @Override
    public Pizza unSuppFrites(PizzaImpl pizza) {
        Pizza pizzaDecorator = new UnSuppFrites(pizza);
        return pizza;    }

    @Override
    public void addPizza(String type) {
        Pizza pizza = new Margarita();
        if(type.equals("Margarita")){
            pizza = new Margarita();
        } else if (type.equals("Pepperoni")) {
            pizza = new Pepperoni();
        } else{
            pizza = new QuatreFromages();
        }
        iPizzaRepository.save(pizza);
    }

    @Override
    public Pizza choisirPizza(String type) {
        Pizza pizza = new Margarita();
        if(type.equals("Margarita")){
            pizza = new Margarita();
        } else if (type.equals("Pepperoni")) {
            pizza = new Pepperoni();
        } else{
            pizza = new QuatreFromages();
        }
        return pizza;
    }

    @Override
    public List<Pizza> getAllPizzas() {
        return iPizzaRepository.findAll();
    }

}
