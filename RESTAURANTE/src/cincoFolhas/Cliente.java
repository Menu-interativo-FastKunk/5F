package cincoFolhas;

import java.util.*;

public class Cliente {
    private static Scanner input = new Scanner(System.in);
    private String nome, pagamento;
    private int mesa;
    private ArrayList<Produto> pedidosCliente = new ArrayList<Produto>();
    Cliente(){}
    Cliente(String nome, String pagamento, int mesa, ArrayList<Produto> pedidosCliente){
        this.nome = nome;
        this.pagamento = pagamento;
        this.mesa = mesa;
        this.pedidosCliente = pedidosCliente;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPagamento() {
        return pagamento;
    }
    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public int getMesa() {
        return mesa;
    }
    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public ArrayList<Produto> getPedidosCliente() {
        return pedidosCliente;
    }

    public void setPedidosCliente(ArrayList<Produto> pedidosCliente) {
        this.pedidosCliente = pedidosCliente;
    }

    public static Cliente novoCliente(){
        System.out.println("Informe o nome do cliente!");
        String nome = input.nextLine();
        System.out.println("Informe a mesa do cliente");
        int mesa = input.nextInt();
        System.out.println("Selecione a forma de pagamento:\n1-Dinheiro\n2-Debito\n3-Credito\n4-Pix\n(Padrão dinheiro)");
        int menuPagamento = input.nextInt();
        String formaPagamento;
        switch (menuPagamento) {
        case 1:
            formaPagamento = "Dinheiro";
            break;
        case 2:
            formaPagamento = "Debito";
            break;
        case 3:
            formaPagamento = "Credito";
            break;
        case 4:
            formaPagamento = "Pix";
            break;
                    
        default:
            formaPagamento = "Dinheiro";
            break;
        }
        ArrayList<Produto> pedidosSelecionados = fazerPedido();
        input.nextLine();
        return new Cliente(nome, formaPagamento, mesa, pedidosSelecionados);
        
    }
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
    
    @Override
    public String toString() {
    StringBuilder resultado = new StringBuilder();
    resultado.append(mesa).append(":\n");
    for (int i = 0; i < pedidosCliente.size(); i++) {
        Produto pedido = pedidosCliente.get(i);
        resultado.append(i + 1).append(". ").append(pedido.getNome()).append("-").append(pedido.getComplemento()).append("\n");
    }
    return resultado.toString();
    }
}
