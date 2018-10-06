import java.util.Scanner;

public class GGY_1_2_Test {

	Scanner in = new Scanner(System.in);

	String question[][] = new String[36][5];

	boolean tag = false;

	GGY_1_2_Test() {

		question[0][0] = "An example of a functional region is";
		question[0][1] = "the trade area of a city.";
		question[0][2] = "the Corn Belt.";
		question[0][3] = "French-speaking Canada.";
		question[0][4] = "a tropical rain forest.";
		
		question[1][0] = "If a map is called conformal, then it is in terms of";
		question[1][1] = "shape.";
		question[1][2] = "area.";
		question[1][3] = "direction.";
		question[1][4] = "distance.";
		
		question[2][0] = "Which of the following features is NOT commonly found on topographic maps?";
		question[2][1] = "proportional circle symbols depicting population distribution";
		question[2][2] = "elevation contours";
		question[2][3] = "rivers, lakes, and coastal features";
		question[2][4] = "cultural features such as buildings, orchards, cities, and roads";	

		question[3][0] = "Which of the following is not one of the three good reasons identified in the textbook as to why people study geography?";
		question[3][1] = "Geography as a discipline is a natural science that has at its core, a focus on flora and fauna";
		question[3][2] = "Geographic training opens the way to careers in a wide array of fields";
		question[3][3] = "A grasp of geography is vital to understanding the national and international problems highlighted in news reports";
		question[3][4] = "Geography is the only discipline concerned with differing physical and cultural phenomena on the surface of the earth";
		
		question[4][0] = "Which of the following is not a map projection?";
		question[4][1] = "Geoidal";
		question[4][2] = "Azimuthal";
		question[4][3] = "Conformal";
		question[4][4] = "Equidistant";
		
		question[5][0] = "The prime meridian";
		question[5][1] = "connects the North and South Poles.";
		question[5][2] = "passes through Greenwich Village, New York.";
		question[5][3] = "is given in nature.";
		question[5][4] = "is parallel to the equator.";
		
		question[6][0] = "Many buildings collapsed when the country of Nepal was rocked by a powerful earthquake in 2015 due to the fact that";
		question[6][1] = "Nepal is among the world’s least developed countries and builders could not afford the cost of earthquake safety measures.";
		question[6][2] = "there was no reason to expect an earthquake in that region.";
		question[6][3] = "scientists do not monitor earthquake hazards in Nepal.";
		question[6][4] = "Nepal has no earthquake safety regulations for buildings.";
		
		question[7][0] = "What kind of map shows a specific spatial distribution or category of data?";
		question[7][1] = "Thematic map";
		question[7][2] = "Location map";
		question[7][3] = "Reference map";
		question[7][4] = "General-purpose map ";
		
		question[8][0] = "Spatial interaction is affected by";
		question[8][1] = "distance, accessibility, and connectivity.";
		question[8][2] = "mobility, economics, and anticipation.";
		question[8][3] = "absolute location, spatial parameters, and network design.";
		question[8][4] = "the physical environment, the cultural landscape, and the interchange potential of places. ";
		
		question[9][0] = "Geographic information systems are used in physical geography, but not in human geography.";
		question[9][1] = "False";
		question[9][2] = "True";
		question[9][3] = "ignore";
		question[9][4] = "ignore";
		
		question[10][0] = "Which of the following representative fractions would show the most detail on a map?";
		question[10][1] = "1:24,000";
		question[10][2] = "1:63,360";
		question[10][3] = "1:10,000,000";
		question[10][4] = "1:1,000,000";
		
		question[11][0] = "Flowlines would not be used to represent";
		question[11][1] = "political boundaries.";
		question[11][2] = "migration patterns.";
		question[11][3] = "airline routes.";
		question[11][4] = "ocean currents.";
		
		question[12][0] = "To increase precision, latitude and longitude are divided into";
		question[12][1] = "minutes and seconds.";
		question[12][2] = "latimites and longimites.";
		question[12][3] = "meters and centimeters.";
		question[12][4] = "meridians.";
		
		question[13][0] = "The term remote sensing refers to the";
		question[13][1] = "detection of the nature of objects from a distance.";
		question[13][2] = "calculation of the precise location of all one million plus U.S.G.S. benchmarks.";
		question[13][3] = "construction of maps by computers.";
		question[13][4] = "wavelengths of the electromagnetic spectrum.";
		
		question[14][0] = "Contour lines";
		question[14][1] = "connect points of equal elevation above sea level.";
		question[14][2] = "are less accurate than shaded relief in depicting terrain.";
		question[14][3] = "can be detected by remote sensing.";
		question[14][4] = "aren't useful for depicting mountainous regions.";
		
		question[15][0] = "A geographic information system contains";
		question[15][1] = "A data input component and a data management component";
		question[15][2] = "A data analysis function and a periodic table";
		question[15][3] = "Genomes and output components";
		question[15][4] = "Data manipulation functions and terrain manuals";
		
		question[16][0] = "Which of the following is not true about perceptual regions?";
		question[16][1] = "They are only expressed at a local scale";
		question[16][2] = "They reflect feelings and images rather than objective data";
		question[16][3] = "They are based on the mental maps of ordinary people";
		question[16][4] = "They are less rigorously structured than formal or functional regions";
		
		question[17][0] = "The discipline of geography traces its roots back to the early";
		question[17][1] = "Greeks.";
		question[17][2] = "Mesopotamians.";
		question[17][3] = "Babylonians.";
		question[17][4] = "Egyptians.";
		
		question[18][0] = "What geographic unit is based on the recognition and mapping of spatial distributions – the spatial arrangement of environmental, human, or organizational features?";
		question[18][1] = "Regions";
		question[18][2] = "Dynamic districts";
		question[18][3] = "Areal extents";
		question[18][4] = "Locales";
		
		question[19][0] = "When one travels one fourth of the distance around the world along the same parallel of latitude, the number of time zones traversed is likely";
		question[19][1] = "6.";
		question[19][2] = "12.";
		question[19][3] = "4.";
		question[19][4] = "24.";
		
		question[20][0] = "Which of the following statements about latitude is true?";
		question[20][1] = "Latitude lines are always parallel to each other on a globe.";
		question[20][2] = "On a globe, lines of latitude intersect parallels of longitude at right angles.";
		question[20][3] = "Latitude varies from 0° to 180°.";
		question[20][4] = "Latitude is a measure of distance and of the equator.";
		
		question[21][0] = "Which of the following is not a thematic map type?";
		question[21][1] = "topographic map";
		question[21][2] = "proportional symbol map";
		question[21][3] = "choropleth map";
		question[21][4] = "cartogram map";
		
		question[22][0] = "A computer-based set of procedures for handling geographically referenced information is known as";
		question[22][1] = "geographic information systems (GIS).";
		question[22][2] = "intelligent geographic design (IGD).";
		question[22][3] = "global positioning systems (GPS).";
		question[22][4] = "digitally integrated geography (DIG).";
		
		question[23][0] = "Geography is BEST described as";
		question[23][1] = "the study of how and why human and physical attributes vary from place to place on the surface of the earth.";
		question[23][2] = "the study of the choices made by individuals and societies with regard to the alternative uses of scarce resources.";
		question[23][3] = "the study of the origin and behavior of humans and the development of societies and cultures.";
		question[23][4] = "the location of countries, state and national capitals, major rivers, and continents.";
		
		question[24][0] = "The line that encircles the globe halfway between the poles, perpendicular to the axis, is the";
		question[24][1] = "equator.";
		question[24][2] = "international date line.";
		question[24][3] = "tropic of cancer.";
		question[24][4] = "prime meridian.";
	
		question[25][0] = "The term 'geography' was reportedly coined by which Greek scientist?";
		question[25][1] = "Eratosthenes";
		question[25][2] = "Pythagoras";
		question[25][3] = "Aristotle";
		question[25][4] = "Strabo";
		
		question[26][0] = "With respect to U.S. Geological Survey Topographic Maps";
		question[26][1] = "the 1:24,000 series is complete for the contiguous United States and Hawaii.";
		question[26][2] = "they were designed for military purposes.";
		question[26][3] = "they do not display human or cultural features.";
		question[26][4] = "contour intervals are used to measure the scale of the map.";
		
		question[27][0] = "When mapping numerical data, a cartographer should use a projection that is";
		question[27][1] = "equal-area.";
		question[27][2] = "topographic.";
		question[27][3] = "equidistant.";
		question[27][4] = "conformal.";
		
		question[28][0] = "With regard to spatial interaction, telephone lines, road systems, and pipelines are all examples of";
		question[28][1] = "connectivity.";
		question[28][2] = "movement.";
		question[28][3] = "accessibility.";
		question[28][4] = "spatial diffusion.";
		
		question[29][0] = "The distance between each degree of latitude is approximately";
		question[29][1] = "69 miles.";
		question[29][2] = "111 miles.";
		question[29][3] = "50 miles.";
		question[29][4] = "33 miles.";
		
		question[30][0] = "The Peters projection falls into which category of map";
		question[30][1] = "Equal-area";
		question[30][2] = "Equidistant";
		question[30][3] = "Thematic";
		question[30][4] = "Conformal";
		
		question[31][0] = "Absolute location";
		question[31][1] = "records a precise position on the surface of the earth.";
		question[31][2] = "is the basis for the expression \"location matters.\"";
		question[31][3] = "expresses spatial interaction and interdependence.";
		question[31][4] = "makes the distinction between physical and cultural characteristics.";
		
		question[32][0] = "All of the following are key reference points in the grid system EXCEPT the";
		question[32][1] = "Greenwich Village, New York.";
		question[32][2] = "equator.";
		question[32][3] = "North and South Poles.";
		question[32][4] = "prime meridian.";
		
		question[33][0] = "Which of the following statements about topographic maps is NOT correct?";
		question[33][1] = "They portray the terrain rather than features people have added to the natural landscape.";
		question[33][2] = "They are used by engineers, regional planners, and land use analysts.";
		question[33][3] = "The contour line is the principal device used to indicate elevation.";
		question[33][4] = "Aerial photography is employed to speed up the production process.";
		
		question[34][0] = "Which of the following are lines of constant value?";
		question[34][1] = "isolines";
		question[34][2] = "projection lines";
		question[34][3] = "cartograms";
		question[34][4] = "GPS lines";
		
		question[35][0] = "Based on survey lines oriented in the cardinal directions, the Land Ordinance of 1785 established a systematic survey known as";
		question[35][1] = "township and range.";
		question[35][2] = "long lot.";
		question[35][3] = "metes and bounds.";
		question[35][4] = "state plane.";

	}

	public static void main(String[] args) {

		GGY_1_2_Test test = new GGY_1_2_Test();

		while (true) {
			test.tag = false;
			test.clearConsole();
			System.out.println("1. Start GGY_1_2_Test\n2. Exit");
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
