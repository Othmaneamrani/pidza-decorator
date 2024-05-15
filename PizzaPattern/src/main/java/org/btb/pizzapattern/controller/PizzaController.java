package org.btb.pizzapattern.controller;

import lombok.AllArgsConstructor;
import org.btb.pizzapattern.models.Margarita;
import org.btb.pizzapattern.models.Pizza;
import org.btb.pizzapattern.models.PizzaImpl;
import org.btb.pizzapattern.service.IPizzaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/pizza")
@CrossOrigin(origins = "*")
public class PizzaController {

    private IPizzaService iPizzaService;


    @PutMapping("/cheese")
    Pizza suppCheese (@RequestBody PizzaImpl pizza){
        return iPizzaService.suppCheese(pizza);
    }



    @PutMapping("/sauce")
    Pizza suppSauce (@RequestBody PizzaImpl pizza){
        return iPizzaService.suppSauce(pizza);
    }



    @PutMapping("/frite")
    Pizza suppFrites (@RequestBody PizzaImpl pizza) {
        return iPizzaService.suppFrites(pizza);
    }


    @PutMapping("/uncheese")
    Pizza unSuppCheese (@RequestBody PizzaImpl pizza){
        return iPizzaService.unSuppCheese(pizza);
    }



    @PutMapping("/unsauce")
    Pizza unSuppSauce (@RequestBody PizzaImpl pizza){
        return iPizzaService.unSuppSauce(pizza);
    }



    @PutMapping("/unfrite")
    Pizza unSuppFrites (@RequestBody PizzaImpl pizza) {
        return iPizzaService.unSuppFrites(pizza);
    }



    @PostMapping
    void addPizza(@RequestParam String type){
        iPizzaService.addPizza(type);
    }


    @GetMapping
    List<Pizza> getAllPizzas(){
        return iPizzaService.getAllPizzas();
    }


    @GetMapping("/get")
    Pizza choisirPizza(@RequestParam String type){
        return iPizzaService.choisirPizza(type);
    }


}
