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
public class Producao extends Funcionario {

    private int diurnas, noturnas;

    public Producao(String nome, String rg, double salarioBase) {
        super(nome, rg, salarioBase);
        diurnas = 0;
        noturnas = 0;
    }

    @Override
    public void novoMes() {
        diurnas = 0;
        noturnas = 0;
    }

    protected double valorDiuno() {
        return diurnas * getSalarioBase();
    }

    protected double valorNoturno() {
        return noturnas * getSalarioBase() * 1.3;
    }

    @Override
    public double salarioLiquido() {
        return valorDiuno() + valorNoturno();
    }

    public void registrarHorasDiurnas(int horas) {
        diurnas += horas;
    }

    public void registrarHorasNoturnas(int horas) {
        noturnas += horas;
    }

    @Override
    public void hollerith() {
        System.out.println("----------------------------\nProdução:");
        super.hollerith();
        System.out.println("Horas Trabalhadas:\nDiurnas: " + diurnas + "\n"
                + "Valor:" + valorDiuno() + "\n"
                + "Noturnas: " + noturnas + "\n"
                + "Valor: " + valorNoturno() + "\n"
                + "Salario Liquido: " + salarioLiquido() + "\n"
                + "----------------------------\n");
        novoMes();
    }

}
