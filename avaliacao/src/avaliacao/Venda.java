/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacao;

/**
 *
 * @author Tiago Guerino
 */
public class Venda {

    private String numero;
    private String descricao;
    private int item;
    private double preco;

    public double getTotalVenda() {
        double total = getItem() * getPreco();
        return total;
    }

    public void mostrarDados() {
        System.out.println("Descrição do produto: "
                + getDescricao());
        System.out.println("Valor total: "
                + this.getTotalVenda());
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}