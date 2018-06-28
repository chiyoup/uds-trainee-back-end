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
    public Pizza salvar(PizzaDTO pizzaDTO) {
        Pizza pizza = new Pizza(pizzaDTO.getMassa(), pizzaDTO.getQueijo(), pizzaDTO.getMolho(), pizzaDTO.getSabor(), pizzaDTO.getTempoDePreparo());
        return this.pizzaRepository.save(pizza);
    }

    @Override
    public Pizza editar(UUID id, PizzaDTO pizzaDTO) {
        Pizza pizza = null;
        return this.pizzaRepository.save(pizza);
    }

    @Override
    public Pizza obter(UUID id) {
        return this.pizzaRepository.findOne(id);
    }

    @Override
    public Set<Pizza> listar() {
        return this.pizzaRepository.findAll();
    }

    @Override
    public void remover(UUID id) {
        this.pizzaRepository.delete(id);
    }
}
