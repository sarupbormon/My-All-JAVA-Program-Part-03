package BeginnerDemo;

import java.util.Scanner;

public class FindMaximumMinimumUsingArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double[] number = new double[5];
		double sum = 0;
		
		System.out.println("Please Enter 5 number: ");
		   
		
		   for( int i = 0; i < 5; i++) {
			   number[i] = input.nextDouble();
            
            
		   }
		   
		   for(int i = 0; i < 5;i++ ) { 
			   sum = sum + number[i];
			   
		 	   //sum = number[0] +sum = number[1] +sum = number[2] +sum = number[3]+sum = number[4] 
		   }
		   
		  double avg =  sum/5;
		  System.out.println("The Sum is : "+sum);  
		  System.out.println("The Avarage is : "+avg);
		  
		  double max = number[0];
		  double min = number[0];
		  for( int i = 1; i < 5; i++)
		  {
			  
			  if(max < number[i] ){
				  max = number[i];
			  }
			  if(min > number[i]) {
				  min = number[i];
			  }
		  }
		  System.out.println("Maximum number: "+max);
		  System.out.println("Minimum number: "+min);
		   
		   
	}

}

