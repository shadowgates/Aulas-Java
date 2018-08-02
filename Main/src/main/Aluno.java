/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import sorter.Sorteable;

/**
 *
 * @author Tiago Guerino
 */
public class Aluno implements Sorteable {

    private String nome;
    private int numero;

    public Aluno(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    @Override
    public int compare(Sorteable item) {
        if (!(item instanceof Aluno)) return 0;
        Aluno aluno= (Aluno)item;
        if(aluno.numero<numero)return -1;
        if(aluno.numero>numero)return 1;
        return 0;
    }

    @Override
    public void print() {
        System.out.println(nome +" - "+numero);
    }

}
