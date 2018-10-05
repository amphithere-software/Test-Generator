import java.util.Scanner;

public class SE_TEST {

	Scanner in = new Scanner(System.in);

	String question[] = new String[66];
	String answer[] = new String[66];
	boolean tag = false;

	SE_TEST() {

		question[0] = "What is software engineering?";
		question[1] = "Error:";
		question[2] = "Fault:";
		question[3] = "Failure:";
		question[4] = "What is good software?\n\n\tTranscendental view:";
		question[5] = "What is good software?\n\n\tUser view:";
		question[6] = "What is good software?\n\n\tManufacturer view:";
		question[7] = "What is good software?\n\n\tValue-based view:";
		question[8] = "Pfleeger's view: good SW consists of:\n\n\tQuality of product:";
		question[9] = "Pfleeger's view: good SW consists of:\n\n\tQuality of process:";
		question[10] = "Pfleeger's view: good SW consists of:\n\n\tLow cost/risk:";
		question[11] = "Who does S.E.?\n\n\tCustomer:";
		question[12] = "Who does S.E.?\n\n\tDeveloper:";
		question[13] = "Who does S.E.?\n\n\tUser:";
		question[14] = "Definition of 'system' in S.E.";
		question[15] = "Definition of 'engineering' in S.E.";
		question[16] = "Members of development team and their roles:\n\n\tAnalist";
		question[17] = "Members of development team and their roles:\n\n\tDesigner";
		question[18] = "Members of development team and their roles:\n\n\tProgrammer";
		question[19] = "Members of development team and their roles:\n\n\tTester";
		question[20] = "Members of development team and their roles:\n\n\tTrainer";
		question[21] = "7 key factors that have altered SE";
		question[22] = "Definition of 'SW process'";
		question[23] = "Definition of 'SW process model'";
		question[24] = "Waterfall model:";
		question[25] = "V-model:";
		question[26] = "Prototype model:";
		question[27] = "Spiral model:";
		question[28] = "Project deliverables:";
		question[29] = "Activity:";
		question[30] = "Milestone:";
		question[31] = "Precursor:";
		question[32] = "Duration:";
		question[33] = "Activity graphs purpose:";
		question[34] = "Critical path method:";
		question[35] = "Project personnel: roles:";
		question[36] = "Project personnel: communication:";
		question[37] = "Project personnel: work style: Extroverts:";
		question[38] = "Project personnel: work style: Introverts:";
		question[39] = "Project personnel: work style: Intuitives:";
		question[40] = "Project personnel: work style: Rationals:";
		question[41] = "Chief programmer team:";
		question[42] = "Egoless approach:";
		question[43] = "Risk Management----<";
		question[44] = "List of items in 'Project Plan' document: Introduction:";
		question[45] = "List of items in 'Project Plan' document: Project organization:";
		question[46] = "List of items in 'Project Plan' document: Management Plan:";
		question[47] = "List of items in 'Project Plan' document: Technical process:";
		question[48] = "List of items in 'Project Plan' document: Work schedule:";
		question[49] = "SW requirement definition:";
		question[50] = "SW requirement objectives:";
		question[51] = "User requirements:";
		question[52] = "System requirements:";
		question[53] = "Software specification:";
		question[54] = "Functional requirement:";
		question[55] = "Non-functional requirement:";
		question[56] = "UML (Unified Modeling Language):";
		question[57] = "Association:";
		question[58] = "Generalization:";
		question[59] = "Dependency:";
		question[60] = "Realization relation:";
		question[61] = "Aggregation relation:";
		question[62] = "Composite aggregation:";
		question[63] = "Software Requirement Specification (SRS): Introduction:";
		question[64] = "Software Requirement Specification (SRS): Overall (general) description";
		question[65] = "Software Requirement Specification (SRS): Requirement specifications";

		answer[0] = "Study on designing and developing high quality software";
		answer[1] = "Human error leads to fault";
		answer[2] = "Incorrect process in SW that causes the program\n\tto perform in an unintended manner. Leads to failure.";
		answer[3] = "Inability of SW to perform its required behavior, system crash.";
		answer[4] = "Quality is something we can recognize but not define.";
		answer[5] = "Fitness for purpose";
		answer[6] = "Conformance to specification";
		answer[7] = "# of customers willing to pay for it";
		answer[8] = "Small number of failure or falts";
		answer[9] = "Decent development process & management --> quality SW";
		answer[10] = "Cost of development/employment, high productivity to business";
		answer[11] = "The company, organization, or person who pays for the software system";
		answer[12] = "The company, organization, or person who is building the software system";
		answer[13] = "The person or people who will actually use the system";
		answer[14] = "Collection of objects and activities + their relation\n\t(HW,SW,People)(consider Use case/ER Diagram)";
		answer[15] = "Techniques in:\n\tRequirement analysis\n\tSystem/program design\n\tImplementation\n\tTesting\n\tMaintenance";
		answer[16] = "Requirement analysis";
		answer[17] = "System/program design";
		answer[18] = "Implementation";
		answer[19] = "Testing";
		answer[20] = "Maintenance";
		answer[21] = "Time to market\n\tPersonal computers\n\tInternet\n\tOOP\n\tGUI\n\tProblem with waterfall model(no longer suitable for today's system)\n\tEconomics of computing: low HW cost/high development cost";
		answer[22] = "SW lifecycle that describes major activities, constraints, and resources";
		answer[23] = "Simplified representation of SW process";
		answer[24] = "Simple/does not reflect feedback";
		answer[25] = "Involves users in testing/requires extensive testing (high cost)";
		answer[26] = "Better understanding of the problem at early stages\n\t(reduces risk)/requires prototyping (which may not be necissary)";
		answer[27] = "Feedback from users (monitors risks through process)/overhead";
		answer[28] = "Items customers expect ot see";
		answer[29] = "Part of the project that takes place";
		answer[30] = "Completion of activity";
		answer[31] = "A set of events that must occur before an activity can start";
		answer[32] = "Date that an activity must be completed";
		answer[33] = "Understand the dependencies among activities";
		answer[34] = "Longest path of the activity graph";
		answer[35] = "Requirement analysis\n\tSystem/program design\n\tImplementation\n\tTesting\n\tMaintenance";
		answer[36] = "A project's progress is affected by degree of communication and the ability\n\tof individuals to communicate their idea b/c Line of communication can grow\n\tquickly.  If there is n worker in project,\n\tthen there are n(n-1)/2 pairs of communication";
		answer[37] = "Tell their thoughts";
		answer[38] = "Ask for seggestions";
		answer[39] = "Base decisions on feelings";
		answer[40] = "Base decisions of facts, options";
		answer[41] = "One person totally responsible for a system's design and development";
		answer[42] = "hold everyone equally responsible";
		answer[43] = "Assessment---Identification: create check list\n\tControl---Risk reduction: create avoidance/mitigation strategy";
		answer[44] = "Overview, deliverables, document version, references, definitions";
		answer[45] = "Process model, team structure, project/team responsibilities";
		answer[46] = "Assumptions, risk management/monitoring plan";
		answer[47] = "Tools and techniques, documentation plan";
		answer[48] = "Schedule and other work elements";
		answer[49] = "A high-level abstract statement of a service or of a system constraint\n\tto a detailed functional specification";
		answer[50] = "To ensure a software solution correctly solves a particular problem";
		answer[51] = "Statements in natural language plus diagrams of the services the\n\tsystem provides and its operational constraints. Written for customers.";
		answer[52] = "A structured document setting out detailed descriptions of the system\n\tservices.  Written as a contract between client and contractor.";
		answer[53] = "A detailed software description which can serve as a basis for a design or implementation.  Written for developers.";
		answer[54] = "Describes functionality or system services";
		answer[55] = "Product, organizational, external, performance";
		answer[56] = "A collection of notations used to document software specifications and designs";
		answer[57] = "⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯";
		answer[58] = "⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯▶";
		answer[59] = "-------------------->";
		answer[60] = "--------------------▷";
		answer[61] = "⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⋄";
		answer[62] = "⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⬩";
		answer[63] = "Purpose/scope/acronyms,definitions/references";
		answer[64] = "Product description/product functions/user characteristics/constraints/assumptions";
		answer[65] = "External interface requirement/functional requirement/performance, design, quality,\n\tand other requirements";

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
