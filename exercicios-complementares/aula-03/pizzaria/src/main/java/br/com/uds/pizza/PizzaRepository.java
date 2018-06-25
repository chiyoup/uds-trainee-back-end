package br.com.uds.pizza;
import java.util.Set;
import java.util.UUID;

public interface PizzaRepository {

    public Pizza save(Pizza pizza);
    public Set<Pizza> findAll();
    public void delete(UUID id);
    public Pizza findOne(UUID id);
}
