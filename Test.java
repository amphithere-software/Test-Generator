import java.util.Scanner;

public class Test {

	Scanner in = new Scanner(System.in);

	String question[][] = new String[50][5];

	boolean tag = false;

	Test() {

		question[0][0] = "";
		question[0][1] = "";
		question[0][2] = "";
		question[0][3] = "";
		question[0][4] = "";
		
		question[1][0] = "";
		question[1][1] = "";
		question[1][2] = "";
		question[1][3] = "";
		question[1][4] = "";
		
		question[2][0] = "";
		question[2][1] = "";
		question[2][2] = "";
		question[2][3] = "";
		question[2][4] = "";	

		question[3][0] = "";
		question[3][1] = "";
		question[3][2] = "";
		question[3][3] = "";
		question[3][4] = "";
		
		question[4][0] = "";
		question[4][1] = "";
		question[4][2] = "";
		question[4][3] = "";
		question[4][4] = "";
		
		question[5][0] = "";
		question[5][1] = "";
		question[5][2] = "";
		question[5][3] = "";
		question[5][4] = "";
		
		question[6][0] = "";
		question[6][1] = "";
		question[6][2] = "";
		question[6][3] = "";
		question[6][4] = "";
		
		question[7][0] = "";
		question[7][1] = "";
		question[7][2] = "";
		question[7][3] = "";
		question[7][4] = "";
		
		question[8][0] = "";
		question[8][1] = "";
		question[8][2] = "";
		question[8][3] = "";
		question[8][4] = "";
		
		question[9][0] = "";
		question[9][1] = "";
		question[9][2] = "";
		question[9][3] = "";
		question[9][4] = "";
		
		question[10][0] = "";
		question[10][1] = "";
		question[10][2] = "";
		question[10][3] = "";
		question[10][4] = "";
		
		question[11][0] = "";
		question[11][1] = "";
		question[11][2] = "";
		question[11][3] = "";
		question[11][4] = "";
		
		question[12][0] = "";
		question[12][1] = "";
		question[12][2] = "";
		question[12][3] = "";
		question[12][4] = "";
		
		question[13][0] = "";
		question[13][1] = "";
		question[13][2] = "";
		question[13][3] = "";
		question[13][4] = "";
		
		question[14][0] = "";
		question[14][1] = "";
		question[14][2] = "";
		question[14][3] = "";
		question[14][4] = "";
		
		question[15][0] = "";
		question[15][1] = "";
		question[15][2] = "";
		question[15][3] = "";
		question[15][4] = "";
		
		question[16][0] = "";
		question[16][1] = "";
		question[16][2] = "";
		question[16][3] = "";
		question[16][4] = "";
		
		question[17][0] = "";
		question[17][1] = "";
		question[17][2] = "";
		question[17][3] = "";
		question[17][4] = "";
		
		question[18][0] = "";
		question[18][1] = "";
		question[18][2] = "";
		question[18][3] = "";
		question[18][4] = "";
		
		question[19][0] = "";
		question[19][1] = "";
		question[19][2] = "";
		question[19][3] = "";
		question[19][4] = "";
		
		question[20][0] = "";
		question[20][1] = "";
		question[20][2] = "";
		question[20][3] = "";
		question[20][4] = "";
		
		question[21][0] = "";
		question[21][1] = "";
		question[21][2] = "";
		question[21][3] = "";
		question[21][4] = "";
		
		question[22][0] = "";
		question[22][1] = "";
		question[22][2] = "";
		question[22][3] = "";
		question[22][4] = "";
		
		question[23][0] = "";
		question[23][1] = "";
		question[23][2] = "";
		question[23][3] = "";
		question[23][4] = "";
		
		question[24][0] = "";
		question[24][1] = "";
		question[24][2] = "";
		question[24][3] = "";
		question[24][4] = "";
	
		question[25][0] = "";
		question[25][1] = "";
		question[25][2] = "";
		question[25][3] = "";
		question[25][4] = "";
		
		question[26][0] = "";
		question[26][1] = "";
		question[26][2] = "";
		question[26][3] = "";
		question[26][4] = "";
		
		question[27][0] = "";
		question[27][1] = "";
		question[27][2] = "";
		question[27][3] = "";
		question[27][4] = "";
		
		question[28][0] = "";
		question[28][1] = "";
		question[28][2] = "";
		question[28][3] = "";
		question[28][4] = "";
		
		question[29][0] = "";
		question[29][1] = "";
		question[29][2] = "";
		question[29][3] = "";
		question[29][4] = "";
		
		question[30][0] = "";
		question[30][1] = "";
		question[30][2] = "";
		question[30][3] = "";
		question[30][4] = "";
		
		question[31][0] = "";
		question[31][1] = "";
		question[31][2] = "";
		question[31][3] = "";
		question[31][4] = "";
		
		question[32][0] = "";
		question[32][1] = "";
		question[32][2] = "";
		question[32][3] = "";
		question[32][4] = "";
		
		question[33][0] = "";
		question[33][1] = "";
		question[33][2] = "";
		question[33][3] = "";
		question[33][4] = "";
		
		question[34][0] = "";
		question[34][1] = "";
		question[34][2] = "";
		question[34][3] = "";
		question[34][4] = "";
		
		question[35][0] = "";
		question[35][1] = "";
		question[35][2] = "";
		question[35][3] = "";
		question[35][4] = "";
		
		question[36][0] = "";
		question[36][1] = "";
		question[36][2] = "";
		question[36][3] = "";
		question[36][4] = "";
		
		question[37][0] = "";
		question[37][1] = "";
		question[37][2] = "";
		question[37][3] = "";
		question[37][4] = "";
		
		question[38][0] = "";
		question[38][1] = "";
		question[38][2] = "";
		question[38][3] = "";
		question[38][4] = "";
		
		question[39][0] = "";
		question[39][1] = "";
		question[39][2] = "";
		question[39][3] = "";
		question[39][4] = "";
		
		question[40][0] = "";
		question[40][1] = "";
		question[40][2] = "";
		question[40][3] = "";
		question[40][4] = "";
		
		question[41][0] = "";
		question[41][1] = "";
		question[41][2] = "";
		question[41][3] = "";
		question[41][4] = "";
		
		question[42][0] = "";
		question[42][1] = "";
		question[42][2] = "";
		question[42][3] = "";
		question[42][4] = "";
		
		question[43][0] = "";
		question[43][1] = "";
		question[43][2] = "";
		question[43][3] = "";
		question[43][4] = "";
		
		question[44][0] = "";
		question[44][1] = "";
		question[44][2] = "";
		question[44][3] = "";
		question[44][4] = "";
		
		question[45][0] = "";
		question[45][1] = "";
		question[45][2] = "";
		question[45][3] = "";
		question[45][4] = "";
		
		question[46][0] = "";
		question[46][1] = "";
		question[46][2] = "";
		question[46][3] = "";
		question[46][4] = "";
		
		question[47][0] = "";
		question[47][1] = "";
		question[47][2] = "";
		question[47][3] = "";
		question[47][4] = "";
		
		question[48][0] = "";
		question[48][1] = "";
		question[48][2] = "";
		question[48][3] = "";
		question[48][4] = "";
		
		question[49][0] = "";
		question[49][1] = "";
		question[49][2] = "";
		question[49][3] = "";
		question[49][4] = "";
		

	}

