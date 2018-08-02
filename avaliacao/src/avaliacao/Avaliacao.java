/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacao;

/**
 *
 * @author Tiago Guerino
 */
public class Avaliacao {
 
    public static void main(String[] args) {
        Venda venda = new Venda();
        venda.setDescricao("Espada");
        venda.setItem(3);
        venda.setNumero("2");
        venda.setPreco(60.00);
        
        venda.getTotalVenda();
        venda.mostrarDados();
        
    }
    
}
