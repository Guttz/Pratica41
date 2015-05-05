/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author a1654314
 */
public class Elipse {
    double s, r;
    
    public Elipse(double a, double b){ 
        this.s = a; 
        this.r = b;
    }
    
    public double getArea(){
        double A;
    
        A = Math.PI*r*s;
    
        return A;
    }
    
    public double getPerimetro(){
        double P;
        
        P = Math.PI*(3*(r + s) - Math.sqrt((3*r + s)*(r + 3*s)));
        
        return P;
    }
}
