import java.util.Scanner;

public class TestGeo2 {

	Scanner in = new Scanner(System.in);

	String question[][] = new String[25][5];

	boolean tag = false;

	TestGeo2() {

		question[0][0] = "Approxamately what percentage of the United States and other western nations is urban?";
		question[0][1] = "76 percent";
		question[0][2] = "26 percent";
		question[0][3] = "96 percent";
		question[0][4] = "56 percent";
		
		question[1][0] = "In general, which of these units has the largest area?";
		question[1][1] = "metropolitan area";
		question[1][2] = "suburbs";
		question[1][3] = "urbanized area";
		question[1][4] = "central city";
		
		question[2][0] = "Most of the world's population live in...";
		question[2][1] = "an urban area.";
		question[2][2] = "urban areas of the less developed countries.";
		question[2][3] = "rural areas of teh industrialized countries.";
		question[2][4] = "rural, agrarian areas.";	

		question[3][0] = "The most important factor necessary to the formation of the earliest cities was";
		question[3][1] = "agricultural surplus.";
		question[3][2] = "defensible situation.";
		question[3][3] = "access to water.";
		question[3][4] = "spiritual leadership.";
		
		question[4][0] = "A common locational feature associated with the growth of large cities is.";
		question[4][1] = "a break-in-bulk location.";
		question[4][2] = "great distances from hubs of transportation routes.";
		question[4][3] = "a location in the deap interior of continents, in accordance with the heartland theory.";
		question[4][4] = "a location north of the 60th parrallel";
		
		question[5][0] = "The basic sector of an urban area's economy consists of";
		question[5][1] = "the activities that bring in money from outside the area.";
		question[5][2] = "an efficient transportation system.";
		question[5][3] = "retail functions that serve local customers.";
		question[5][4] = "it schools and city government.";
		
		question[6][0] = "The multiplier effect means that";
		question[6][1] = "new basic jobs will generate additional non-basic jobs";
		question[6][2] = "new non-basic jobs will generate additional basic jobs.";
		question[6][3] = "regardless of city size, there is a constant ratio of basic to non-basic jobs.";
		question[6][4] = "service sector jobs will replace manufacturing sector jobs.";
		
		question[7][0] = "Population density in U.S. central cities is";
		question[7][1] = "low at the center, highest in the zone just outside the center, and decreases gradually toward the suburbs.";
		question[7][2] = "relatively uniform and related to economic base.";
		question[7][3] = "gradually increases from the center to the suburbs.";
		question[7][4] = "greatest at the center and gradually decreases toward the suburbs.";
		
		question[8][0] = "The rank-size rule tells us that the fourth largest urban area in a region will be ___ the size of the largest urban area.";
		question[8][1] = "one-quarter";
		question[8][2] = "one-half";
		question[8][3] = "one-eighth";
		question[8][4] = "twice";
		
		question[9][0] = "In the social area analysis of cities, social status is based on all the following factors EXCEPT";
		question[9][1] = "race/ethnicity.";
		question[9][2] = "education.";
		question[9][3] = "income.";
		question[9][4] = "occupation.";
		
		question[10][0] = "The main shopping and financial heart of a city is called the";
		question[10][1] = "central business district.";
		question[10][2] = "Standard Metroplitan Statistical Area.";
		question[10][3] = "point of accessibility.";
		question[10][4] = "concentric zone.";
		
		question[11][0] = "The movement of middle-class people to deteriorated portions of the inner city and restoration of deriorated housing is called";
		question[11][1] = "gentrification.";
		question[11][2] = "exurbanization.";
		question[11][3] = "homelessness.";
		question[11][4] = "displacement.";
		
		question[12][0] = "Land use types, in order of increasing land values per unit of land are";
		question[12][1] = "agricultural, residential, and commercial";
		question[12][2] = "residential, agricultural, and commercial";
		question[12][3] = "commercial, industrial, and residential";
		question[12][4] = "residential, commercial, and agricultural";
		
		question[13][0] = "According to Christaller's model of central places. towns are surrounded by";
		question[13][1] = "hexagonal shaped trade areas.";
		question[13][2] = "square shaped trade areas.";
		question[13][3] = "circular shaped trade areas.";
		question[13][4] = "pentagonal shaped trade areas.";
		
		question[14][0] = "Central place theory predicts all of the following EXCEPT";
		question[14][1] = "all towns and cities offer the same products and services.";
		question[14][2] = "larger towns will have larger market areas than smaller towns.";
		question[14][3] = "towns of the same size will be evenly spaced.";
		question[14][4] = "there will be more small towns than larger towns.";
		
		question[15][0] = "The term used to describe a place settlement in relation to the physical and cultural characteristics of other areas is";
		question[15][1] = "situation";
		question[15][2] = "settlement";
		question[15][3] = "site";
		question[15][4] = "hinterland";
		
		question[16][0] = "Which of the following statements is an example of the site of the city?";
		question[16][1] = "Pittsburgh is located at the confluence of the Ohio, Allegheny and Monogahela Rivers";
		question[16][2] = "Seattle is located in the Pacific northwest";
		question[16][3] = "Dubuque, Iowa, is in the heart of the midwestern Corn Belt";
		question[16][4] = "Chicago is approximately 850 miles from New York City";
		
		question[17][0] = "According to the concentric zone model, land uses are arranged in which order, moving outward from the center of the city?";
		question[17][1] = "CBD, zone of transition, zone of industrial workers, zone of better residences, commuter zone";
		question[17][2] = "CBD, zone of transition, zone of industrial workers, commuter zone, zone of better residences";
		question[17][3] = "CBD, zone of industrial workers, zone of transition, zone of better residences, commuter zone";
		question[17][4] = "zone of industrial workers, zone of transition, zone of better residences, CBD, commuter zone";
		
		question[18][0] = "Social areas within a city are defined by";
		question[18][1] = "family status, ethnicity and social status";
		question[18][2] = "social status, family status and zoning laws";
		question[18][3] = "businesses, industries and residences";
		question[18][4] = "economic base, ethnicity and residences";
		
		question[19][0] = "All of the following statements about primate cities are true EXCEPT that they";
		question[19][1] = "are located close to the geographic center of the country";
		question[19][2] = "are often the national capital";
		question[19][3] = "attract low-income migrants from rural areas";
		question[19][4] = "are more than twice as large as the second largest city in the country";
		
		question[20][0] = "In what part of the world do cities commonly have a historic core area contained within the remains of walls and a greenbelt on the periphery?";
		question[20][1] = "Europe";
		question[20][2] = "Asia";
		question[20][3] = "Africa";
		question[20][4] = "Latin America";
		
		question[21][0] = "Before the middle part of the nineteenth century, all major cities in the United States were located adjacent to";
		question[21][1] = "navigable waterways";
		question[21][2] = "major airports";
		question[21][3] = "paved highways";
		question[21][4] = "railroads";
		
		question[22][0] = "Manufacturing cities in the United States are most heavily concentrate in the";
		question[22][1] = "Northeast to Midwest";
		question[22][2] = "Great Plains";
		question[22][3] = "Pacific Coast";
		question[22][4] = "South";
		
		question[23][0] = "The Boston-to-Washington corridor, where metropolitian areas are coalescing, is an example of";
		question[23][1] = "a megalopolis";
		question[23][2] = "an urbanized area";
		question[23][3] = "an urban influence zone";
		question[23][4] = "edge cities";
		
		question[24][0] = "Cities are growing particularly rapidly in Asia and Africa mainly because of";
		question[24][1] = "The transition to a commercial agricultural economy from one of industrialization";
		question[24][2] = "The great migration from urban to rural enironments";
		question[24][3] = "People flocking to cities seeking a better life";
		question[24][4] = "Lower fertility rates that make it difficult for agricultural areas to feed its population";
	
	}

