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
public class Contato extends Pessoa{
    private String fone;
    
    public Contato(){
        super();
        fone="";
    }
    public Contato(String nome, String rg, String fone){
        super(nome, rg);
        this.fone=fone;
    }
    public Contato (Contato c){
        super(c);
        fone=c.fone;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }
    public void print(){
        super.print();
        System.out.println("Telefone: "+fone);
    }
    
    
}
