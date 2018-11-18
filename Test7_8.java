import java.util.Scanner;

public class Test7_8 {

	Scanner in = new Scanner(System.in);

	String question[][] = new String[41][5];

	boolean tag = false;

	Test7_8() {

		question[0][0] = "Among the reasons for migrating, push factors";
		question[0][1] = "encourage relocation away from original residence areas.";
		question[0][2] = "affect international migration but not domestic relocation.";
		question[0][3] = "reflect assessments of action space attraction.";
		question[0][4] = "draw migrants to specific destinations.";
		
		question[1][0] = "Companies that have headquarters in one country and subsidiary companies and other facilities in several countries are known as";
		question[1][1] = "transnational corporations (TNCs).";
		question[1][2] = "outsourcing organizations (OOs).";
		question[1][3] = "global partnerships (GPs).";
		question[1][4] = "flexible spenders (Fss).";
		
		question[2][0] = "Totally or partially autonomous political units that are small in area and have less than 1 million people are known as";
		question[2][1] = "ministates.";
		question[2][2] = "nanonations.";
		question[2][3] = "millilands.";
		question[2][4] = "microunits";	

		question[3][0] = "Territorial seas under the Law of the Sea extend out to";
		question[3][1] = "12 nautical miles.";
		question[3][2] = "24 nautical miles.";
		question[3][3] = "350 nautical miles.";
		question[3][4] = "200 nautical miles.";
		
		question[4][0] = "The western portion of the boundary between the United States and Canada is classified as";
		question[4][1] = "a natural boundary.";
		question[4][2] = "a water divide.";
		question[4][3] = "an artificial boundary.";
		question[4][4] = "a disputed boundary.";
		
		question[5][0] = "An example of gerrymandering would be establishing";
		question[5][1] = "voting districts drawn to give one political party an unfair legislative advantage.";
		question[5][2] = "taxing bodies and districts based upon differential storm drainage and sewage problems.";
		question[5][3] = "central city and suburban municipal boundaries.";
		question[5][4] = "separate-but-equal attendance districts.";
		
		question[6][0] = "The claim of India and Pakistan to the Kashmir region is based on the area's substantial Hindu and Muslim populations and is an example of";
		question[6][1] = "irredentism.";
		question[6][2] = "devolution.";
		question[6][3] = "historicism.";
		question[6][4] = "supranationalism.";
		
		question[7][0] = "Which of the following examples is an example of involuntary migration?";
		question[7][1] = "the migration of millions Africans to the Western Hemisphere in the late 16th through early 19th Centuries";
		question[7][2] = "the migration of elderly Americans to the Sun Belt";
		question[7][3] = "migrations motivated by powerful pull factors";
		question[7][4] = "migrations motivated by the positive place utility of the destination";
		
		question[8][0] = "The two preconditions common to all separatist movements are";
		question[8][1] = "territory and nationality";
		question[8][2] = "independence and customs.";
		question[8][3] = "religion and language.";
		question[8][4] = "ethnicity and statehood.";
		
		question[9][0] = "What term refers to the emotional attachment to and the defense of home ground?";
		question[9][1] = "Territoriality";
		question[9][2] = "Public utility";
		question[9][3] = "Mental map";
		question[9][4] = "Ethocentricity";
		
		question[10][0] = "Exemplifying chain migration, immigrants from India, mostly from the state of Gujarat, now own more than one-third of what type of business in the United States?";
		question[10][1] = "Hotels";
		question[10][2] = "Beauty salons";
		question[10][3] = "Fruit stores";
		question[10][4] = "Diners";
		
		question[11][0] = "Environmental justice is";
		question[11][1] = "the fair treatment of all people so that no group bears a disproportionate burden of environmental pollution.";
		question[11][2] = "the doctrine that no country should be allowed to export wastes to another.";
		question[11][3] = "the concept that the needs of all living organisms and ecosystems be equally respected.";
		question[11][4] = "the practice in which polluting facilities are located where there is the lease political resistance.";
		
		question[12][0] = "Which one of the following associations is correct?";
		question[12][1] = "Philippines-fragmented";
		question[12][2] = "South Africa-elongated";
		question[12][3] = "Thailand-compact";
		question[12][4] = "Norway-perforated";
		
		question[13][0] = "The area of original settlement in a state that usually contains its densest population and largest cities is called the";
		question[13][1] = "core area.";
		question[13][2] = "central artery.";
		question[13][3] = "focal point";
		question[13][4] = "nucleus.";
		
		question[14][0] = "The strategy of drawing political boundaries so as to dilute the opposition's strength by dividing its votes among a number of districts is known as the";
		question[14][1] = "wasted vote.";
		question[14][2] = "excess vote.";
		question[14][3] = "electoral vote.";
		question[14][4] = "stacked vote.";
		
		question[15][0] = "Exclusive economic zones recognized under the law of Sea Convention extend outward from coasts by";
		question[15][1] = "200 nautical miles.";
		question[15][2] = "200 kilometers.";
		question[15][3] = "200 meters.";
		question[15][4] = "200 miles.";
		
		question[16][0] = "Which of the following is considered a pull factor in regard to migration";
		question[16][1] = "amenities of living in Australia";
		question[16][2] = "persecution of Jews in Nazi Germany";
		question[16][3] = "nomads fleeing famine and spreading desert in the Sahel";
		question[16][4] = "high unemployment in Appalachia";
		
		question[17][0] = "In the 20th century, nearly all countries continued to experience this pattern of migration that first became prominent in the advanced countries in the 18th century and 19th century.";
		question[17][1] = "Rural to urban";
		question[17][2] = "Urban to rural";
		question[17][3] = "Internal to external";
		question[17][4] = "Northern to southern";
		
		question[18][0] = "A diffusion process that follows an S-shape curved indicates that the innovation";
		question[18][1] = "first spread slowly, then more rapidly until saturation occurred.";
		question[18][2] = "was first adopted by people in large cities, then by those in lower-order centers.";
		question[18][3] = "was adopted in numbers corresponding to the population density.";
		question[18][4] = "first had few adopters, then underwent an explosive pattern of growth.";
		
		question[19][0] = "The concept of activity space is useful for better understanding that each human";
		question[19][1] = "has a territory with which he/she is most familiar.";
		question[19][2] = "is confined to a region within which he/she interacts with others.";
		question[19][3] = "is busy doing those things that he/she must in order to live happily.";
		question[19][4] = "has an exact schedule or routine that he/she carries out within a specified region.";
		
		question[20][0] = "Scientists estimate the Arctic seabed might contain this much of the world's undiscovered oil, gas, and minerals.";
		question[20][1] = "25 percent";
		question[20][2] = "5 percent";
		question[20][3] = "35 percent";
		question[20][4] = "15 percent";
		
		question[21][0] = "The dissolution of European empires is this century is noteworthy for all of the following reasons EXCEPT the";
		question[21][1] = "fact that the European powers relinquished their control peacefully.";
		question[21][2] = "fact that former colonies have become independent states.";
		question[21][3] = "fact that former colonies covered large parts of the globe.";
		question[21][4] = "speed with which empires dissolved after World War II.";
		
		question[22][0] = "The term used to describe differences between our cognition of distance and real distance is";
		question[22][1] = "psychological distance.";
		question[22][2] = "projected distance.";
		question[22][3] = "perceptual distance.";
		question[22][4] = "time-distance.";
		
		question[23][0] = "The association of countries created for mutual benefit and achievement of shared objectives is";
		question[23][1] = "supranationalism.";
		question[23][2] = "regionalism.";
		question[23][3] = "nationalism.";
		question[23][4] = "subnationalism.";
		
		question[24][0] = "According to the United Nations Development Fund, some 30 percent of the world's population lives on less than___per day.";
		question[24][1] = "$1";
		question[24][2] = "$100";
		question[24][3] = "$10";
		question[24][4] = "$1000";
	
		question[25][0] = "Which of the following statements is not correct with respect to hierarchical diffusion?";
		question[25][1] = "It occurs only after all lower levels in the hierarchy have received the information";
		question[25][2] = "Small towns closer to high-level centers can receive the information before the more distant medium-sized centers";
		question[25][3] = "People near large innovation centers often benefit as information diffuses outward";
		question[25][4] = "It often occurs simultaneously with the other two methods of diffusion";
		
		question[26][0] = "The tendency for individuals in domestic relocation to move from small places to larger ones is known as";
		question[26][1] = "hierarchical migration.";
		question[26][2] = "counter migration.";
		question[26][3] = "return migration.";
		question[26][4] = "channelized migration.";
		
		question[27][0] = "Areas that dominate a locale's immigration and emigration patterns are known as";
		question[27][1] = "migration fields.";
		question[27][2] = "migration spaces.";
		question[27][3] = "migration venues.";
		question[27][4] = "migration hierarchies.";
		
		question[28][0] = "The now universal idea of the modern state was developed in the 18th century by political philosophers in what world region?";
		question[28][1] = "Europe";
		question[28][2] = "East Asia";
		question[28][3] = "North America";
		question[28][4] = "North Africa";
		
		question[29][0] = "The Euro is the single currency of";
		question[29][1] = "Portugal";
		question[29][2] = "Turkey";
		question[29][3] = "Canada";
		question[29][4] = "Great Britain";
		
		question[30][0] = "Before 1988, the Soviet Union was an example of a";
		question[30][1] = "multinational state.";
		question[30][2] = "single nation and single state.";
		question[30][3] = "stateless nation.";
		question[30][4] = "part nation state.";
		
		question[31][0] = "South Africa is an example of a(an)____state.";
		question[31][1] = "perforated";
		question[31][2] = "elongated";
		question[31][3] = "fragmented";
		question[31][4] = "compact";
		
		question[32][0] = "Barriers to interaction do NOT include";
		question[32][1] = "Transportation centers";
		question[32][2] = "Distance";
		question[32][3] = "Cost";
		question[32][4] = "Language differences";
		
		question[33][0] = "Which of the following is the best example of hierarchical diffusion?";
		question[33][1] = "A fashion being introduced in New York City and slowly becoming popular in smaller cities and towns";
		question[33][2] = "a flu epidemic moving through a country";
		question[33][3] = "A political idea spread through television ads";
		question[33][4] = "Immigrants introducing native farming methods to their new homeland";
		
		question[34][0] = "The Law of Sea Convention contains provisions for all of the following EXCEPT";
		question[34][1] = "100-nautical mile exclusive economic zones.";
		question[34][2] = "freedom of the high seas.";
		question[34][3] = "recognition of the deep seabed and its resources as the -common heritage of mankind.-";
		question[34][4] = "a 12-nautical mile limit for territorial waters over which states can exercise sovereignty.";
		
		question[35][0] = "According to the text, transnational corporations (TNCs) control about what percentage of the world's productive assets?";
		question[35][1] = "33 percent";
		question[35][2] = "70 percent";
		question[35][3] = "2 percent";
		question[35][4] = "10 percent";
		
		question[36][0] = "Since 2000, which region of the United States has not seen population growth due to net migration flows?";
		question[36][1] = "Northeast";
		question[36][2] = "Southwest";
		question[36][3] = "West";
		question[36][4] = "Southeast";
		
		question[37][0] = "Globalization is affected by all but which of the following?";
		question[37][1] = "place utility integration";
		question[37][2] = "international banking";
		question[37][3] = "political integration";
		question[37][4] = "global marketing";
		
		question[38][0] = "According to the Law of Sea Convention, within its exclusive economic zone, a state";
		question[38][1] = "will have exclusive rights to fish and to extract minerals.";
		question[38][2] = "may claim exclusive sovereignty.";
		question[38][3] = "must provide for energy resource exploitation by -geographically disadvantaged- countries.";
		question[38][4] = "has fishing rights but only limited access to nonliving resources.";
		
		question[39][0] = "Since World War II, coastal states have extended their seaward territorial claims";
		question[39][1] = "to control the exploitation of offshore fishing and mineral resources.";
		question[39][2] = "because of the desire to establish reliable shipping lanes between landmasses.";
		question[39][3] = "to restrict offshore sources of marine pollution and to prohibit the flow of illegal drugs.";
		question[39][4] = "because of world tensions and fear of naval attack.";
		
		question[40][0] = "The least efficient shape for the management of a state is";
		question[40][1] = "elongated.";
		question[40][2] = "compact.";
		question[40][3] = "fragmented.";
		question[40][4] = "prorupt.";

		

	}

	public static void main(String[] args) {

		Test7_8 test = new Test7_8();

		while (true) {
			test.tag = false;
			test.clearConsole();
			System.out.println("1. Start Test\n2. Exit");
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
