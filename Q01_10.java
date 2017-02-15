
public class Q01_10 {

	public static void main(String[] args) {
		
		double kilometers;
		double miles;
		double time;
		double milesPerHour;
		
		kilometers = 14;
		
		miles = kilometers / 1.6;
		
		time = (45.5 * 60 + 30) / (60 * 60);
		
		milesPerHour = miles / time;
		
		System.out.println("The runner is moving at a rate of " + milesPerHour + " Mph");
		

	}

}
