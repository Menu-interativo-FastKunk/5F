package cincoFolhas;

import java.util.*;

public class Pedidos {
    private static Scanner input = new Scanner(System.in);
    public static ArrayList<Produto> fazerPedido(){
        ArrayList<Produto> pedidosFeitos = new ArrayList<Produto>();
        boolean continuarCompra = true;
        do {
            Cardapio.exibirCardapio();
            System.out.println("Selecione o número do produto");
            int indice = input.nextInt();
            if(indice > 0 && indice<=Cardapio.cardapio.size()){
                pedidosFeitos.add(Cardapio.cardapio.get(indice-1));
                System.out.println("Pedido feito com sucesso");
            } else{
                System.out.println("Pedido inválido");
            }
            System.out.println("Dejesa continuar a sua compra?(true/false)");
            continuarCompra = input.nextBoolean();
        } while (continuarCompra);

        return pedidosFeitos;
    }

    public static void visualizarPedidos(){
        for(Cliente cliente : Funcionario.getClientes()){
            System.out.println("Pedidos do cliente da mesa " + cliente);
        }
    }
}
