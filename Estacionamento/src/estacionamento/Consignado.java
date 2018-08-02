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
public class Consignado extends Carro {
    private String nomeProprietario;
    private double valorDesejado;
    
    public Consignado(String modelo, String placa, int ano, double valorDesejado, String nomeProprietario) {
        super(modelo, placa, ano);
        this.valorDesejado = valorDesejado;
        this.nomeProprietario = nomeProprietario;
    }

    @Override
    public boolean Oferta(double valor) {
        return (valorDesejado * 1.5) >= valor;

    }
    
}
