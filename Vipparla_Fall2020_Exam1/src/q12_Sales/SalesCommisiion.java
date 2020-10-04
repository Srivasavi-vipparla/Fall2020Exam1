/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q12_Sales;

/**
 *
 * @author Sri Vasavi Vipparla
 */
public class SalesCommisiion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double commission_rate ;
        double goal_to_earn = 30000;
        double Sales_Amount = 0;       

        // using do- while  to calculate commission   
        do {
            Sales_Amount+=1;   
            /* if the sales_amount is in between 0.01 and 5000 */
            if (Sales_Amount >0  && Sales_Amount < 5000.01) {
                commission_rate = Sales_Amount * 0.08;
            }  /* if the sales_amount is in between 5000.01 and 10000 */
            else if (Sales_Amount > 5000&& Sales_Amount < 10000.01) {
                commission_rate = 5000 * 0.08+ (Sales_Amount -5000)* 0.1;
            } 
            /* if the sales_amount is greater 10000.01 */  
            else {
                commission_rate = 5000 * 0.08 + 5000 * 0.1 + (Sales_Amount - 10000) * 0.12;
            }
                 
            // using while to satisfy that comission  should be  30000       
        } while (commission_rate < goal_to_earn);
        // displaying no of sales that took to earn 30000 and the sales amount as well
        System.out.println("minimum number of Sales  is:" + Sales_Amount);     
   }   
}
