package Day4;

import java.util.Scanner;

public class ElseIf {
	   public static void main(String[] args) {
			
			System.out.println("1.English");
			System.out.println("2.Hindi");
			System.out.println("3.Marathi");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			
			if(choice == 1)
				System.out.println("Call routed to London");
			else if(choice == 2)
				System.out.println("Call routed to Delhi");
			else if(choice == 3)
				System.out.println("Call routed to pune");
			else
				System.out.println("Invalid choice");
			
			sc.close();
			
		}

	}



