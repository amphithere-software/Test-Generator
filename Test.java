import java.util.Scanner;

public class Test {

	Scanner in = new Scanner(System.in);

	String author[] = new String[26];
	String work[] = new String[26];
	boolean tag = false;

	Test() {

		author[0] = "Booker T. Washington";
		author[1] = "W. E. B. Du Bois";
		author[2] = "Robert Frost";
		author[3] = "Wallace Stevens";
		author[4] = "T.S. Eliot";
		author[5] = "Claude McKay";
		author[6] = "Langston Hughs";
		author[7] = "Countee Cullen";
		author[8] = "H.D. (Hilda Doolittle)";
		author[9] = "William Carlos Williams";
		author[10] = "Ezera Pound";
		author[11] = "Edna St. Vincent Millay";
		author[12] = "Zora Neal Hurston";
		author[13] = "William Faulkner";
		author[14] = "Ernest Hemingway";
		author[15] = "Flannery O'Connor";
		author[16] = "Randall Jarrell";
		author[17] = "Robert Lowell";
		author[18] = "Gwendolyn Brooks";
		author[19] = "Allen Ginsberg";
		author[20] = "Tennessee Williams";
		author[21] = "Denise Levertov";
		author[22] = "Norman Mailer";
		author[23] = "Adrienne Rich";
		author[24] = "Joy Harjo";
		author[25] = "Randall Kenan";

		work[0] = "Up From Slavery";
		work[1] = "The Souls of Black Folk";
		work[2] = "Mending Wall__The Wood-Pile__After Apple Picking";
		work[3] = "Sunday Morning__Thirteen Ways of Looking at a Blackbird";
		work[4] = "The Love Song of J. Alfred Prufrock__The Wasteland__The Burial of the Dead";
		work[5] = "If We Must Die__America";
		work[6] = "The Negro Speaks of Rivers__Let America Be America Again";
		work[7] = "Yet Do I Marvel";
		work[8] = "Oread__Leda__Helen";
		work[9] = "Spring and All__The Red Wheelbarrow__This Is Just to Say";
		work[10] = "In a Station of the Metro__The River Merchant’s Wife: A Letter__A Few Don'ts ";
		work[11] = "[I, being born a woman and distressed]__Spring__Apostrophe to Man";
		work[12] = "The Gilded Six-Bits";
		work[13] = "That Evening Sun";
		work[14] = "The Short Happy Life of Francis Macomber";
		work[15] = "Revelation";
		work[16] = "The Death of the Ball Turret Gunner";
		work[17] = "Memories of West Street and Lepke__For the Union Dead";
		work[18] = "We Real Cool__Martin Luther King, Jr.";
		work[19] = "Howl!";
		work[20] = "Cat on a Hot Tin Roof";
		work[21] = "In Mind__What Were They Like?";
		work[22] = "The Armies of the Night";
		work[23] = "Diving into the Wreck";
		work[24] = "Eagle Poem__White Bear";
		work[25] = "This Far";

	}

	public static void main(String[] args) {

		Test test = new Test();

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

		for (int i = 0; i < author.length; i++) {

			if (tag)
				break;

			clearConsole();

			System.out.println(author[i] + "\n");

			Shuffle1(i);

		}

	}

	void Start2() {

		for (int i = 0; i < work.length; i++) {

			if (tag)
				break;

			clearConsole();

			System.out.println(work[i] + "\n");

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

		} while (work[num1].equals(work[index]));

		do {

			num2 = (int) (Math.random() * 26);

		} while (num2 == num1 || work[num2].equals(work[index]));

		do {

			num3 = (int) (Math.random() * 26);

		} while (num3 == num1 || num3 == num2 || work[num3].equals(work[index]));

		if (placement == 0) {
			System.out.println("\t1. " + work[index]);
			System.out.println("\t2. " + work[num1]);
			System.out.println("\t3. " + work[num2]);
			System.out.println("\t4. " + work[num3]);
		}
		if (placement == 1) {
			System.out.println("\t1. " + work[num1]);
			System.out.println("\t2. " + work[index]);
			System.out.println("\t3. " + work[num2]);
			System.out.println("\t4. " + work[num3]);

		}
		if (placement == 2) {
			System.out.println("\t1. " + work[num1]);
			System.out.println("\t2. " + work[num2]);
			System.out.println("\t3. " + work[index]);
			System.out.println("\t4. " + work[num3]);

		}
		if (placement == 3) {
			System.out.println("\t1. " + work[num1]);
			System.out.println("\t2. " + work[num2]);
			System.out.println("\t3. " + work[num3]);
			System.out.println("\t4. " + work[index]);

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

		} while (author[num1].equals(author[index]));

		do {

			num2 = (int) (Math.random() * 26);

		} while (num2 == num1 || author[num2].equals(author[index]));

		do {

			num3 = (int) (Math.random() * 26);

		} while (num3 == num1 || num3 == num2 || author[num3].equals(author[index]));

		if (placement == 0) {
			System.out.println("\t1. " + author[index]);
			System.out.println("\t2. " + author[num1]);
			System.out.println("\t3. " + author[num2]);
			System.out.println("\t4. " + author[num3]);
		}
		if (placement == 1) {
			System.out.println("\t1. " + author[num1]);
			System.out.println("\t2. " + author[index]);
			System.out.println("\t3. " + author[num2]);
			System.out.println("\t4. " + author[num3]);

		}
		if (placement == 2) {
			System.out.println("\t1. " + author[num1]);
			System.out.println("\t2. " + author[num2]);
			System.out.println("\t3. " + author[index]);
			System.out.println("\t4. " + author[num3]);

		}
		if (placement == 3) {
			System.out.println("\t1. " + author[num1]);
			System.out.println("\t2. " + author[num2]);
			System.out.println("\t3. " + author[num3]);
			System.out.println("\t4. " + author[index]);

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