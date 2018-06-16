package aula02.exercicio06;
import aula02.exercicio06.Produto;

import java.util.ArrayList;

public class Pedido {
    private Double total = 0.0;
    private ArrayList<Produto> produtos = new ArrayList();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void exibirPedido() {
        produtos.stream().forEach((item)->{
            System.out.println(item.getNome() + " - " + String.format("%.2f", item.getValor()));
        });
    }

    public void calcularTotal() {
        produtos.stream().forEach((item) -> {
            this.total += (item.getValor());
        });
        System.out.println("Total: " + String.format("%.2f", (Double)total));
    }
}
