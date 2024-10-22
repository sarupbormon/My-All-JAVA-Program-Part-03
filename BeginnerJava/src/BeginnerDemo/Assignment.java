package BeginnerDemo;
import java.util.Scanner;
public class Assignment {
	public static void main(String[] args) {
        
		Scanner input= new Scanner(System.in);
        String[] day = {"Monday","Tuesday","Wednesday","Thrusday","Friday","Saturday","Sunday"};
        
        
        System.out.print("Enter day number (1-7): ");
        int i = input.nextInt();
        
        for( int n= 0; n<day.length; n++){
            if(n==i-1)
                System.out.println("The day is: "+day[i-1]);
        }

	}	
		
}

