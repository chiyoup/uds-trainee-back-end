package aula02;
import aula02.exercicio03.PatoCibernetico;
import aula02.exercicio03.PatoDeCabecaVermelha;
import aula02.exercicio02.Pedido;
import aula02.exercicio02.Produto;
import aula02.exercicio01.Macaco;

public class Main {
    public static void main(String[] args) {
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

        //Cliente cliente1 = new Cliente("Chiyo", 20657812977, "Av. Colombo, 890, Zona 04, Maringá, Paraná");
    }
}
