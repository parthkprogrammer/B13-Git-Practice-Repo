package Ravi;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        int sum = armStrongNumber(num);

        String result = (sum == num)
                ? num + " is an Armstrong Number"
                : num + " is not an Armstrong Number";

        System.out.println(result);

        sc.close();
    }

    public static int armStrongNumber(int num) {

        int sum = 0;
        int rem;
        int temp = num;

        while (temp > 0) {
            rem = temp % 10;
            sum = sum + (rem * rem * rem);
            temp = temp / 10;
        }

        return sum;
    }
}
