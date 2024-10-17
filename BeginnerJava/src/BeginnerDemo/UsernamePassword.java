package BeginnerDemo;
import java.util.Scanner;
public class UsernamePassword {
     public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		
		String username;
		int pass;
        int count = 0;
        while(count == 0)
        {	System.out.println("Enetr your name :");
			username = input1.nextLine();
			
			System.out.println("Enter Password : ");
			pass = input2.nextInt();
			
			if(username.equals("sarup") && pass == 123456 ) {
				System.out.println("Welcome to my system ");
				break;
			}
			else {
				System.out.println("Sorry,please try again");
				System.out.println();
			}
		}
	}
}
