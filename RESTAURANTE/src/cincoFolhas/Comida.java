package cincoFolhas;

import java.util.*;

public class Comida extends Produto{
    private static Scanner input = new Scanner(System.in);
    private ArrayList<Ingredientes> ingredientesProduto = new ArrayList<Ingredientes>();
    
    Comida(String nome, String complemento, double preco, ArrayList<Ingredientes> ingredientesProduto){
        super(nome, complemento, preco);
        this.ingredientesProduto = ingredientesProduto;
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
        Ingredientes listaIngredientes = new Ingredientes();
        ArrayList<Ingredientes> ingredientesSelecionados = new ArrayList<>();
        boolean continuarIngredientes = true;
        do {
            System.out.println("Selecione os ingredientes que compõem o seu produto");
            listaIngredientes.exibirIngredientes();
            int indice = input.nextInt();
            input.nextLine();
            if(indice > 0 && indice <= listaIngredientes.ingredientes.size()){
                ingredientesSelecionados.add(listaIngredientes.ingredientes.get(indice - 1));
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
        return getNome() + '-' + getComplemento() + '-' + "R$" + getPreco() + "\n" +
        ingredientesProduto.toString();
    }
}
