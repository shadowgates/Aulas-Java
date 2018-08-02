/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

/**
 *
 * @author Tiago Guerino
 */
public abstract class Animal {
    public abstract void FazerSom();
    
    public void Fome(){
        FazerSom();
        FazerSom();
        FazerSom();
    }
}
