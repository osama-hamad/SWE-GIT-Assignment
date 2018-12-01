/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package median;

import java.util.Arrays;


/**
 *
 * @author OSama
 */
public class Median {
    
  
   
    public static void main(String[] args) {
       int [] dataset = {1,2,3,9,4};
      
       
      Arrays.sort(dataset);
       if (dataset.length % 2 !=0)
       { 
           System.out.println("The median is:" + dataset[dataset.length/2]);
       }
       else {
           System.out.println("The median is:" + (dataset[dataset.length/2]+dataset[dataset.length/2-1])/2.0);
       }
    }
    
}
