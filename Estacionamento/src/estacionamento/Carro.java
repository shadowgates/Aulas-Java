/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento;

/**
 *
 * @author Tiago Guerino
 */
public abstract class Carro {

    protected String placa;
    protected int ano;
    protected String modelo;
    protected boolean disponivel;
    protected String vendedor;
    
    public Carro(String modelo, String placa, int ano) {
        this.ano = ano;
        this.modelo = modelo;
        this.placa = placa;
        disponivel = true;

    }

    public void ImprimeDados() {
        System.out.println("Placa: " + placa + "\n"
                + "Ano: " + ano + "\n"
                + "Modelo: " + modelo + "\n"
                + "Disponível: " + (disponivel? "Sim":"Não"));
                if(!disponivel) System.out.println("Vendedor: "+vendedor);
    }

    public boolean Disponivel() {
        return disponivel;
    }

    public abstract boolean Oferta(double valor);

    public boolean VenderCarro(String vendedor, double valor) {
        if (!disponivel) return false;
        if (!Oferta(valor)) return false;          
        this.vendedor = vendedor;
        disponivel=false;
        return true;
    }
}
