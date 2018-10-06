import java.util.Scanner;

public class GGY_3_4_Test {

	Scanner in = new Scanner(System.in);

	String question[][] = new String[34][5];

	boolean tag = false;

	GGY_3_4_Test() {

		question[0][0] = "Surface ocean currents are set in motion by";
		question[0][1] = "global wind direction patterns.";
		question[0][2] = "depth of the ocean.";
		question[0][3] = "topography of the ocean bottom.";
		question[0][4] = "density of the water.";
		
		question[1][0] = "Although they are much less extensive today, glaciers covered a large part of the earth’s land area during the last ice age which ended about";
		question[1][1] = "10,000 years ago.";
		question[1][2] = "100 years ago.";
		question[1][3] = "100,000 years ago.";
		question[1][4] = "1,000 years ago.";
		
		question[2][0] = "A large destructive sea wave resulting from an earthquake is called a";
		question[2][1] = "tsunami.";
		question[2][2] = "tidal wave.";
		question[2][3] = "subduction.";
		question[2][4] = "Pangaea.";	

		question[3][0] = "At the June solstice, the North Pole receives 24 hours of daylight.";
		question[3][1] = "True";
		question[3][2] = "False";
		question[3][3] = "ignore";
		question[3][4] = "ignore";
		
		question[4][0] = "Which of the following statements about carbon dioxide in the atmosphere is NOT true?";
		question[4][1] = "It is not naturally occurring.";
		question[4][2] = "Its levels have increased due to burning coal, petroleum, and natural gas.";
		question[4][3] = "It is the primary greenhouse gas.";
		question[4][4] = "Its levels have increased due to deforestation.";
		
		question[5][0] = "Permafrost refers to areas";
		question[5][1] = "of permanently frozen ground.";
		question[5][2] = "where the nighttime temperatures dip below 0°C thus creating frost every morning.";
		question[5][3] = "withsnowcapped mountains.";
		question[5][4] = "where glaciers are present.";
		
		question[6][0] = "The angle of the sun's rays at a given time and date is most influenced by a location's";
		question[6][1] = "latitude.";
		question[6][2] = "longitude.";
		question[6][3] = "cloud cover.";
		question[6][4] = "distribution of land and water.";
		
		question[7][0] = "The most important erosional agent is";
		question[7][1] = "running water.";
		question[7][2] = "wind.";
		question[7][3] = "chemical oxidation.";
		question[7][4] = "groundwater flow.";
		
		question[8][0] = "Which statement is most accurate regarding temperatures at a given latitude in marine environments versus continental environments?";
		question[8][1] = "Compared to marine environments, continental environments are colder in winter and warmer in summer.";
		question[8][2] = "Compared to continental environments, marine environments are warmer in both winter and summer.";
		question[8][3] = "Compared to marine environments, continental environments are warmer in both winter and summer.";
		question[8][4] = "Compared to marine environments, continental environments are warmer in winter and cooler in summer.";
		
		question[9][0] = "Which of the following statements concerning a cyclonic storm is not correct?";
		question[9][1] = "In the Northern Hemisphere the winds move in a clockwise direction around the area of low pressure";
		question[9][2] = "The probability of cyclonic storms increases with increases in contrast of temperature and humidity between two air masses";
		question[9][3] = "It can be of either weak or strong intensity";
		question[9][4] = "It is a large system of air circulation centered on a region of low atmospheric pressure";
		
		question[10][0] = "Which of the following is a result of mass movement?";
		question[10][1] = "Talus slopes";
		question[10][2] = "Alluvial fans";
		question[10][3] = "Loess";
		question[10][4] = "Arroyos";
		
		question[11][0] = "A hilly depositional feature formed when a glacier melts is a";
		question[11][1] = "moraine.";
		question[11][2] = "tarn.";
		question[11][3] = "col.";
		question[11][4] = "cirque.";
		
		question[12][0] = "Which is NOT a likely consequence of global warming?";
		question[12][1] = "shorter growing seasons";
		question[12][2] = "melting glaciers";
		question[12][3] = "changes in precipitation patterns";
		question[12][4] = "rising sea levels";
		
		question[13][0] = "Earthquakes are most often caused by";
		question[13][1] = "pressure at lithospheric plate boundaries.";
		question[13][2] = "gradational processes.";
		question[13][3] = "hot spots.";
		question[13][4] = "mass movement.";
		
		question[14][0] = "In order to equalize air pressure imbalances, air moves from";
		question[14][1] = "high pressure to low pressure.";
		question[14][2] = "low pressure to high pressure.";
		question[14][3] = "high pressure to high pressure.";
		question[14][4] = "low pressure to low pressure.";
		
		question[15][0] = "The particles around which condensation nuclei are formed are";
		question[15][1] = "dust, pollen, and smoke.";
		question[15][2] = "water crystals, salt crystals, and ozone.";
		question[15][3] = "dust, water crystals, and salt crystals.";
		question[15][4] = "ozone, oxygen, and radon.";
		
		question[16][0] = "This depositional feature is created in arid regions when a stream exits the mountains and enters a flat lowland.";
		question[16][1] = "alluvial fan";
		question[16][2] = "delta";
		question[16][3] = "natural levee";
		question[16][4] = "oxbow-shaped lake";
		
		question[17][0] = "Which one of the following groups contains only sedimentary rocks?";
		question[17][1] = "conglomerate, limestone, shale";
		question[17][2] = "limestone, sandstone, granite";
		question[17][3] = "marble, basalt, conglomerate";
		question[17][4] = "slate, gneiss, marble";
		
		question[18][0] = "Fine-grained, windblown silt deposits are known as";
		question[18][1] = "loess.";
		question[18][2] = "till.";
		question[18][3] = "talus.";
		question[18][4] = "drift.";
		
		question[19][0] = "The two most important elements that differentiate weather conditions are";
		question[19][1] = "temperature and precipitation.";
		question[19][2] = "air pressure and precipitation.";
		question[19][3] = "air pressure and temperature.";
		question[19][4] = "precipitation and seasonal changes.";
		
		question[20][0] = "Characteristic vegetation of the steppe climate is";
		question[20][1] = "grass and desert shrubs.";
		question[20][2] = "tundra.";
		question[20][3] = "coniferous forest.";
		question[20][4] = "deciduous forest.";
		
		question[21][0] = "Rainfall is caused by";
		question[21][1] = "cooling of saturated air.";
		question[21][2] = "increasing air temperature.";
		question[21][3] = "decreasing relative humidity.";
		question[21][4] = "location along a rain shadow.";
		
		question[22][0] = "The theory of continental drift was formulated because";
		question[22][1] = "of the remarkable fit of the continents.";
		question[22][2] = "of the mountain ranges on the fringes of the Pacific Ocean.";
		question[22][3] = "scientists observed that the Atlantic Ocean was widening.";
		question[22][4] = "the landforms moved over faults.";
		
		question[23][0] = "Hurricanes are classified into categories based on all of the following EXCEPT";
		question[23][1] = "lifespan.";
		question[23][2] = "barometric pressure.";
		question[23][3] = "potential damage.";
		question[23][4] = "wind speed.";
		
		question[24][0] = "Energy from the sun is transformed into heat";
		question[24][1] = "primarily at the earth's surface and secondarily in the atmosphere.";
		question[24][2] = "by way of solar radiation, or insolation.";
		question[24][3] = "through the collection of solar energy.";
		question[24][4] = "by means of the circumpolar vortex.";
	
		question[25][0] = "The planetary wind and pressure belts";
		question[25][1] = "shift southward during our winter and northward during summer.";
		question[25][2] = "shift eastward during our winter and westward during summer.";
		question[25][3] = "keep their same position throughout the year.";
		question[25][4] = "shift northward during our winter and southward during summer.";
		
		question[26][0] = "The type of precipitation that is associated with hills and mountains is called";
		question[26][1] = "orographic.";
		question[26][2] = "frontal.";
		question[26][3] = "cyclonic.";
		question[26][4] = "convectional.";
		
		question[27][0] = "Orographic precipitation occurs";
		question[27][1] = "on the coastal, windward slopes of mountain ranges.";
		question[27][2] = "mostly in cumulonimbus clouds.";
		question[27][3] = "on the interior, leeward slopes of mountain ranges.";
		question[27][4] = "mostly in the tropical rainforest climate zone.";
		
		question[28][0] = "When neither the Northern nor the Southern Hemisphere is tilted toward the sun, the noon sun's vertical rays are felt at";
		question[28][1] = "the equator.";
		question[28][2] = "23.5° north and south latitude.";
		question[28][3] = "the summer solstice.";
		question[28][4] = "67.5° north and south latitude.";
		
		question[29][0] = "The seasonal wind that reverses direction during the year leading to dry and rainy seasons is";
		question[29][1] = "monsoon.";
		question[29][2] = "neap.";
		question[29][3] = "westerlies.";
		question[29][4] = "trade.";
		
		question[30][0] = "A tsunami can occur due to all of the following EXCEPT";
		question[30][1] = "a hydrolysis.";
		question[30][2] = "a volcanic eruption.";
		question[30][3] = "an earthquake.";
		question[30][4] = "an underwater landslide.";
		
		question[31][0] = "Hurricane Sandy is a good example of a storm causing";
		question[31][1] = "Coastal erosion";
		question[31][2] = "An earthquake induced cold front";
		question[31][3] = "A tsunami";
		question[31][4] = "Tides";
		
		question[32][0] = "Tropical climates (A) of the Köppen system do NOT include";
		question[32][1] = "Hot Deserts";
		question[32][2] = "Tropical rain forest";
		question[32][3] = "Monsoon";
		question[32][4] = "Savanna";
		
		question[33][0] = "The Fujita scale is used to measure the strength of";
		question[33][1] = "tornadoes.";
		question[33][2] = "hurricanes.";
		question[33][3] = "tsunami.";
		question[33][4] = "blizzards.";		

	}

	public static void main(String[] args) {

		GGY_3_4_Test test = new GGY_3_4_Test();

		while (true) {
			test.tag = false;
			test.clearConsole();
			System.out.println("1. Start GGY_3_4_Test\n2. Exit");
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
