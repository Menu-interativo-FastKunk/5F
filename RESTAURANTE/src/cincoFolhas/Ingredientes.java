package cincoFolhas;

import java.util.*;
public class Ingredientes {
    Scanner input = new Scanner(System.in);
    ArrayList<Ingredientes> ingredientes = new ArrayList<Ingredientes>();
    String nome;
    double quantidade;

    Ingredientes(String nome, double quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
    }

    Ingredientes(){}

    public Ingredientes novoingrediente(){
        System.out.println("Informe o nome do ingrediente");
        String nome = input.nextLine();
        System.out.println("Informe a quantidade do ingrediente");
        double quantidade = input.nextDouble();
        return new Ingredientes(nome, quantidade);
    }

    public void exibirIngredientes(){
        System.out.println("------ Ingredientes ------");
        for(int i = 0; i < ingredientes.size(); i++){
            Ingredientes item = ingredientes.get(i);
            System.out.println((i + 1) + "- " + item);
        }
        System.out.println("----------------------");
    }

    public void adcionarIngrediente(Ingredientes novoingrediente){
        ingredientes.add(novoingrediente);
    }

    public void removerIngrediente(){
        exibirIngredientes();
        System.out.println("Escolha o ingrediente que deseja remover");
        int indice = input.nextInt();
        if(indice> 0 && indice<=ingredientes.size()){
            ingredientes.remove((indice - 1));
            System.out.println("Ingrediente removido com sucesso da lista");
        } else{
            System.out.println("Opção inválida");
        }
    }

    public void listaPadraoIngredientes(){
        ingredientes.add(new Ingredientes("Alface", 10));
        ingredientes.add(new Ingredientes("Pão", 12));
        ingredientes.add(new Ingredientes("Ovo", 10));
        ingredientes.add(new Ingredientes("Farinha de Trigo", 500));
        ingredientes.add(new Ingredientes("Sal", 10));
        ingredientes.add(new Ingredientes("Tomate", 10));
        ingredientes.add(new Ingredientes("Orégano", 10));
        ingredientes.add(new Ingredientes("Queijo", 10));
        ingredientes.add(new Ingredientes("Linguiça calabresa", 10));
        ingredientes.add(new Ingredientes("Azeite", 10));
        ingredientes.add(new Ingredientes("Cebola", 15));
        ingredientes.add(new Ingredientes("Alho", 5));
        ingredientes.add(new Ingredientes("Pepino", 10));
        ingredientes.add(new Ingredientes("Pimentão", 10));
        ingredientes.add(new Ingredientes("Frango", 20));
        ingredientes.add(new Ingredientes("Carne Moída", 25));
        ingredientes.add(new Ingredientes("Arroz", 100));
        ingredientes.add(new Ingredientes("Feijão", 80));
        ingredientes.add(new Ingredientes("Batata", 30));
        ingredientes.add(new Ingredientes("Cenoura", 20));
        ingredientes.add(new Ingredientes("Brócolis", 15));
        ingredientes.add(new Ingredientes("Ervilha", 10));
        ingredientes.add(new Ingredientes("Milho", 10));
    }

    @Override
    public String toString() {
        return String.format("%s", nome);
    }
}
