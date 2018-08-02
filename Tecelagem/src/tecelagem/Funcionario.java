/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecelagem;

/**
 *
 * @author Tiago Guerino
 */
public abstract class Funcionario {

    private String nome;
    private String rg;
    private double salarioBase;

    public Funcionario(String nome, String rg, double salarioBase) {
        this.nome = nome;
        this.rg = rg;
        this.salarioBase = salarioBase;
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

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract double salarioLiquido();

    public void hollerith() {
        System.out.println("Nome:" + getNome() + "\n"
                + "RG: " + getRg() + "\n"
                + "Salario Base: " + getSalarioBase());
    }

    public abstract void novoMes();
}
