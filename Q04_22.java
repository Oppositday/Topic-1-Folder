import java.util.Scanner;

public class Q04_22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String stringone = input.nextLine();
        System.out.print("Enter string 2: ");
        String stringtwo = input.nextLine();
        
        if (stringone.contains(stringtwo)) 
            System.out.println(stringtwo + " is a substring of " + stringone);
        
        else 
            System.out.println(stringtwo + " is not a substring of " + stringone);
        
	}

}
