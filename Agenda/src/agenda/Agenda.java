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
public class Agenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Contato p1, p2, p3;
       p1 = new Contato();
       p2 = new Contato("Cristian", "000000","000000000");
       p3 = new Contato(p2);
               
       p1.print();
       p2.print();
       p3.print();
       
       
    }
    
}
