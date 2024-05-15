package org.btb.pizzapattern.repository;

import org.btb.pizzapattern.models.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPizzaRepository extends JpaRepository<Pizza, Integer> {
}
