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
public class Vendedor extends Funcionario {
    private int vendasTotal;
    
    public Vendedor(String nome, String rg, double salarioBase){
        super(nome, rg, salarioBase);
        vendasTotal=0;
    }
    
    @Override
    public void novoMes(){
        vendasTotal=0;
    }
    
    private double valorComissao(){
        return vendasTotal*0.03;
    }
   
    @Override
    public double salarioLiquido(){
        return getSalarioBase()+valorComissao();
    }
    
    public void registrarVenda(double venda){
        vendasTotal+=venda;
    }
    
    @Override
    public void hollerith(){
        System.out.println("----------------------------\nVendedor:");
        super.hollerith();
        System.out.println("Vendas totais:"+ vendasTotal+"\n"
                + "Comissão: "+ valorComissao()+ "\n"
                + "Salário líquido: "+salarioLiquido()+"\n"
                + "----------------------------\n");
        novoMes();
    }
}
