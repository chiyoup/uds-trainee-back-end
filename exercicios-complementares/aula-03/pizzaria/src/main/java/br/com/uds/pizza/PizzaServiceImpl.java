package br.com.uds.pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Set;
import java.util.UUID;

@Service
public class PizzaServiceImpl implements PizzaService {

    @Autowired
    private PizzaRepository pizzaRepository;

    @Override
    public Pizza criar(Pizza pizza) {
        return this.pizzaRepository.save(pizza);
    }

    @Override
    public void remover(UUID id) {
        this.pizzaRepository.delete(id);
    }

    @Override
    public void editar(UUID id, Pizza pizza) {
        Pizza pizzaRecuperada = this.obter(id);
        remover(id);
        pizzaRecuperada.setMassa(pizza.getMassa());
        pizzaRecuperada.setQueijo(pizza.getQueijo());
        pizzaRecuperada.setMolho(pizza.getMolho());
        pizzaRecuperada.setSabor(pizza.getSabor());
        pizzaRecuperada.setTempoDePreparo(pizza.getTempoDePreparo());
        this.pizzaRepository.save(pizzaRecuperada);
    }

    @Override
    public Pizza obter(UUID id) {
        return this.pizzaRepository.findOne(id);
    }

    @Override
    public Set<Pizza> listar() {
        return this.pizzaRepository.findAll();
    }
}
