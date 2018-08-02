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
public class Exercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Agenda agenda = new Agenda(9);
        Pessoa p1 = new Pessoa("Tiago", "Guerino");
        agenda.add(p1);
        agenda.printAll();
        
        Contato c1 = new Contato("Tiago", "Guerino", "(00)0000-00000");
        agenda.add(c1);
        agenda.printFones();
        
    }

}
