
public class Q01_11 {

	public static void main(String[] args) {
		
		double birthrate;
		double deathrate;
		double immigration;
		double population;
		double secondsinayear;
		
		birthrate = 7.0;
		deathrate = 13.0;
		immigration = 45.0;
		population = 312032486;
		secondsinayear = 60 * 60 * 24 * 365;
		
		double births;
		double deaths;
		double immigrants;
		
		births = secondsinayear / birthrate;
		deaths = secondsinayear / deathrate;
		immigrants = secondsinayear / immigration;
		
		double yearone;
		double yeartwo;
		double yearthree;
		double yearfour;
		double yearfive;
		
		yearone = population + births - deaths + immigrants;
		yeartwo = yearone + births - deaths + immigrants;
		yearthree = yeartwo + births - deaths + immigrants;
		yearfour = yearthree + births - deaths + immigrants;
		yearfive = yearfour + births - deaths + immigrants;
		
		System.out.println("Year One Population: " + yearone);
		System.out.println("Year Two Population: " + yeartwo);
		System.out.println("Year Three Population: " + yearthree);
		System.out.println("Year Four Population: " + yearfour);
		System.out.println("Year Five Population: " + yearfive);
		
	}

}
