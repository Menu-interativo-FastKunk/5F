package cincoFolhas;

import java.util.*;

public class Bebidas extends Produto {
    private static Scanner input = new Scanner(System.in);
    ArrayList<Bebidas> bebidas = new ArrayList<Bebidas>();
    Bebidas(String nome, String tipo, double preco) {
        super(nome, tipo, preco);
    }

    public ArrayList<Bebidas> getBebidas() {
        return bebidas;
    }
    public void setBebidas(ArrayList<Bebidas> bebidas) {
        this.bebidas = bebidas;
    }

    public static Bebidas novaBebida(){
        System.out.println("Informe o nome da bebida");
        String bebida = input.nextLine();
        System.out.println("Informe o tipo de bebida(quente ou fria)");
        String tipo = input.nextLine();
        System.out.println("Informe o preço");
        double preco = input.nextDouble();
        input.nextLine();
        return new Bebidas(bebida, tipo, preco);
    }
}
