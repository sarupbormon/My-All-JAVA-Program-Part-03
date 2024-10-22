package BeginnerDemo;
import java.util.Scanner;
public class ArrayDemo {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double[] number = new double[5];
		double sum = 0;
		
		System.out.println("Please Enter 5 number: ");
		   
		
		   for( int i = 0; i < 5; i++) {
			   number[i] = input.nextDouble();
              //number[0] = input.nextDouble()
			 //number[1] = input.nextDouble()
			 //number[2] = input.nextDouble()
			 //number[3] = input.nextDouble()
			 //number[4] = input.nextDouble()
		   }
		   
		   for(int i = 0; i < 5;i++ ) {
			   sum = sum + number[i];
			   
			   //sum = number[0] +sum = number[1] +sum = number[2] +sum = number[3]+sum = number[4] 
		   }
		   System.out.println("The Sum is : "+sum);   
		   
		   
		  double avg =  sum/5;
		  System.out.println("The Avarage is : "+avg);
		   
		   
	}

}
