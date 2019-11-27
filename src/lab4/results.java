package lab4;

//global variables allows variables to be used outside of class
public class results {

	static double physics = 25;
	static double chemistry = 26;
	static double biology = 100;
	static double total = (physics + chemistry + biology);
	static double percentage = ((total * 100) / 450);

	public static void main(String[] args) {

		printResults();
		printTotal();
		printPercentage();
		printPassrate();
	}

	public static void printResults() {

		System.out.println("Physics: " + physics);
		System.out.println("Chemistry: " + chemistry);
		System.out.println("Biology: " + biology);

	}

	public static void printTotal() {
		System.out.println("Total Marks: " + total);

	}

	public static void printPercentage() {
		System.out.println("Overall Percentage: " + percentage);

	}

	public static void printPassrate() {
		if (percentage > 60) {
			System.out.println("Passed");
		}

		else {
			System.out.println("Failed");


			double physPercent = ((physics * 100) / 150);
			double chemPercent = ((chemistry * 100) / 150);
			double bioPercent = ((biology * 100) / 150);

			int tally = 0;

			if (physics > 60) {
				System.out.println("Passed Physics");
				System.out.println(physPercent);
			}

			else {
				System.out.println("Failed Physics");
				System.out.println(physPercent);
				tally++;
			}

			if (chemistry > 60) {
				System.out.println("Passed Chemistry");
				System.out.println(chemPercent);
			}

			else {
				System.out.println("Failed Chemistry");
				System.out.println(chemPercent);
				tally++;
			}

			if (biology > 60) {
				System.out.println("Passed Biology");
				System.out.println(bioPercent);

			}

			else {
				System.out.println("Failed Biology");
				System.out.println(bioPercent);
				tally++;
			}

			if (tally > 0) {
				System.out.println("Exams Failed: "+tally);
			}
		}

	}
}
