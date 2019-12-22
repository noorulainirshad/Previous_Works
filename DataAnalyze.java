import java.util.Scanner;

public class DataAnalyze {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);

		System.out.println("Please enter the sample size: ");
		int sampleSize = input.nextInt();
		int [] sampleNumber = new int [sampleSize + 1];
		for (int i = 0; i < sampleSize; i++) {
			sampleNumber[i] = i + 1;
		}
		System.out.println();


		double [] sampleOne = new double [sampleSize + 1];
		double [] sampleTwo = new double [sampleSize + 1];
		double [] sampleThree = new double [sampleSize + 1];
		double [] sampleFour = new double [sampleSize + 1];

		System.out.println("Enter numbers for Trial 1");
		for (int i = 0; i < sampleSize ; i++) {
			System.out.print("Enter sample #" + (i+1) + ": ");
			sampleOne[i] = input.nextInt();
		}
		System.out.println();

		System.out.println("Enter numbers for Trial 2");
		for (int i = 0; i < sampleSize ; i++) {
			System.out.print("Enter sample #" + (i+1) + ": ");
			sampleTwo[i] = input.nextInt();
		}
		System.out.println();

		System.out.println("Enter numbers for Trial 3");
		for (int i = 0; i < sampleSize ; i++) {
			System.out.print("Enter sample #" + (i+1) + ": ");
			sampleThree [i] = input.nextInt();
		}		
		System.out.println();


		System.out.println("Enter numbers for Trial 4");
		for (int i = 0; i < sampleSize ; i++) {
			System.out.print("Enter sample #" + (i+1)+ ": ");
			sampleFour[i] = input.nextInt();
		}
		System.out.println();


		double sumOne = 0;
		double sumTwo = 0;
		double sumThree = 0;
		double sumFour = 0;

		for (int i = 0; i < sampleNumber.length; i++) {
			sumOne += sampleOne[i];
			sumTwo += sampleTwo [i];
			sumThree += sampleThree [i];
			sumFour += sampleFour [i];
		}

		double averageOne = sumOne/sampleSize;
		double averageTwo = sumTwo/sampleSize;
		double averageThree = sumThree/sampleSize;
		double averageFour = sumFour/sampleSize;

		double [] averages = {averageOne, averageTwo, averageThree, averageFour};

		double max = 0;
		double min = averages [0];

		for (int i = 0; i < 4; i++) {
			if (averages[i] > max)
				max = averages[i];
			if (averages[i] < min)
				min = averages[i];			
		}

		System.out.println("\tSample #\tTrial 1\t\tTrial 2\t\tTrial 3\t\tTrial 4");

		for (int i = 0; i < sampleSize; i++) {
			System.out.println("\t" + sampleNumber[i] + "\t\t" + (int)sampleOne[i] + "\t\t" + (int)sampleTwo[i] + "\t\t" + (int)sampleThree[i] + "\t\t" + (int)sampleFour[i]);
		}

		System.out.println("\t------------------------------------------------------------------------");

		System.out.println("Averages:\t\t" + averageOne + "\t\t" + averageTwo + "\t\t" + averageThree + "\t\t" + averageFour +"\n");
		System.out.println("Min Average: " + min + "\nMax Average: " + max + "\n");


		if (min == max)
			System.out.println("The trials match EXACTLY!");
		else if (max < (2*min))
			System.out.println("The trials concur with each other!");
		else
			System.out.println("The trials do NOT concur!");


		input.close();

	}
}
