package cincoFolhas;

import java.util.*;

public class Funcionario {
    private static Scanner input = new Scanner(System.in);
    private static List<Cliente> clientes = new ArrayList<>();
    public void pedidoCliente() {
        Cliente cliente = Cliente.novoCliente();
        clientes.add(cliente);
        System.out.println("Cliente adicionado com sucesso");
    }

    public void visualizarPedidos(){
        for(Cliente cliente : clientes){
            System.out.println("Pedidos do cliente da mesa " + cliente);
        }
    }

    public void pedidoFinalizado() {
        visualizarPedidos();
        System.out.println("Selecione o pedido finalizado");
        int entrada = input.nextInt();
        valorAPagar((entrada-1));
        clientes.remove((entrada-1));
    }

    public void valorAPagar(int clienteSelecionado) {
        Cliente cliente = clientes.get(clienteSelecionado);
        double resultado = 0;
        for (Produto pedido : cliente.getPedidosCliente()) {
            resultado += (pedido.getPreco()); 
        }
        System.out.println("Total a pagar = R$" + resultado);
        if (cliente.getPagamento().equalsIgnoreCase("Dinheiro")) {
            System.out.println("Qual o valor que o cliente deu?");
            double valorCliente = input.nextDouble();
            double troco = valorCliente - resultado;
            System.out.println("Você deve R$" + troco + " de troco");
        } else {
            System.out.println("Não tem troco");
        }
        System.out.println("Obrigado por comprar conosco");
    }
    
}
