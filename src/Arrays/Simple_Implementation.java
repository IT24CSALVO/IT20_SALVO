/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Arrays;

/**
 *
 * @author User
 */
public class Simple_Implementation {
    public static void main(String[] args) {
       String [] colors = {"Pink","Red","Black","Green"};
       //printing what colors using the index inside the array
       System.out.println(colors[3]);
       System.out.println(colors[2]);
       System.out.println(colors[1]); 
       
       //output
       /*Green
         Black
         Red */
       
        //declaring numbers inside array"
       int [] numValue = {50,45,30,60,85,100};
       
       //procedure
       System.out.println("The number inside the array is : " + numValue.length);
       
       //output
       //The number inside the array is : 6
       
       
       //declaring numbers inside array"
       int[] num = {4,5,8,16,20};
       
       //procedure
        System.out.println("Sum : " + (num[1] + num[2]));
        System.out.println("Difference : " + (num[3] - num[1]));
        System.out.println("Product : " + (num[3] * num[2]));
        System.out.println("Quotient : " + (num[4] / num[3]));
        
        //output
       /* 
        Sum : 18
        Difference : 11
        Product : 128
        Quotient : 1
        */
      
    }
    
}
