import java.util.Scanner;
public class Q02_23 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the driving distance: ");
	double distance;
	distance = input.nextDouble();
	
	System.out.print("Enter the miles per gallon: ");
	double mpg;
	mpg = input.nextDouble();
	
	System.out.print("Enter the price per gallon: ");
	double ppg;
	ppg = input.nextDouble();
	
	double cost;
	cost = (distance / mpg) * ppg;
	
	System.out.println("The cost of driving is " + cost);
	
	}

}
