import java.util.Scanner;

public class Test5_6 {

	Scanner in = new Scanner(System.in);

	String question[][] = new String[38][5];

	boolean tag = false;

	Test5_6() {

		question[0][0] = "Even with a total fertility rate of 2.1, some countries may experience continued increase in the number of people due to _______.";
		question[0][1] = "population or demographic momentum";
		question[0][2] = "high birth and low death rates";
		question[0][3] = "government intervention or family planning";
		question[0][4] = "lack of contraception available for women";
		
		question[1][0] = "Observance of the -five pillars- is associated with which religion?";
		question[1][1] = "Islam";
		question[1][2] = "Hinduism";
		question[1][3] = "Buddhism";
		question[1][4] = "Confucianism";
		
		question[2][0] = "The term referring to socially created distinctions between masculine and feminine roles in society is";
		question[2][1] = "gender.";
		question[2][2] = "sexuality.";
		question[2][3] = "dualism.";
		question[2][4] = "bimorphism.";	

		question[3][0] = "The theory of the demographic transition holds that";
		question[3][1] = "both birth and death rates decrease with urbanization.";
		question[3][2] = "birth rates increase but death rates decrease with urbanization.";
		question[3][3] = "both birth and death rates increase with urbanization.";
		question[3][4] = "death rates increase but birth rates decrease with urbanization.";
		
		question[4][0] = "Robert Malthus did NOT believe that";
		question[4][1] = "The biological potential for population growth is less than the potential for increasing food supplies.";
		question[4][2] = "Equilibrium will be achieved between numbers and support services";
		question[4][3] = "If unchecked, human population would increase at a geometric rate while food supplies expanded at an arithmetic rate.";
		question[4][4] = "Humans must restrain their reproductive capacity or nature would enact destructive checks.";
		
		question[5][0] = "Which of the following is not one of the world's four major population clusters?";
		question[5][1] = "Mexico and Central America.";
		question[5][2] = "South Asia.";
		question[5][3] = "East Asia.";
		question[5][4] = "northeastern United States and southeastern Canada.";
		
		question[6][0] = "Which term refers to a simplified language formed from an amalgam of two languages?";
		question[6][1] = "Pidgin";
		question[6][2] = "Lingua franca";
		question[6][3] = "Creole";
		question[6][4] = "Dialect";
		
		question[7][0] = "Small areas of innovation from which key culture elements diffused to influence surrounding regions are";
		question[7][1] = "culture hearths.";
		question[7][2] = "culture berths.";
		question[7][3] = "culture cores.";
		question[7][4] = "culture domains.";
		
		question[8][0] = "In the Cairo Plan, the United Nations International Conference on Population and Development endorsed";
		question[8][1] = "giving women greater control over their lives, greater economic equality and opportunity and greater voice in reproduction decisions.";
		question[8][2] = "developed countries to send their delegates including Hollywood celebrities to promote the concept of small family and use of contraceptives for both men and women.";
		question[8][3] = "government imposition of population control in the line of the Chinese policy of one child per family.";
		question[8][4] = "forced sterilization of men and women after the birth of their second child.";
		
		question[9][0] = "Which of the following statements about AIDS is NOT true?";
		question[9][1] = "Vaccines and immunotherapies developed since 2000 suggest AIDS will have only minor impact on developing countries' population pyramids.";
		question[9][2] = "About 60% of HIV-positive persons in sub-Saharan Africa are women.";
		question[9][3] = "About 90% of HIV-positive persons reside in developing countries.";
		question[9][4] = "Worldwide, AIDS is the 4th most common cause of death.";
		
		question[10][0] = "Of the four major world religions, the one which has experienced the most extensive worldwide dispersion is";
		question[10][1] = "Christianity.";
		question[10][2] = "Hinduism.";
		question[10][3] = "Buddhism.";
		question[10][4] = "Islam.";
		
		question[11][0] = "Which of the following regions has the lowest total fertility rates?";
		question[11][1] = "Europe";
		question[11][2] = "Figure 06.05";
		question[11][3] = "Central America";
		question[11][4] = "North America";
		
		question[12][0] = "Which of the following does NOT describe a characteristic of world population distribution?";
		question[12][1] = "The majority of the world's population resides in developing countries of the Southern Hemisphere.";
		question[12][2] = "Dry regions have lower population densities.";
		question[12][3] = "People congregate in coastal areas.";
		question[12][4] = "People congregate in lowland areas.";
		
		question[13][0] = "A language may be defined as";
		question[13][1] = "an organized system of speech communication.";
		question[13][2] = "a literary tradition developed in a specific geographic area.";
		question[13][3] = "the necessary basis of national identity.";
		question[13][4] = "a cultural constant of the sociological subsystem.";
		
		question[14][0] = "Which of the following is not a cultural subsystem?";
		question[14][1] = "Material subsystem";
		question[14][2] = "Ideological subsystem";
		question[14][3] = "Technological subsystem";
		question[14][4] = "Sociological subsystem";
		
		question[15][0] = "The status of women is a cultural spatial variable because";
		question[15][1] = "gender relationships and role assignments differ among societies.";
		question[15][2] = "women do different kinds of work.";
		question[15][3] = "women are found all over the world.";
		question[15][4] = "women are biologically different from men.";
		
		question[16][0] = "Total population divided by arable land, which provides an expression of population pressure exerted on agricultural land, gives";
		question[16][1] = "physiological density.";
		question[16][2] = "crude density.";
		question[16][3] = "agricultural density.";
		question[16][4] = "arithmetic density.";
		
		question[17][0] = "The idea that unchecked population increases geometrically while food production increases arithmetically is associated with which theory?";
		question[17][1] = "Malthusian";
		question[17][2] = "Neo-Malthusian";
		question[17][3] = "Green Revolution";
		question[17][4] = "Cornucopian";
		
		question[18][0] = "Religions are important keys to human geographic understanding because";
		question[18][1] = "religious beliefs intimately affect all facets of a culture.";
		question[18][2] = "they are one of the very few aspects of human culture totally divorced from the environments they occupy.";
		question[18][3] = "with their emphasis upon charity and the afterlife, religions play a universal pacifying role.";
		question[18][4] = "each major world religion is identified with a specific parent language.";
		
		question[19][0] = "In many societies, the number of births will continue to grow even as fertility rates decline due to";
		question[19][1] = "demographic momentum.";
		question[19][2] = "overpopulation.";
		question[19][3] = "the homeostatic plateau.";
		question[19][4] = "doubling time.";
		
		question[20][0] = "Religions that tend to be expansionary, seeking to transmit their beliefs to new peoples and areas, are termed";
		question[20][1] = "universalizing.";
		question[20][2] = "secular.";
		question[20][3] = "ethnic.";
		question[20][4] = "tribal.";
		
		question[21][0] = "When a social group does not adopt a useful innovation, it is said to display";
		question[21][1] = "cultural lag.";
		question[21][2] = "contradiction.";
		question[21][3] = "social retardation.";
		question[21][4] = "dissonant resistance.";
		
		question[22][0] = "In 2006, the United Nations forecast that the world population would reach ______ by 2050.";
		question[22][1] = "9.2 billion.";
		question[22][2] = "18.3 billion.";
		question[22][3] = "6.7 billion";
		question[22][4] = "13.6 billion.";
		
		question[23][0] = "The study of place-names as evidence of past cultural presence and change is called";
		question[23][1] = "toponymy.";
		question[23][2] = "topology.";
		question[23][3] = "topography.";
		question[23][4] = "toposcopy.";
		
		question[24][0] = "The smallest distinctive items of culture, which range from tools used, to games played, are known as";
		question[24][1] = "traits.";
		question[24][2] = "archetypals.";
		question[24][3] = "representatives.";
		question[24][4] = "emblems.";
	
		question[25][0] = "Which one of the universalizing religions originated in India and was brought by missionaries into China, Korea, Japan, Southeast Asia, Tibet, and Mongolia, where it became the dominant religion?";
		question[25][1] = "Buddhism";
		question[25][2] = "Shintoism";
		question[25][3] = "Hinduism";
		question[25][4] = "Islam";
		
		question[26][0] = "The continent with the lowest total fertility rates overall is";
		question[26][1] = "Europe.";
		question[26][2] = "Africa.";
		question[26][3] = "Asia.";
		question[26][4] = "South America.";
		
		question[27][0] = "Pidgin and creole languages are distinguished from one another by the fact that pidgin";
		question[27][1] = "is always a second language for all its speakers; creole has become a distinctive first language of a society.";
		question[27][2] = "is any invented language of Asia and the Pacific; creole is based on French and found in the Caribbean.";
		question[27][3] = "is a simplified European language taught to native populations; creole is a simplified native language.";
		question[27][4] = "may be based on any European language; creole is always a French dialect.";
		
		question[28][0] = "The demographic transition model was developed to explain the population history of";
		question[28][1] = "Western Europe.";
		question[28][2] = "the world.";
		question[28][3] = "the United States.";
		question[28][4] = "Asia.";
		
		question[29][0] = "The systematic study of human population is";
		question[29][1] = "demography.";
		question[29][2] = "ecology.";
		question[29][3] = "geography.";
		question[29][4] = "ekistics.";
		
		question[30][0] = "A shaman is generally associated with what type of religion?";
		question[30][1] = "Tribal religion";
		question[30][2] = "Secularism";
		question[30][3] = "Universalizing religion";
		question[30][4] = "Ethnic religion";
		
		question[31][0] = "What is the oldest major religion?";
		question[31][1] = "Hinduism";
		question[31][2] = "Judaism";
		question[31][3] = "Islam";
		question[31][4] = "Shinto";
		
		question[32][0] = "An expression of population pressure exerted on agricultural land is";
		question[32][1] = "physiological density.";
		question[32][2] = "arithmetical density.";
		question[32][3] = "aggregate density.";
		question[32][4] = "crude density.";
		
		question[33][0] = "What is the rate of natural increase of a country's population if the crude birth rate is 35 per 1,000 and crude death rate is 10 per 1,000?";
		question[33][1] = "25 per 1,000";
		question[33][2] = "45%";
		question[33][3] = "25%";
		question[33][4] = "45 per 1,000";
		
		question[34][0] = "Total fertility rates refer to";
		question[34][1] = "the average number of children that would be born to each woman at the current year's rate for women that age.";
		question[34][2] = "the level of fertility at which each successive generation of women produces exactly enough children to ensure the same number of women survive to have offspring themselves.";
		question[34][3] = "the level of fertility at which populations replace themselves.";
		question[34][4] = "the number of births per 1000 population.";
		
		question[35][0] = "The formal name for the traditional -melting pot- view of immigrant integration into the United States is the";
		question[35][1] = "Amalgamation Theory.";
		question[35][2] = "Assimilation Approach.";
		question[35][3] = "Adaption Supposition.";
		question[35][4] = "Absorption Assumption.";
		
		question[36][0] = "When immigrants to a country give up many of their past cultural traits, lose their distinguishing characteristics and merge into the mainstream of the dominant culture, they are said to have";
		question[36][1] = "assimilated.";
		question[36][2] = "acculturated.";
		question[36][3] = "adapted.";
		question[36][4] = "amalgamated.";
		
		question[37][0] = "The Malthusian theory is based on which of the following assumptions?";
		question[37][1] = "Population tends to increase more rapidly than do the food supplies to support that population.";
		question[37][2] = "Growth in productive capacity generally exceeds population increases.";
		question[37][3] = "Food production increases geometrically, while population grows arithmetically.";
		question[37][4] = "As urbanization occurs, the rate of population growth decreases.";

		

	}

	public static void main(String[] args) {

		Test5_6 test = new Test5_6();

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
