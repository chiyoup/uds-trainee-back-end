package aula02;
import aula02.exercicio07.PatoCibernetico;
import aula02.exercicio07.PatoDeCabecaVermelha;
import aula02.exercicio06.Pedido;
import aula02.exercicio06.Produto;
import aula02.exercicio04.Pessoa;
import aula02.exercicio05.Macaco;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Chiyo", "87014290", "Av. Colombo", "890", "casa",
                                    "Jardim Europa", "Maringá", "Paraná", "44999999999");
        pessoa1.informacaoPessoa();

        Macaco macaco = new Macaco();
        macaco.comerBanana();
        macaco.qtdBananas();
        macaco.andar();

        Pedido pedido = new Pedido();
        Produto produto1 = new Produto("Garrafa Termica", 26.00);
        pedido.adicionarProduto(produto1);
        Produto produto2 = new Produto("Notebook Razer", 14599.00);
        pedido.adicionarProduto(produto2);
        Produto produto3 = new Produto("Cadeira Gamer", 1098.99);
        pedido.adicionarProduto(produto3);
        Produto produto4 = new Produto("Mouse Razer Chroma", 398.00);
        pedido.adicionarProduto(produto4);
        Produto produto5 = new Produto("Cama King Size", 3749.00);
        pedido.adicionarProduto(produto5);
        pedido.exibirPedido();
        pedido.calcularTotal();

        PatoCibernetico pato1 = new PatoCibernetico();
        pato1.voar();
        PatoDeCabecaVermelha pato2 = new PatoDeCabecaVermelha();
        pato2.voar();
    }
}
