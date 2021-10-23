package random;

import java.util.Arrays;
import java.util.Random;

public class Ranndom1 {

	public static void main(String[] args) {	
		Random rnum = new Random();
		int counter;			
        /* Below code would generate 500 random numbers
         * between 100 and 1000.
         */
       
		
		System.out.println("Random Numbers:");
        for (counter = 100; counter <= 500; counter++) {
           System.out.println(rnum.nextInt(1000));
        }
				
		int numbers [] = {rnum.nextInt(1000)};		       
        int smallest = numbers[0];
        
        
        
        for(int i = 1;  i<numbers.length; i++) {             
              if(numbers[i]<smallest) {
               smallest = numbers[i];            }            
     
        
        }        
       System.out.println("Smallest number is : " +smallest);
       
	}

}
