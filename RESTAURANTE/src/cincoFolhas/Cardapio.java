package cincoFolhas;

import java.util.*;

public class Cardapio extends Produto {
    private static Scanner input = new Scanner(System.in);
    protected static ArrayList<Produto> cardapio = new ArrayList<Produto>();

    public static void exibirCardapio(){
        System.out.println("------ Cardápio ------");
        for(int i = 0; i < cardapio.size(); i++){
            Produto item = cardapio.get(i);
            System.out.println((i + 1) + "- " + item);
        }
        System.out.println("----------------------");
    }

    public void adicionarProduto(){
        Produto produto = novoProduto();
        cardapio.add(produto);
    }
    
    public void removerProduto(){
        exibirCardapio();
        System.out.println("Escolha o produto que deseja remover");
        int indice = input.nextInt();
        if(indice> 0 && indice<=cardapio.size()){
            cardapio.remove((indice - 1));
            System.out.println("Produto removido com sucesso do cardápio");
        } else{
            System.out.println("Opção inválida");
        }
    }

    public void modificarProduto(){
        exibirCardapio();
        System.out.println("Escolha o item que deseja modificar");
        int indice = input.nextInt();
        if(indice> 0 && indice<=cardapio.size()){
            System.out.println("Escreva as novas informações:");
            cardapio.set((indice-1), novoProduto());
            System.out.println("Item modificado com sucesso do cardápio");
        } else{
            System.out.println("Opção inválida");
        }
    }
}
