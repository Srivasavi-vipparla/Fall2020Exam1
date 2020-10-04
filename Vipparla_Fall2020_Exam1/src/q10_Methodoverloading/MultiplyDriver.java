/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q10_Methodoverloading;

/**
 *
 * @author Sri Vasavi Vipparla
 */
public class MultiplyDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Multiply m =new Multiply();
        /* calling methodoverloading methods and printing results */
        System.out.println("Multiplication of a*b : "+m.multiply(2, 3));
        System.out.println("Multiplication of a*b*c : "+m.multiply(4,5,6));
        System.out.println("Multiplication of a*b*c*d : "+m.multiply(7,8,9,10));
    }
    
}
