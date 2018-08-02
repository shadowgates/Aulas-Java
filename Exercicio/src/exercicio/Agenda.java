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
public class Agenda {

    private Pessoa pessoa[];
    private int contador;

    public Agenda(int tamanho) {
        pessoa = new Pessoa[tamanho];
        contador = 0;
    }

    public void add(Pessoa p) {
        /*if (contador >= pessoa.length) {
            return false;
        } else {
            pessoa[contador] = p;
            contador++;
            return true;
        }*/

        try {
            pessoa[contador] = p;
            contador++;
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void printAll() {
        for (int i = 0; i < contador; i++) {
            pessoa[i].print();
        }
    }

    public void printFones() {
        for (int i = 0; i < contador; i++) {
            if (pessoa[i] instanceof Contato) {
                Contato contato = (Contato) pessoa[i];
                contato.printFone();
            }
        }
    }
}
