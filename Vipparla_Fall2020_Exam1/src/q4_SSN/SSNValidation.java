/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q4_SSN;

import java.util.Scanner;

/**
 *
 * @author S540791
 */
public class SSNValidation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        System.out.println("Enter SSN :");
        String SSN=s.nextLine();
        if((SSN.length()!=11) || (SSN.charAt(3)!='-') ||((SSN.charAt(6)) != '-')){
            System.out.println(SSN +"is an invalid social security number" ); 
            System.exit(0);
        }
        else{
           
               if((Character.isDigit(SSN.charAt(0)))&&Character.isDigit(SSN.charAt(1))
                       &&Character.isDigit(SSN.charAt(2))&&Character.isDigit(SSN.charAt(4))
                       &&Character.isDigit(SSN.charAt(5))&&Character.isDigit(SSN.charAt(7))
                       &&Character.isDigit(SSN.charAt(8))&&Character.isDigit(SSN.charAt(9))){
                   System.out.println(SSN+"is a valid social security number");}
               else{
                   System.out.println(SSN+"is an invalid social security number");
               }
        }
    }
}