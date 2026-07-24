package day4;
import java.util.Scanner;

public class MaxTwoNumber {

	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        System.out.println("Enter first number:");
		        int a = sc.nextInt();

		        System.out.println("Enter second number:");
		        int b = sc.nextInt();

		        if (a > b) {
		            System.out.println("Maximum number is: " + a);
		        } else {
		            System.out.println("Maximum number is: " + b);
		        }
		    }
		
	}


