/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

/**
 *
 * @author Tiago Guerino
 */
public class Pessoa {

    private String nome, rg;

    public Pessoa() {
        nome = "";
        rg = "";
    }

    public Pessoa(String nome, String rg) {
        this.nome = nome;
        this.rg = rg;
    }

    public Pessoa(Pessoa pessoa) {
        nome = pessoa.nome;
        rg = pessoa.rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void print() {
        System.out.println("Nome: " + nome);
        System.out.println("RG: " + rg);
    }
}
