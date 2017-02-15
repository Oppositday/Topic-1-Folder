import java.util.Scanner;
public class Q02_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the balance: ");
		double balance;
		balance = input.nextDouble();
		
		System.out.print("Enter the annual interest rate: ");
		double yearlyinterest;
		yearlyinterest = input.nextDouble();
		
		double interest;
		interest = balance * ( yearlyinterest / 1200 );
		
		System.out.println(" Interest for the next month: " + interest);

	}

}
