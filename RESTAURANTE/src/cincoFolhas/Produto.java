package cincoFolhas;

import java.util.*;
public class Produto {
    Scanner input = new Scanner(System.in);
    private String nome, complemento;
    private double preco;
    Produto(){
    }
    Produto(String nome, String complemento, double preco){
        this.nome = nome;
        this.complemento = complemento;
        this.preco = preco;
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

    @Override
    public String toString() {
        return nome + '-' + complemento + '-' + "R$" + preco;
    }
}
