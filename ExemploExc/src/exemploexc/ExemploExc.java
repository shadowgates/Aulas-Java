/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploexc;

/**
 *
 * @author Tiago Guerino
 */
public class ExemploExc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p= new Pessoa("Cristian Gay");
        try {
            p.print();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println("Programa Encerrado");
    }
}
