import java.util.Scanner;

public class Test9_10_11 {

	Scanner in = new Scanner(System.in);

	String question[][] = new String[38][5];

	boolean tag = false;

	Test9_10_11() {

		question[0][0] = "Secondary industries are concerned with";
		question[0][1] = "Adding value to materials by changing their form or combining them into more useful commodities.";
		question[0][2] = "extraction of natural resources.";
		question[0][3] = "retailing and wholesaling activities.";
		question[0][4] = "information processing.";
		
		question[1][0] = "Sustainable agriculture adherents emphasize an increase in";
		question[1][1] = "Farm diversification";
		question[1][2] = "The use of fertilizers";
		question[1][3] = "Food supply";
		question[1][4] = "The use of pesticides and herbicides";
		
		question[2][0] = "Zoning regulations serve all of the following legitimate purposes EXCEPT";
		question[2][1] = "to insure homogeneity of ethnicity in keeping with already existing neighborhood characteristics.";
		question[2][2] = "to provide land for certain private uses, such as shopping centers.";
		question[2][3] = "to exclude undesirable land uses, such as waste disposal sites, from residential neighborhoods.";
		question[2][4] = "to provide for the creation in appropriate location of government buildings";	

		question[3][0] = "The term Green Revolution refers to";
		question[3][1] = "seed and management techniques that lead to greater farmland productivity.";
		question[3][2] = "the greening of America.";
		question[3][3] = "reforestation programs in former tropical rain forests.";
		question[3][4] = "environmental programs sponsored by the United Nations.";
		
		question[4][0] = "Population density in U.S. central cities is";
		question[4][1] = "low at the center, highest in the zone just outside the center, and decreases gradually toward the suburbs.";
		question[4][2] = "gradually increases from the center to the suburbs.";
		question[4][3] = "relatively uniform and related to economic base.";
		question[4][4] = "greatest at the center and gradually decreases toward the suburbs.";
		
		question[5][0] = "The term used to describe a place settlement in relation to the physical and cultural characteristics of other areas is";
		question[5][1] = "situation.";
		question[5][2] = "settlement.";
		question[5][3] = "site.";
		question[5][4] = "hinterland.";
		
		question[6][0] = "In which regions nomadic herding least likely to be found?";
		question[6][1] = "Southeast Asia";
		question[6][2] = "Sahara Desert";
		question[6][3] = "Northern Scandinavia";
		question[6][4] = "Mongolia";
		
		question[7][0] = "According to the United Nations, urban agriculture accounts for what portion of the world's total food production?";
		question[7][1] = "One-seventh";
		question[7][2] = "One-tenth";
		question[7][3] = "One-fifth";
		question[7][4] = "One-third";
		
		question[8][0] = "Which of the following statements with regard to poverty in U.S. cities is not true?";
		question[8][1] = "Men depend more than do women on public transportation";
		question[8][2] = "The central cities have more households headed by women than men";
		question[8][3] = "The majority of poor people live in central cities";
		question[8][4] = "The majority of elderly people live in downtowns";
		
		question[9][0] = "In planned economies, the location of manufacturing";
		question[9][1] = "is relatively immobile compared to market economies.";
		question[9][2] = "is determined by availability of labor and by regional comparative advantage.";
		question[9][3] = "need pay no attention to cost of inputs.";
		question[9][4] = "may be determined by other than competitive market forces.";
		
		question[10][0] = "Despite the fact that this industry makes up less than 10 percent of world trade, it has been the road block in all global trade talks";
		question[10][1] = "agriculture.";
		question[10][2] = "mining.";
		question[10][3] = "manufacturing.";
		question[10][4] = "high tech.";
		
		question[11][0] = "The totality of physical facilities and public services existing at a place are known as that locale's";
		question[11][1] = "infrastructure.";
		question[11][2] = "operational medium.";
		question[11][3] = "support base.";
		question[11][4] = "service framework.";
		
		question[12][0] = "According to the concentric zone model, land uses are arranged in which order, moving outward from the center of the city?";
		question[12][1] = "CBD, zone of transition, zone of industrial workers, zone of better residences, commuter zone";
		question[12][2] = "CBC, zone of industrial workers, zone of transition, zone of better residences, commuter zone";
		question[12][3] = "CBD, zone of transition, zone of industrial workers, commuter zone, zone of better residences";
		question[12][4] = "zone of industrial workers, zone of transition, zone of better residences, CBD, commuter zone";
		
		question[13][0] = "The basic sector of an urban area's economy consists of";
		question[13][1] = "the activities that bring in money from outside the area.";
		question[13][2] = "an efficient transportation system.";
		question[13][3] = "retail functions that serve local customers.";
		question[13][4] = "its schools and city government.";
		
		question[14][0] = "What terms refers to the clustering of productive activities and people for mutual advantage?";
		question[14][1] = "Agglomeration";
		question[14][2] = "Multiplier effect";
		question[14][3] = "Infrastructure";
		question[14][4] = "Spatial margin of profitability";
		
		question[15][0] = "What is the name used to describe a city with over 10 million in population?";
		question[15][1] = "Megacity";
		question[15][2] = "Suburban metropolis";
		question[15][3] = "Metropolitan area";
		question[15][4] = "Megalopolis";
		
		question[16][0] = "Many foreign-owned factories have relocated to China, Taiwan and similar areas because of";
		question[16][1] = "lower labor costs.";
		question[16][2] = "their proximity to major populations.";
		question[16][3] = "political instability in Europe.";
		question[16][4] = "more highly skilled workers.";
		
		question[17][0] = "Which of the following statements regarding the role of women in agriculture is not correct?";
		question[17][1] = "Women farmers share equally with men farmers in the rewards from agriculture.";
		question[17][2] = "Women farmers are responsible for at least fifty percent of the world's food";
		question[17][3] = "The advances from Green Revolution were unkind to women in that it reduced the female role in agricultural development programs";
		question[17][4] = "Women farmers work longer hours for lower wages than men farmers";
		
		question[18][0] = "Energy conservation and environmental sustainability requires that";
		question[18][1] = "Walking cities are created";
		question[18][2] = "Mass-transit to older suburbs is increased";
		question[18][3] = "There is a return to rural environments";
		question[18][4] = "Urban areas' housing becomes less dense";
		
		question[19][0] = "Central place theory is concerned with";
		question[19][1] = "the location, size, and spacing of population centers.";
		question[19][2] = "the relation between site and topographic features.";
		question[19][3] = "land uses in central areas of cities.";
		question[19][4] = "the land major metropolitan areas.";
		
		question[20][0] = "Tertiary activities include";
		question[20][1] = "Consumer services and business services";
		question[20][2] = "Raw material oriented locations and raw material transportation";
		question[20][3] = "Tourism and ship-buildings";
		question[20][4] = "Gambling and casino construction";
		
		question[21][0] = "The Green Revolution";
		question[21][1] = "increases output through use of high-yielding crop varieties and altered management practices.";
		question[21][2] = "refers to rebellions of Third World peasant farmers.";
		question[21][3] = "has initiated a reverse flow of population from urban slums to newly productive farmlands.";
		question[21][4] = "has made traditional shifting cultivation practices more productive.";
		
		question[22][0] = "The overwhelming primacy of the capital city in many developing countries is in part a result of";
		question[22][1] = "past colonial heritage.";
		question[22][2] = "a dictatorial form of government.";
		question[22][3] = "an inability to get people to concentrate in other urban areas.";
		question[22][4] = "the need to keep the countryside rural to produce food.";
		
		question[23][0] = "In comparison to cities in the United States, which of the following characteristics of Canadian cities is not correct?";
		question[23][1] = "Canadian cities have taller buildings";
		question[23][2] = "Canadian cities have higher density";
		question[23][3] = "Canadian cities have less suburbanization";
		question[23][4] = "Canadian cities are more compact";
		
		question[24][0] = "Approximately what percentage of the United States and other western nations is urban?";
		question[24][1] = "76 percent";
		question[24][2] = "26 percent";
		question[24][3] = "96 percent";
		question[24][4] = "56 percent";
	
		question[25][0] = "'Sister' plants to American companies that are established in Mexico within 12 miles of the US border for duty free-assembly of products destined for re-export are";
		question[25][1] = "maquiladoras.";
		question[25][2] = "fabricas.";
		question[25][3] = "ciudads.";
		question[25][4] = "plantas.";
		
		question[26][0] = "Three categories of economic activities included in the business services sector of the economy include";
		question[26][1] = "finance, insurance, and real estate";
		question[26][2] = "agriculture, gathering industries, and extractive industries.";
		question[26][3] = "retail trade, wholesale trade, and consumer services.";
		question[26][4] = "manufacturing, construction, and power production.";
		
		question[27][0] = "All of the following statements about agriculture in market economic systems are true EXCEPT";
		question[27][1] = "in response to low crop prices and overproduction, it is being replaced by intensive subsistence farming.";
		question[27][2] = "it involves intensive land use near markets and extensive land use at more distant locations.";
		question[27][3] = "the crop or livestock mix selected by commercial farmers reflects assessment of production and marketing costs and market demands and prices";
		question[27][4] = "that it is characterized by specialization, profit, and interdependence.";
		
		question[28][0] = "The least-cost theory of industrial location was proposed by";
		question[28][1] = "Alfred Weber.";
		question[28][2] = "Walter Christaller.";
		question[28][3] = "Ted Fujita.";
		question[28][4] = "Alfred Wegener.";
		
		question[29][0] = "In which region of the United States are the majority of the country's fastest growing metropolitan areas?";
		question[29][1] = "Sunbelt";
		question[29][2] = "East";
		question[29][3] = "Great Lakes";
		question[29][4] = "North";
		
		question[30][0] = "The total economic structure of the city equals";
		question[30][1] = "the sum of its basic and nonbasic activities.";
		question[30][2] = "its nonbasic activities.";
		question[30][3] = "the difference between its basic and nonbasic activities.";
		question[30][4] = "its basic activities.";
		
		question[31][0] = "Market equilibrium is marked by the intersection of";
		question[31][1] = "Supply and demand curves";
		question[31][2] = "Primary and service activities";
		question[31][3] = "The physical and cultural environment";
		question[31][4] = "Subsistence and commercial activities";
		
		question[32][0] = "The forerunner of a wider, new pattern of world industrialization that has emerged in recent years is";
		question[32][1] = "Eastern Asia.";
		question[32][2] = "Northeastern United States.";
		question[32][3] = "Mexico.";
		question[32][4] = "Australia.";
		
		question[33][0] = "The phenomenon by which the poor and minorities are trapped in a central city while job creation takes place in the suburbs is called a(n)";
		question[33][1] = "spatial mismatch.";
		question[33][2] = "mobility blues.";
		question[33][3] = "unemployment effect.";
		question[33][4] = "occupational hazard.";
		
		question[34][0] = "In contrast to U.S. cities of the same size, Canadian cities are";
		question[34][1] = "More densely settled";
		question[34][2] = "Less compact";
		question[34][3] = "More suburbanized";
		question[34][4] = "Lower in building density";
		
		question[35][0] = "Central place theory assumes";
		question[35][1] = "consumers will purchase goods and services from the nearest store.";
		question[35][2] = "demand for goods and services is insatiable.";
		question[35][3] = "the terrain includes mountains and valleys.";
		question[35][4] = "only motor transport is available.";
		
		question[36][0] = "Urbanization increases in direct proportion with";
		question[36][1] = "industrialization.";
		question[36][2] = "zero population growth.";
		question[36][3] = "crude birth rate.";
		question[36][4] = "exclusionary zoning.";
		
		question[37][0] = "Central place theory predicts all of the following EXCEPT";
		question[37][1] = "all towns and cities offer the same products and services.";
		question[37][2] = "there will be more small towns and larger towns.";
		question[37][3] = "towns of the same size will be evenly spaced.";
		question[37][4] = "larger towns will have larger market areas than smaller towns.";
		


	}

	public static void main(String[] args) {

		Test9_10_11 test = new Test9_10_11();

		while (true) {
			test.tag = false;
			test.clearConsole();
			System.out.println("1. Start Test9_10_11\n2. Exit");
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
