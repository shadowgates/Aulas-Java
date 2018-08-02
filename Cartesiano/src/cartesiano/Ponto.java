/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartesiano;

/**
 *
 * @author Tiago Guerino
 */
public class Ponto {

    private double x, y;

    //Padrão
    public Ponto() {
        x = 0;
        y = 0;
    }

    //Parametizado
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //Copia
    public Ponto(Ponto pt) {
        x = pt.x;
        y = pt.y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void print() {
        System.out.println("(" + x + "," + y + ")");
    }
}