	public static void main(String[] args) {

		Test test = new Test();

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

			System.out.println(question[i][i] + "\n");

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
		}while(question[index][num1].equals(question[index][index + 1]));
				
		do {
			num2 = (int) (Math.random() * 4 + 1);
		}while(question[index][num2].equals(question[index][index + 1]) || num2 == num1);
				
		do {
			num3 = (int) (Math.random() * 4 + 1);
		}while(question[index][num3].equals(question[index][index + 1]) || num3 == num2 || num3 == num1);		
		

		if (placement == 1) {
			System.out.println("\t1. " + question[index][index + 1]);
			System.out.println("\t2. " + question[index][num1]);
			System.out.println("\t3. " + question[index][num2]);
			System.out.println("\t4. " + question[index][num3]);
		}
		if (placement == 2) {
			System.out.println("\t1. " + question[index][num1]);
			System.out.println("\t2. " + question[index][index + 1]);
			System.out.println("\t3. " + question[index][num2]);
			System.out.println("\t4. " + question[index][num3]);

		}
		if (placement == 3) {
			System.out.println("\t1. " + question[index][num1]);
			System.out.println("\t2. " + question[index][num2]);
			System.out.println("\t3. " + question[index][index + 1]);
			System.out.println("\t4. " + question[index][num3]);

		}
		if (placement == 4) {
			System.out.println("\t1. " + question[index][num1]);
			System.out.println("\t2. " + question[index][num2]);
			System.out.println("\t3. " + question[index][num3]);
			System.out.println("\t4. " + question[index][index + 1]);

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
