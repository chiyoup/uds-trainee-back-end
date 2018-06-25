package br.com.uds.pizza;
import java.util.Set;
import java.util.UUID;

public interface PizzaService {
    public Pizza criar(Pizza pizza);
    public void remover(UUID id);
    public void editar(UUID id, Pizza pizza);
    public Pizza obter(UUID id);
    public Set<Pizza> listar();
}
