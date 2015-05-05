
import utfpr.ct.dainf.if62c.pratica.Circulo;
import utfpr.ct.dainf.if62c.pratica.Elipse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a1654314
 */
public class Pratica41 {
    public static void main(String[] args) {
        Circulo C1 = new Circulo(1);
        Elipse E1 = new Elipse(1,1);
        
        double AC, AE, PC, PE;
        
        AC = C1.getArea();
        AE = E1.getArea();
        PC = C1.getPerimetro();
        PE = E1.getPerimetro();
        
        System.out.println("Area do Circulo: " + AC);
        System.out.println("Area da Elipse: " + AE);
        System.out.println("Perimetro do Circulo: " + PC);
        System.out.println("Perimetro da Elipse: " + PE);
    }
}
