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
public class Proprio extends Carro {

    private double valorCompra;
    private String dataCompra;

    public Proprio(String modelo, String placa, int ano, double valorCompra, String dataCompra) {
        super(modelo, placa, ano);
        this.valorCompra = valorCompra;
        this.dataCompra = dataCompra;
    }

    @Override
    public boolean Oferta(double valor) {
        return (valorCompra * 1.1) >= valor;

    }

    @Override
    public void ImprimeDados() {
        super.ImprimeDados();
        if(!disponivel) System.out.println("Vendedor:"+vendedor);
    }
}
