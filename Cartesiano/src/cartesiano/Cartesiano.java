/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartesiano;

/**
 *
 * @author Tiago Guerino
 */
public class Cartesiano {

    public static void main(String[] args) {
     
        /*Ponto pt = new Ponto();
        pt.setX(10);
        pt.setY(20);
        pt.print();*/
        
        Ponto p1, p2, p3;
        p1= new Ponto();
        p2= new Ponto(10, 20);
        p3= new Ponto(p2);
        p1.print();
        p2.print();
        p3.print();
        
    }

}
