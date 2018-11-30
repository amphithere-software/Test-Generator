import java.util.Scanner;

public class TestGeo {

	Scanner in = new Scanner(System.in);

	String question[][] = new String[28][5];

	boolean tag = false;

	TestGeo() {

		question[0][0] = "A characteristic of modern economic growth is";
		question[0][1] = "Secondary activities are replaced by service activities.";
		question[0][2] = "Subsistence societies bypass secondary-stage processing and move to teritary activities.";
		question[0][3] = "Service activities are replaced by secondary activities.";
		question[0][4] = "That the importance of agriculture as an employer of labor increases.";
		
		question[1][0] = "In Weber's least-cost theory of industrial location, the major factor in the location of industry is";
		question[1][1] = "transportation costs.";
		question[1][2] = "government subsidies.";
		question[1][3] = "labor costs.";
		question[1][4] = "import and export tariffs.";
		
		question[2][0] = "Which is not one of the three primary expenses to be minimized in Weber's least-cost theory for industrial location decisions?";
		question[2][1] = "advertising costs";
		question[2][2] = "agglomeration costs";
		question[2][3] = "labor costs";
		question[2][4] = "transport costs";	

		question[3][0] = "Three dominating characteristics of market-based economic systems are";
		question[3][1] = "specialization, profit motivation, and interdependence.";
		question[3][2] = "profit equilibrium, market competition, and variable pricing.";
		question[3][3] = "comparative advantage, market equilibrium, and inelastic demand.";
		question[3][4] = "urbanization, production equilibrium, and monetary exchange.";
		
		question[4][0] = "In planned economies, the location of manufacturing";
		question[4][1] = "is relatively immobile compared to market economies";
		question[4][2] = "is determined by availability of labor and by regional comparative advantage.";
		question[4][3] = "need pay no attention to cost of inputs.";
		question[4][4] = "may be determined by other than competitive market forces.";
		
		question[5][0] = "Secondary activities differ from tertiary activity in that";
		question[5][1] = "secondary activity is raw material oriented; tertiary industry is footloose.";
		question[5][2] = "secondary activity is ubiquitous; tertiary industry is market oriented.";
		question[5][3] = "secondary industry is footloose; tertiary activity is locationally fixed.";
		question[5][4] = "secondary activities generate the highest percentage of total output in high income countries.";
		
		question[6][0] = "Economies of agglomeration refer to";
		question[6][1] = "clustering of firms to take advantage of shared infrastructure, services and skilled workers.";
		question[6][2] = "vertical integration of economic production.";
		question[6][3] = "the spiral orientation tendencies of bulk-gaining secondary activities.";
		question[6][4] = "the comparative advantage of transnational corporations.";
		
		question[7][0] = "The supply curve indicates that as the price of a good increases,";
		question[7][1] = "more of it will be offered for sale.";
		question[7][2] = "the demand for it will increase.";
		question[7][3] = "there will be fewer producers.";
		question[7][4] = "greater specialization will occur.";
		
		question[8][0] = "Market equilibrium is marked by the intersection of";
		question[8][1] = "Supply and demand curves";
		question[8][2] = "Subsistence and commercial activities";
		question[8][3] = "The physical and cultural environment";
		question[8][4] = "Primary and service activities";
		
		question[9][0] = "In general, the more economically advanced a society is, the more its output will be concentrated in";
		question[9][1] = "services";
		question[9][2] = "transportation and communications";
		question[9][3] = "manufacturing";
		question[9][4] = "agriculture";
		
		question[10][0] = "Manufacturing industries engaged in bulk or weight reduction operations are";
		question[10][1] = "raw material oriented.";
		question[10][2] = "part of the quaternary sector.";
		question[10][3] = "involved in diet plan promotions.";
		question[10][4] = "examples of high-tech manufacturing.";
		
		question[11][0] = "Which of the following industries is LEAST likely to locate near the market for its finished products?";
		question[11][1] = "plywood mill";
		question[11][2] = "mattress manufacturing";
		question[11][3] = "automobile assembly";
		question[11][4] = "soft drink and beer bottling";
		
		question[12][0] = "A good example of market-oriented industry is";
		question[12][1] = "Baked goods manufacturing";
		question[12][2] = "Aluminum manufacturing";
		question[12][3] = "High-end automobile manufacturing";
		question[12][4] = "Fish processing";
		
		question[13][0] = "Dispite making up less than 10% of the total value of world trade, trade talks have been stymied by lack of agreement over trade in";
		question[13][1] = "agricultural products";
		question[13][2] = "services";
		question[13][3] = "high technology products.";
		question[13][4] = "minerals";
		
		question[14][0] = "New advances in information technology and data transmission have";
		question[14][1] = "enhanced the comparative advantage of developing countries in labor-intensive services";
		question[14][2] = "by-passed less developed countries, damaging further their already poor economic prospects";
		question[14][3] = "reduced the international tradability of services as home country quaternary activities expand";
		question[14][4] = "discouraged foreign direct investment and favored domestic high-tech concentrations";
		
		question[15][0] = "Which one of the following is NOT a major manufacturing region of the world?";
		question[15][1] = "Central Africa";
		question[15][2] = "Eastern Anglo America";
		question[15][3] = "Central and Western Europe";
		question[15][4] = "East Asia";
		
		question[16][0] = "Buisiness services depend on providing";
		question[16][1] = "Services for other servicers";
		question[16][2] = "Raw materials for industry";
		question[16][3] = "Computer hardware for software engineers";
		question[16][4] = "Transportation corridors for key cities";
		
		question[17][0] = "How has the 'new international division of labor (NIDL)' come about?";
		question[17][1] = "Offshoring manufacturing activities to developing regions";
		question[17][2] = "Developing manufacturing regions in formerly agricultural areas";
		question[17][3] = "Exporting goods from industrial countries and sending raw materials from less developing regions";
		question[17][4] = "Increasing the subdivision of manufacturing processes into larger steps";
		
		question[18][0] = "The 'Four Asian tigers' are:";
		question[18][1] = "South Korea, Hong Kong, Singapore, Taiwan";
		question[18][2] = "Thailand, Malaysia, Haiti, Philippines";
		question[18][3] = "North Korea, Afganistan, Iran, and Iraq";
		question[18][4] = "China, India, Japan, Pakistan";
		
		question[19][0] = "Just-in-time manufacturing is aimed at";
		question[19][1] = "Reducing inventories through the production process";
		question[19][2] = "Reducing pollution during high production periods";
		question[19][3] = "Gettng goods to the manufacturer as soon as possible";
		question[19][4] = "Using storage space extensively";
		
		question[20][0] = "The concept of Comparative Advantage provides an understanding of";
		question[20][1] = "regional specialization";
		question[20][2] = "lower wage rates in the United States";
		question[20][3] = "locating plants near raw material sources";
		question[20][4] = "high market demand for products";
		
		question[21][0] = "The least expencive form of freight movement for long distances is nearly always";
		question[21][1] = "water transportation";
		question[21][2] = "highway transportation";
		question[21][3] = "railway transportation";
		question[21][4] = "air transportation";
		
		question[22][0] = "Silicon Valley, North Carolina's Research Triangle, and Silicon Valley North around Ottawa, Canada, Are concentrations of";
		question[22][1] = "high technology industries";
		question[22][2] = "traditional heavy-industry manufacturing";
		question[22][3] = "advanced quaternary-level services";
		question[22][4] = "retailing and wholesaling activity";
		
		question[23][0] = "Assembly line production of identical commodities by a rigidly controlled and specialized labor force for generalized mass markets is known as";
		question[23][1] = "fordism";
		question[23][2] = "chevroletism";
		question[23][3] = "toyotaism";
		question[23][4] = "hondaism";
		
		question[24][0] = "Many foreign-owned factories have relocated to China, Taiwan and similar areas because of";
		question[24][1] = "lower labor costs";
		question[24][2] = "political instability in Europe";
		question[24][3] = "their proximity to major populations";
		question[24][4] = "more highly skilled workers";
	
		question[25][0] = "Abandoned factories and mills, found throughout US cities, are examples of changes to the US economy and are termed '___'";
		question[25][1] = "brownfields";
		question[25][2] = "postindustries";
		question[25][3] = "secondary sites";
		question[25][4] = "grayouts";
		
		question[26][0] = "Which tertiary activity is the world's largest industry in jobs and total value generated?";
		question[26][1] = "Tourism";
		question[26][2] = "Information technology";
		question[26][3] = "Stock market";
		question[26][4] = "Retail";
		
		question[27][0] = "The majority of all workers in the United States are involved in which sector of the economy?";
		question[27][1] = "Tertiary";
		question[27][2] = "Government";
		question[27][3] = "Secondary";
		question[27][4] = "Primary";
		
		

	}

	public static void main(String[] args) {

		TestGeo test = new TestGeo();

		while (true) {
			test.tag = false;
			test.clearConsole();
			System.out.println("1. Start TestGeo\n2. Exit");
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
