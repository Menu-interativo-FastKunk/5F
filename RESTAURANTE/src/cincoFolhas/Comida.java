package cincoFolhas;

import java.util.ArrayList;

public class Comida extends Ingredientes{
    private String nome, complemento;
    private double preco;
    private ArrayList<Ingredientes> ingredientesProduto = new ArrayList<Ingredientes>();
    Comida(String nome, String complemento, double preco, ArrayList<Ingredientes> ingredientesProduto){
        this.nome = nome;
        this.complemento = complemento;
        this.preco = preco;
        this.ingredientesProduto = ingredientesProduto;
        listaPadraoIngredientes(); 
    }

    public static Produto novaComida(){
        System.out.println("Informe o nome da Comida");
        String nome = input.nextLine();
        System.out.println("Informe o complemento se tiver");
        String complemento = input.nextLine();
        System.out.println("Informe o preço");
        double preco = input.nextDouble();
        input.nextLine();
        ArrayList<Ingredientes> ingredientesSelecionados = selecionarIngredientes();
        return new Comida(nome, complemento, preco, ingredientesSelecionados);
    }

    public static ArrayList<Ingredientes> selecionarIngredientes(){
        ArrayList<Ingredientes> ingredientesSelecionados = new ArrayList<>();
        boolean continuarIngredientes = true;
        do {
            System.out.println("Selecione os ingredientes que compõem o seu produto");
            exibirIngredientes();
            int indice = input.nextInt();
            input.nextLine();
            if(indice > 0 && indice <= ingredientes.size()){
                ingredientesSelecionados.add(ingredientes.get(indice - 1));
                System.out.println("Ingrediente escolhido com sucesso");
            } else{
                System.out.println("Opção inválida");
            }
            System.out.println("Gostaria de adicionar outro ingrediente ao produto? (true/false)");
            continuarIngredientes = input.nextBoolean();
            input.nextLine();
        } while (continuarIngredientes);
        return ingredientesSelecionados;
    }
    @Override
    public String toString() {
        return nome + '-' + complemento + '-' + "R$" + preco + "\n" +
        ingredientesProduto.toString();
    }
}
