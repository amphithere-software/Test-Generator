import java.util.Scanner;

public class RandomizedTest {

	Scanner in = new Scanner(System.in);

	String question[] = new String[26];
	String answer[] = new String[26];
	boolean tag = false;

	RandomizedTest() {

		question[0] = "1";
		question[1] = "2";
		question[2] = "3";
		question[3] = "4";
		question[4] = "5";
		question[5] = "6";
		question[6] = "7";
		question[7] = "8";
		question[8] = "9";
		question[9] = "10";
		question[10] = "11";
		question[11] = "12";
		question[12] = "13";
		question[13] = "14";
		question[14] = "15";
		question[15] = "16";
		question[16] = "17";
		question[17] = "18";
		question[18] = "19";
		question[19] = "20";
		question[20] = "21";
		question[21] = "22";
		question[22] = "23";
		question[23] = "24";
		question[24] = "25";
		question[25] = "26";

		answer[0] = "a1";
		answer[1] = "a2";
		answer[2] = "a3";
		answer[3] = "a4";
		answer[4] = "a5";
		answer[5] = "a6";
		answer[6] = "a7";
		answer[7] = "a8";
		answer[8] = "a9";
		answer[9] = "a10";
		answer[10] = "a11";
		answer[11] = "a12";
		answer[12] = "a13";
		answer[13] = "a14";
		answer[14] = "a15";
		answer[15] = "a16";
		answer[16] = "a17";
		answer[17] = "a18";
		answer[18] = "a19";
		answer[19] = "a20";
		answer[20] = "a21";
		answer[21] = "a22";
		answer[22] = "a23";
		answer[23] = "a24";
		answer[24] = "a25";
		answer[25] = "a26";

	}

	public static void main(String[] args) {

		RandomizedTest test = new RandomizedTest();

		while (true) {
			test.tag = false;
			test.clearConsole();
			System.out.println("1. Test version 1\n2. Test version 2\n3. Exit");
			System.out.print("\nChoice: ");
			String s = test.in.nextLine();
			switch (s) {

			case "1":
				test.Start1();
				s = "";
				break;
			case "2":
				test.Start2();
				s = "";
				break;
			case "3":
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

			System.out.println(question[i] + "\n");

			Shuffle1(i);

		}

	}

	void Start2() {

		for (int i = 0; i < answer.length; i++) {

			if (tag)
				break;

			clearConsole();

			System.out.println(answer[i] + "\n");

			Shuffle2(i);

		}

	}

	int Shuffle1(int index) {

		int num1 = 0, num2 = 0, num3 = 0;

		int placement;
		String choice = "";
		int c = 5;

		placement = (int) (Math.random() * 4);

		do {

			num1 = (int) (Math.random() * 26);

		} while (answer[num1].equals(answer[index]));

		do {

			num2 = (int) (Math.random() * 26);

		} while (num2 == num1 || answer[num2].equals(answer[index]));

		do {

			num3 = (int) (Math.random() * 26);

		} while (num3 == num1 || num3 == num2 || answer[num3].equals(answer[index]));

		if (placement == 0) {
			System.out.println("\t1. " + answer[index]);
			System.out.println("\t2. " + answer[num1]);
			System.out.println("\t3. " + answer[num2]);
			System.out.println("\t4. " + answer[num3]);
		}
		if (placement == 1) {
			System.out.println("\t1. " + answer[num1]);
			System.out.println("\t2. " + answer[index]);
			System.out.println("\t3. " + answer[num2]);
			System.out.println("\t4. " + answer[num3]);

		}
		if (placement == 2) {
			System.out.println("\t1. " + answer[num1]);
			System.out.println("\t2. " + answer[num2]);
			System.out.println("\t3. " + answer[index]);
			System.out.println("\t4. " + answer[num3]);

		}
		if (placement == 3) {
			System.out.println("\t1. " + answer[num1]);
			System.out.println("\t2. " + answer[num2]);
			System.out.println("\t3. " + answer[num3]);
			System.out.println("\t4. " + answer[index]);

		}
		System.out.println("\n\t5. Skip");
		System.out.println("\t6. Exit");

		System.out.print("\n");

		System.out.print("Choice: ");

		while (c != placement + 1) {

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

			if (c != placement + 1)
				System.out.print("Try Again: ");

		}

		return 0;

	}

	int Shuffle2(int index) {

		int num1 = 0, num2 = 0, num3 = 0;

		int placement;
		String choice = "";
		int c = 5;

		placement = (int) (Math.random() * 4);

		do {

			num1 = (int) (Math.random() * 26);

		} while (question[num1].equals(question[index]));

		do {

			num2 = (int) (Math.random() * 26);

		} while (num2 == num1 || question[num2].equals(question[index]));

		do {

			num3 = (int) (Math.random() * 26);

		} while (num3 == num1 || num3 == num2 || question[num3].equals(question[index]));

		if (placement == 0) {
			System.out.println("\t1. " + question[index]);
			System.out.println("\t2. " + question[num1]);
			System.out.println("\t3. " + question[num2]);
			System.out.println("\t4. " + question[num3]);
		}
		if (placement == 1) {
			System.out.println("\t1. " + question[num1]);
			System.out.println("\t2. " + question[index]);
			System.out.println("\t3. " + question[num2]);
			System.out.println("\t4. " + question[num3]);

		}
		if (placement == 2) {
			System.out.println("\t1. " + question[num1]);
			System.out.println("\t2. " + question[num2]);
			System.out.println("\t3. " + question[index]);
			System.out.println("\t4. " + question[num3]);

		}
		if (placement == 3) {
			System.out.println("\t1. " + question[num1]);
			System.out.println("\t2. " + question[num2]);
			System.out.println("\t3. " + question[num3]);
			System.out.println("\t4. " + question[index]);

		}
		System.out.println("\n\t5. Skip");
		System.out.println("\t6. Exit");

		System.out.print("\n");

		System.out.print("Choice: ");

		while (c != placement + 1) {

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

			if (c != placement + 1)
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
