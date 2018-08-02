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
public class Administrativo extends Funcionario {

    private int faltas;

    public Administrativo(String nome, String rg, double salarioBase) {
        super(nome, rg, salarioBase);
        faltas = 0;
    }

    public void registrarFaltas() {
        faltas++;
    }

    public double desconto() {
        return getSalarioBase() / 30 * faltas;
    }

    @Override
    public double salarioLiquido() {
        return getSalarioBase() - desconto();
    }

    @Override
    public void novoMes() {
        faltas = 0;
    }

    @Override
    public void hollerith() {
        System.out.println("----------------------------\nAdministrativo:");
        super.hollerith();
        System.out.println("Faltas: " + faltas + "\n"
                + "Desconto: " + desconto() + "\n"
                + "Salário líquido: " + salarioLiquido() + "\n"
                + "----------------------------\n");
        novoMes();
    }

}
