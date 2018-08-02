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

public class Tecelagem {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Administrativo adm = new Administrativo("Tiago", "0001", 5000.00);
        Producao prd = new Producao("Cristian", "0002", 20.00);
        Vendedor ven = new Vendedor("Matheus", "003", 1500.00);
        
        adm.registrarFaltas();
        adm.registrarFaltas();
        adm.hollerith();
        
        prd.registrarHorasDiurnas(150);
        prd.registrarHorasNoturnas(50);
        prd.hollerith();
        
        ven.registrarVenda(50000.00);
        ven.registrarVenda(8000.00);
        ven.hollerith();
        
    }
    
}
