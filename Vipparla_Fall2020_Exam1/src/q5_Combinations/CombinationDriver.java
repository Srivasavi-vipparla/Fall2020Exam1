/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q5_Combinations;



/**
 *
 * @author Sri Vasavi Vipparla
 */
public class CombinationDriver {

    /**
     * @param args the command line arguments
     */
    
	public static void main(String[] args) {
            
            //total_combinations is used to count the combinations
		int total_combinations = 0; 
                       
               // diaplaying combinations form 1 to 7 as per question
		for (int i=1; i < 7; i+=1) {
			for (int j = i + 1; j <= 7; j+=1) {
			// displays the combinations list	
                            System.out.println(i + " " + j);
                                //increments the total_combinations count
				total_combinations++;
			}
		}

		// display the total number of combinations count
		System.out.println("The total number of all combinations is " + total_combinations);
	}
}
  
    

