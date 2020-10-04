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
public class Details1 {
  
    
//creating methods with same name and different signatures

//displaying firstName and lastName
public String details(int year,String lastName){
    return year+", "+lastName;
    
}
public String details(String lastName,int year){
    return lastName+", "+year;
}

}
    

