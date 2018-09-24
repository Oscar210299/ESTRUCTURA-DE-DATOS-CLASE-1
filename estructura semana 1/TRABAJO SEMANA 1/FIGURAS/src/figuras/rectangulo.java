/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package figuras;

/**
 *
 * @author Oscar
 */
public class rectangulo {
    private int lado;
    private int ancho;
    public void set_lado(int l){
        this.lado=l;
    }
    public void set_ancho(int a){
        this.ancho=a;
    }
    public int get_lado(){
        return this.lado;
    }
    public int get_ancho(){
        return this.ancho;
    }
}