	public static void main(String[] args) {

		TestGeo2 test = new TestGeo2();

		while (true) {
			test.tag = false;
			test.clearConsole();
			System.out.println("1. Start TestGeo2\n2. Exit");
			System.out.print("\nChoice: ");
			String s = test.in.nextLine();
			switch (s) {

			case "1":
				test.Start1();
				s = "";
				break;
			case "2":
				System.exit(0);
				break;
			default:
				break;

			}

		}

	}

	void Start1() {

		for (int i = 0; i < question.length; i++) {

			if (tag)
				break;

			clearConsole();

			System.out.println(question[i][0] + "\n");

			Shuffle1(i);

		}

	}


	int Shuffle1(int index) {

		int num1 = 0, num2 = 0, num3 = 0;

		int placement;
		String choice = "";
		int c = 6;

		placement = (int) (Math.random() * 4 + 1);
				
		do {
			num1 = (int) (Math.random() * 4 + 1);
		}while(question[index][num1].equals(question[index][1]));
				
		do {
			num2 = (int) (Math.random() * 4 + 1);
		}while(question[index][num2].equals(question[index][1]) || num2 == num1);
				
		do {
			num3 = (int) (Math.random() * 4 + 1);
		}while(question[index][num3].equals(question[index][1]) || num3 == num2 || num3 == num1);		
		

		if (placement == 1) {
			System.out.println("\t1. " + question[index][1]);
			System.out.println("\t2. " + question[index][num1]);
			System.out.println("\t3. " + question[index][num2]);
			System.out.println("\t4. " + question[index][num3]);
		}
		if (placement == 2) {
			System.out.println("\t1. " + question[index][num1]);
			System.out.println("\t2. " + question[index][1]);
			System.out.println("\t3. " + question[index][num2]);
			System.out.println("\t4. " + question[index][num3]);

		}
		if (placement == 3) {
			System.out.println("\t1. " + question[index][num1]);
			System.out.println("\t2. " + question[index][num2]);
			System.out.println("\t3. " + question[index][1]);
			System.out.println("\t4. " + question[index][num3]);

		}
		if (placement == 4) {
			System.out.println("\t1. " + question[index][num1]);
			System.out.println("\t2. " + question[index][num2]);
			System.out.println("\t3. " + question[index][num3]);
			System.out.println("\t4. " + question[index][1]);

		}
		System.out.println("\n\t5. Skip");
		System.out.println("\t6. Exit");

		System.out.print("\n");

		System.out.print("Choice: ");

		while (c != placement) {

			choice = in.nextLine();

			if (choice.equalsIgnoreCase("5"))
				break;
			if (choice.equalsIgnoreCase("6")) {
				tag = true;
				break;
			}

			try {
				c = Integer.parseInt(choice);
			} catch (Exception e) {

			}

			if (c != placement)
				System.out.print("Try Again: ");

		}

		return 0;

	}

	public final void clearConsole() {

		try {
			final String os = System.getProperty("os.name");

			if (os.contains("Windows")) {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} else {
				System.out.print("\033[H\033[2J");

			}
		} catch (final Exception e) {

		}
	}
}
