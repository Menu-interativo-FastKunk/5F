package cincoFolhas;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        Cardapio cardapio = new Cardapio();
        int menu = 0;
        do {
            System.out.println("0-Gerente\n1-Cliente\n2-Funcionario\n3-Sair");
            menu = input.nextInt();
            switch (menu) {
                case 0:
                    System.out.println("Você deseja:\n1-Adicionar produto\n2-Remover produto\n3-Modificar produto");
                    int menu2 = input.nextInt();
                    switch (menu2) {
                        case 1:
                            cardapio.adicionarProduto();
                            break;
                        case 2:
                            cardapio.removerProduto();
                            break;
                        case 3:
                            cardapio.modificarProduto();
                            break;
                        default:
                            System.out.println("Opção inválida");
                            break;
                    }
                    break;
                case 1:
                    funcionario.pedidoCliente();
                    break;
                case 2:
                    funcionario.pedidoFinalizado();
                    break;
                default:
                    if(menu!=3){
                        System.out.println("Opção inválida");
                    }
                    break;
            }  
        } while (menu!=3);
        
        input.close();
    }
}
