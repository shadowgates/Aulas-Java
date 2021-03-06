package br.edu.fatec.aula.model;
// Generated 02/12/2017 18:07:21 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;





/**
 * VendaId generated by hbm2java
 */
@Entity
@Table(name = "venda")
public class VendaId  implements java.io.Serializable {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
     private int idvenda;
    @Column (name = "clientes_idclientes")
     private int clientesIdclientes;
    @Column (name = "carros_idcarros")
     private int carrosIdcarros;


    public VendaId() {
    }
    

    public VendaId(int idvenda, int clientesIdclientes, int carrosIdcarros) {
       this.idvenda = idvenda;
       this.clientesIdclientes = clientesIdclientes;
       this.carrosIdcarros = carrosIdcarros;
    }
   
    public int getIdvenda() {
        return this.idvenda;
    }
    
    public void setIdvenda(int idvenda) {
        this.idvenda = idvenda;
    }
    public int getClientesIdclientes() {
        return this.clientesIdclientes;
    }
    
    public void setClientesIdclientes(int clientesIdclientes) {
        this.clientesIdclientes = clientesIdclientes;
    }
    public int getCarrosIdcarros() {
        return this.carrosIdcarros;
    }
    
    public void setCarrosIdcarros(int carrosIdcarros) {
        this.carrosIdcarros = carrosIdcarros;
    }


    @Override
   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof VendaId) ) return false;
		 VendaId castOther = ( VendaId ) other; 
         
		 return (this.getIdvenda()==castOther.getIdvenda())
 && (this.getClientesIdclientes()==castOther.getClientesIdclientes())
 && (this.getCarrosIdcarros()==castOther.getCarrosIdcarros());
   }
   
    @Override
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdvenda();
         result = 37 * result + this.getClientesIdclientes();
         result = 37 * result + this.getCarrosIdcarros();
         return result;
   }   


}


