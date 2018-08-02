/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

/**
 *
 * @author Tiago Guerino
 */
public class Contato extends Pessoa {

    private String fone;

    public Contato(String nome, String sobrenome, String fone) {
        super(nome, sobrenome);
        this.fone = fone;
    }

    public void printFone() {
        System.out.println("--------------------------------------------\n"
                + "Nome: " + nome + "\n"
                + "Telefone: " + fone + "\n"
                + "--------------------------------------------");
    }
}
