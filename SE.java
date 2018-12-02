import java.util.Scanner;

public class SE {

	Scanner in = new Scanner(System.in);

	String question[] = new String[26];
	String answer[] = new String[26];
	boolean tag = false;

	SE() {

		question[0] = "Black-Box testing";
		question[1] = "White-Box testing";
		question[2] = "Equivalence Partitioning";
		question[3] = "Boundary Value Analysis";
		question[4] = "Error Guessing";
		question[5] = "Statement coverage";
		question[6] = "Branch coverage";
		question[7] = "Condition coverage";
		question[8] = "Black-Box testng methods";
		question[9] = "White-Box testing methods";
		question[10] = "Unit Testing";
		question[11] = "Integration Testing";
		question[12] = "System Testing";
		question[13] = "Acceptance Testing";
		question[14] = "__is a process of finding unknown errors in a software product that can be done by a developer or a tester";
		question[15] = "In ___ we focus on inputs and output of the software system without bothering about internal knowledge of the software program.";
		question[16] = "Suppose that we have decided to examine all possible paths in the flow chart.  Which of the following would be the most appropriate method?";
		question[17] = "Suppose that we will evaluate each one of the Boolean expression in the program.  Which of the following would be the most appropriate method?";
		question[18] = "Blackbox testing is mainly applicable to ___";
		question[19] = "___is the visual representation of an Android application.  It represents a single screen with a user interface just like window or frame of Java.";
		question[20] = "___works as a bridge between two interfaces.  This pattern involves a single class which is responsible to join functions of independent or incompatible interfaces";
		question[21] = "___is used to define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.";
		question[22] = "___hides the complexities of the system and provides an interface to the client using which the client can access the system.";
		question[23] = "This pattern involves a single class which is responsible to create an object while making sure that only single object gets created.";
		question[24] = "Testing";
		question[25] = "Debugging";

		answer[0] = "Perform a test using input & output values";
		answer[1] = "Perform a detailed investigation of internal logic and structure of the code";
		answer[2] = "Use the representative values when the range of input values are known";
		answer[3] = "Use representatives of boundary values in a range";
		answer[4] = "Experience-based testing technique where the test analyst uses his/her experience to guess the problematic areas of the application";
		answer[5] = "All statements in the program are executed at least once";
		answer[6] = "Test all branch statements in the program";
		answer[7] = "Each one of the Boolean expression is evaluated to both TRUE and FALSE";
		answer[8] = "Equivalence Partitioning, Boundary Value Analysis, Error Guessing";
		answer[9] = "Statement coverage, Branch coverage, Condition coverage";
		answer[10] = "In this phase, we focus on specific units of the software to determine whether each one is fully functional";
		answer[11] = "This testing level is designed to find interface defects between the modules or functions to determine how efficiently the units are running together";
		answer[12] = "System testing is the first level in which the complete application is tested as a whole";
		answer[13] = "It is to determine whether the system is ready for release";
		answer[14] = "SW Testing";
		answer[15] = "Black box testing";
		answer[16] = "Branch coverage";
		answer[17] = "Condition coverage";
		answer[18] = "System Testing";
		answer[19] = "An Activity";
		answer[20] = "Adapter pattern";
		answer[21] = "Observer pattern";
		answer[22] = "Facade pattern";
		answer[23] = "Singleton pattern";
		answer[24] = "detect unknown error.  Done by developer or a dedicated testing team";
		answer[25] = "fix known error.  Done by developer.";

	}

	public static void main(String[] args) {

		SE test = new SE();

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
