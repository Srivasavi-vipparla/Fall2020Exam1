/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q7_GreatCircleDistance;

import java.util.Scanner;

/**
 *
 * @author Sri Vasavi Vipparla
 */
public class GreatCircleDistance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          //creating object for Scanner class to read values from keyboard
        Scanner s=new Scanner(System.in);
        // reading latitude and longitude values from keyboard
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        String s1=s.nextLine();
        String[] s2=s1.split(", ");
        double latitude1=Double.valueOf(s2[0]);
        double longitude1=Double.valueOf(s2[1]);
        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        String s3=s.nextLine();
        String[] s4=s3.split(", ");
        double latitude2=Double.valueOf(s4[0]);
        double longitude2=Double.valueOf(s4[1]);
        //converting latitude and longitude degrees to radians using Math class
        double x1=Math.toRadians(latitude1);
        double y1=Math.toRadians(longitude1);
        double x2=Math.toRadians(latitude2);
        double y2=Math.toRadians(longitude2);
       final double radius=6371.01;
       //calculating the distance by using given formula
        double d=radius*Math.acos((Math.sin(x1)*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2)));
        System.out.println("The distance between the two points is "+d+" km");
        
    }
    
}
