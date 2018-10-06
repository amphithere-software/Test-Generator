import java.util.Scanner;

public class GGY_12_13_Test {

	Scanner in = new Scanner(System.in);

	String question[][] = new String[33][5];

	boolean tag = false;

	GGY_12_13_Test() {

		question[0][0] = "The two major drawbacks to the use of oil shale and oil sands as fuels are";
		question[0][1] = "cost of extraction and environmental damage.";
		question[0][2] = "lack of demand and air pollution";
		question[0][3] = "distance to markets and alternate sources.";
		question[0][4] = "transportation and storage.";
		
		question[1][0] = "A temperature inversion";
		question[1][1] = "can trap air pollutants near the surface, causing serious human health effects.";
		question[1][2] = "occurs when air temperatures decreases with height above the earth’s surface.";
		question[1][3] = "decreases the effects of air pollution through dilution.";
		question[1][4] = "typically lasts for several weeks.";
		
		question[2][0] = "Hydropower accounts for more than 75 percent of the electricity produced in all of the following countries except";
		question[2][1] = "United States.";
		question[2][2] = "Switzerland.";
		question[2][3] = "New Zealand.";
		question[2][4] = "Brazil.";	

		question[3][0] = "Semiconductor devices made of silicon that generate electricity directly from solar rays are called";
		question[3][1] = "photovoltaic cells.";
		question[3][2] = "heat insulators.";
		question[3][3] = "stellar conductors.";
		question[3][4] = "silicate generators.";
		
		question[4][0] = "What is the primary source of air pollution in the United States?";
		question[4][1] = "Transportation";
		question[4][2] = "Industry";
		question[4][3] = "Fuel combustion from stationary sources";
		question[4][4] = "Solid waste incineration";
		
		question[5][0] = "The largest volumes of transboundary shipments of hazardous wastes are exported from _______ to ________.";
		question[5][1] = "Developed countries/developing countries";
		question[5][2] = "Europe/the United States";
		question[5][3] = "Africa/the United States";
		question[5][4] = "developing countries/developed countries";
		
		question[6][0] = "Conventional nuclear power stations";
		question[6][1] = "produce steam that drives turbines to generate electricity.";
		question[6][2] = "are called ‘breeder’ reactors.";
		question[6][3] = "develop thermal electricity through nuclear fusion.";
		question[6][4] = "use plutonium as a raw material.";
		
		question[7][0] = "Which is NOT true of the Gulf of Mexico dead zone?";
		question[7][1] = "It is largely the result of sewage dumping by large cities along the Mississippi River.";
		question[7][2] = "Fish, crabs, and other aquatic creatures cannot survive.";
		question[7][3] = "Its size varies from year to year.";
		question[7][4] = "It is located near the mouth of the Mississippi River.";
		
		question[8][0] = "Ozone layer depletion is believed to be caused chiefly by";
		question[8][1] = "chlorofluorocarbon (CFC) emissions.";
		question[8][2] = "particulate pollution";
		question[8][3] = "buildup of carbon dioxide.";
		question[8][4] = "ultraviolet (UV) radiation.";
		
		question[9][0] = "The part of a mineral reserve that can be profitably exploited is called the";
		question[9][1] = "proved reserves.";
		question[9][2] = "renewable reserves.";
		question[9][3] = "recognized reserves.";
		question[9][4] = "potential reserves.";
		
		question[10][0] = "Despite social and environmental concerns, the largest dam in the world was completed in 2012 in which country?";
		question[10][1] = "China";
		question[10][2] = "Canada";
		question[10][3] = "United States";
		question[10][4] = "Russia";
		
		question[11][0] = "Which of the following places the greatest demand on freshwater supplies?";
		question[11][1] = "irrigated agriculture";
		question[11][2] = "households and cities";
		question[11][3] = "waste disposal";
		question[11][4] = "industrial production";
		
		question[12][0] = "Quantities of a resource that can be extracted profitably from known deposits are known as what kind of reserves?";
		question[12][1] = "Proved";
		question[12][2] = "Power";
		question[12][3] = "Exploratory";
		question[12][4] = "Artificial";
		
		question[13][0] = "The part of the world most at risk from desertification is";
		question[13][1] = "Africa.";
		question[13][2] = "Central America.";
		question[13][3] = "China.";
		question[13][4] = "India.";
		
		question[14][0] = "Species that are present in such low numbers that they are in immediate jeopardy of becoming extinct in the wild are said to be";
		question[14][1] = "endangered.";
		question[14][2] = "defenseless.";
		question[14][3] = "vulnerable.";
		question[14][4] = "jeopardized.";
		
		question[15][0] = "Water pollution is widespread because";
		question[15][1] = "water so easily receives the wastes of agriculture, industry, and cities.";
		question[15][2] = "increasing world aridity limits the number of water sources that can be used for waste disposal.";
		question[15][3] = "once a stream or lake is polluted; there is no way to restore it to usable quality.";
		question[15][4] = "water has a very low tolerance to either natural or artificial contaminants.";
		
		question[16][0] = "The largest underground water supply in the U.S. is located in the";
		question[16][1] = "high plains from South Dakota to west Texas.";
		question[16][2] = "Florida everglades.";
		question[16][3] = "Tennessee valley.";
		question[16][4] = "Great Lakes basin.";
		
		question[17][0] = "Which one of the following is an example of a non-point source of water pollution?";
		question[17][1] = "road salt";
		question[17][2] = "coal mine";
		question[17][3] = "sewage treatment plant";
		question[17][4] = "power generating plant";
		
		question[18][0] = "In the United States, the federal standards requiring each automaker s fleet of new passenger cars to average 27.5 miles per gallon are known as";
		question[18][1] = "Corporate Average Fuel Economy (CAFE).";
		question[18][2] = "Automaker Gallon Average (AGA).";
		question[18][3] = "Auto Fleet Average (AFA).";
		question[18][4] = "Passenger Car Fuel Efficiency (PCFE).";
		
		question[19][0] = "Which of the following would NOT be an example of how people have disrupted wildlife habitats?";
		question[19][1] = "killing elephants for their ivory tusks";
		question[19][2] = "burning a forest to plant crops";
		question[19][3] = "erecting fences to protect cattle";
		question[19][4] = "using a tidal marsh as a landfill";
		
		question[20][0] = "Which of the following is a potentially renewable resource?";
		question[20][1] = "groundwater";
		question[20][2] = "coal";
		question[20][3] = "wind energy";
		question[20][4] = "crude oil";
		
		question[21][0] = "Places where thermal pollution causes fish to die are typically";
		question[21][1] = "near electric power plants.";
		question[21][2] = "near the equator.";
		question[21][3] = "in areas of bright sunlight and shallow waters.";
		question[21][4] = "in the vicinity of warm ocean currents.";
		
		question[22][0] = "Which of the following statements is not true about coal?";
		question[22][1] = "Coal is widely used because it is inexpensive to mine and transport";
		question[22][2] = "At the present rate of use, coal reserves will last for centuries";
		question[22][3] = "Coal fueled the Industrial Revolution";
		question[22][4] = "The value of coal is determined by its rank, grade and accessibility";
		
		question[23][0] = "In the United States, two-thirds of all oil consumption is used for what purpose?";
		question[23][1] = "Transportation";
		question[23][2] = "Power plants";
		question[23][3] = "Manufacturing";
		question[23][4] = "Petroleum-based products";
		
		question[24][0] = "Which pair of countries receives more than 75 percent of their electricity from nuclear power?";
		question[24][1] = "France and Lithuania";
		question[24][2] = "Denmark and Italy";
		question[24][3] = "Japan and China";
		question[24][4] = "The United States and Canada";
	
		question[25][0] = "Mountaintop removal mining (MTR) began in which region in the 1970s?";
		question[25][1] = "Appalachian Mountains";
		question[25][2] = "Ozark Plateau";
		question[25][3] = "Pacific Northwest";
		question[25][4] = "New England";
		
		question[26][0] = "Air pollution";
		question[26][1] = "is caused primarily by burning fossil fuels.";
		question[26][2] = "is not a significant problem in developing countries.";
		question[26][3] = "may have serious consequences for human health but rarely affects plant life.";
		question[26][4] = "first occurred as a result of the Industrial Revolution and the use of fossil fuels by factories.";
		
		question[27][0] = "Ozone is a noxious pollutant at both ground level and high in the stratosphere.";
		question[27][1] = "False";
		question[27][2] = "True";
		question[27][3] = "ignore";
		question[27][4] = "ignore";
		
		question[28][0] = "Worldwide, which activity accounts for the greatest percentage of freshwater usage?";
		question[28][1] = "Agriculture";
		question[28][2] = "Industry";
		question[28][3] = "Urbanization";
		question[28][4] = "Mining";
		
		question[29][0] = "The largest of the commercial forest belts in the world includes";
		question[29][1] = "the upper-middle latitudes of the Northern Hemisphere.";
		question[29][2] = "most of Australia, Africa, and South America.";
		question[29][3] = "the western interiors of continents in subtropical latitudes.";
		question[29][4] = "the Arctic regions of Russia and Canada.";
		
		question[30][0] = "The Ogallala Aquifer is";
		question[30][1] = "a source of groundwater in the Great Plains that is being depleted faster than it is naturally renewed.";
		question[30][2] = "a geologic formation that is ideal for storage of high-level hazardous waste.";
		question[30][3] = "a source of groundwater in Florida that is being depleted faster than it is naturally renewed.";
		question[30][4] = "a vast system of canals in the Everglades.";
		
		question[31][0] = "Which of the following factors does NOT affect the type and degree of air pollution found at a given place?";
		question[31][1] = "ozone layer";
		question[31][2] = "topography";
		question[31][3] = "wind patterns";
		question[31][4] = "level of industrialization";
		
		question[32][0] = "In the process of biological magnification, the most threatened trophic level is the";
		question[32][1] = "ultimate consumer.";
		question[32][2] = "initial consumer.";
		question[32][3] = "herbivore.";
		question[32][4] = "decomposer.";		

	}

	public static void main(String[] args) {

		GGY_12_13_Test test = new GGY_12_13_Test();

		while (true) {
			test.tag = false;
			test.clearConsole();
			System.out.println("1. Start GGY_12_13_Test\n2. Exit");
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
