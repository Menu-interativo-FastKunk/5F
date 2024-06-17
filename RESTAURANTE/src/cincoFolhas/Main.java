package cincoFolhas;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Cardapio cardapio = new Cardapio();
        cardapio.adicionarProduto();
        cardapio.adicionarProduto();
        funcionario.pedidoCliente();
        funcionario.pedidoFinalizado();
    }
}
