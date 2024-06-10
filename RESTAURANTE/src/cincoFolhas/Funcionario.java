package cincoFolhas;

import java.util.*;

public class Funcionario extends Cliente {
    private static Scanner input = new Scanner(System.in);
    private static List<Cliente> clientes = new ArrayList<>();
    public void pedidoCliente() {
        Cliente cliente = novoCliente();
        clientes.add(cliente);
        System.out.println("Cliente adicionado com sucesso");
    }

    public void visualizarPedidos(){
        for(Cliente cliente : clientes){
            System.out.println("Pedidos do cliente da mesa " + cliente);
        }
    }
    public void produtoFinalizado(){
        visualizarPedidos();
        System.out.println("Informe a mesa do produto finalizado");
        int indiceMesa = input.nextInt();
        if (indiceMesa > 0 && indiceMesa <= clientes.size()){
            System.out.println("Informe o número do produto que deseja remover:");
            int indiceProduto = input.nextInt();
            if (indiceProduto > 0 && indiceProduto <= clientes.get(indiceMesa).getPedidosCliente().size()) {
                clientes.get(indiceMesa).getPedidosCliente().remove(indiceProduto - 1);
                System.out.println("Pedido removido com sucesso.");
            } else {
                System.out.println("Índice inválido.");
            }
        }
    }

    public void pedidoFinalizado(){
        produtoFinalizado();
        for(int i = 0; i < clientes.size(); i++){
            if(clientes.get(i).getPedidosCliente().isEmpty()){
                System.out.println("Pedido da mesa " + clientes.get(i).getMesa() + " finalizado");
                
            }
        }
    }

    
    

    
}