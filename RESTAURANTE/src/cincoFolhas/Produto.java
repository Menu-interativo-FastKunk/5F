package cincoFolhas;

import java.util.*;

public class Produto extends Ingredientes {
    private static Scanner input = new Scanner(System.in);
    private String nome, complemento;
    private double preco;
    private ArrayList<Ingredientes> ingredientesProduto =  new ArrayList<Ingredientes>();

    Produto(String nome, String complemento, double preco, ArrayList<Ingredientes> ingredientesProduto){
        this.nome = nome;
        this.complemento = complemento;
        this.preco = preco;
        this.ingredientesProduto = ingredientesProduto;
    }

    Produto(){
        listaPadraoIngredientes();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produto novoProduto(){
        System.out.println("Informe o nome do Produto");
        String nome = input.nextLine();
        System.out.println("Informe o complemento se tiver");
        String complemento = input.nextLine();
        System.out.println("Informe o preço");
        double preco = input.nextDouble();
        input.nextLine(); // Consumir o newline deixado pelo nextDouble
        ArrayList<Ingredientes> ingredientesSelecionados = selecionarIngredientes();
        return new Produto(nome, complemento, preco, ingredientesSelecionados);
    }

    public ArrayList<Ingredientes> selecionarIngredientes(){
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
        return nome + '-' + complemento + '-'+ preco + "\n" +
               ingredientesProduto.toString();
    }
}