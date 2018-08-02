/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import sorter.SortedList;

/**
 *
 * @author Tiago Guerino
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SortedList sl = new SortedList(10);
        sl.add(new Aluno("Tiago", 5));
        sl.add(new Aluno("Cristian", 8));
        sl.add(new Aluno("Cristian", 9));
        sl.add(new Aluno("Lucas", 3));
        sl.add(new Aluno("Allison", 1));
        sl.add(new Aluno("Allison", 2));
        sl.add(new Aluno("Mathues", 7));
        sl.add(new Aluno("Franklin", 6));
        sl.add(new Aluno("Tiago", 4));
        sl.add(new Aluno("Mathues", 10));
        
        sl.sort();
        sl.printAll();
    }
    
}
