/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q13_CreditCard;

import java.util.Scanner;

/**
 *
 * @author Sri Vasavi Vipparla
 */
public class CreditCardDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Credit card number");
        /* reading the credit card number*/
        long Credit_number=s.nextLong();
        /* checking whether the credit card is valid or not*/
        if(CreditCard.isValid(Credit_number)){
            System.out.println(Credit_number+" is valid");
        }
        else{
            System.out.println(Credit_number+" is invalid");}
    }
    
}
