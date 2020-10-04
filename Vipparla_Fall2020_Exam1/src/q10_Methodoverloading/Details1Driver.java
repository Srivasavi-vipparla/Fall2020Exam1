/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q10_Methodoverloading;

/**
 *
 * @author S540791
 */
public class Details1Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Details1 d =new Details1();
   //calling the overloaded methods in Details class 
      
        
        System.out.println("year , lastName : "+d.details(1996,"Vipparla"));
        System.out.println("lastName , year : "+d.details("Vipparla",1996));
      
    
    }
    
}
