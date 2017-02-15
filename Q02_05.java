import java.util.Scanner;
public class Q02_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the subtotal: ");
		double subtotal;
		subtotal = input.nextDouble();
		
		System.out.print("Enter the gratuity rate: ");
		double gratuity;
		gratuity = input.nextDouble();
		
		double tip;
		double total;
		
		tip = subtotal * gratuity * 0.01;
		total = subtotal + tip;
		
		System.out.println("The total is: $" + total);

	}

}
