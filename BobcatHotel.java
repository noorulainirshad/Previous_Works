import java.util.Scanner;
import java.util.Random;

public class BobcatHotel {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		Random random = new Random ();
		
		//declare and initialize the room prices
		final double single = 50.50;
		final double dOuble = 75.00;
		final double queen = 100.75;
		final double king = 150.25;
		final double masterSuite = 225.50;
		
		//declare and initialize the meal plans
		final double complimentary = 0.00;
		final double standard = 30.00;
		final double deluxe = 50.00;
		final double indulgence = 85.00;
		
		//declare variables that will change throughout my code/will appear later on in code
		double basecost , mealcost , prelimtotal , finaltotal , aaa , club , mealchoice , discountotal , roomchoice;
		int guests , nights , clubnum;
		
		//room formatting
		System.out.println("ROOM OPTIONS\n"
				+ "1. Single @ $" + single +" per night \n"
				+ "2. Double @ $" + dOuble + " per night \n"
				+ "3. Double @ $" + queen + " per night \n"
				+ "4. Double @ $" + king + " per night \n"
				+ "5. Master Suite @ $" + masterSuite + "per night");
		
		System.out.println();
		
		//initializing variables with scanner
		System.out.print("Number of guests: ");
		guests = input.nextInt();
		
		System.out.print("Please enter your choice of room (enter 1/2/3/4/5 corresponding to the options shown above): ");
		roomchoice = input.nextInt();
		
		System.out.print("Please enter your number of nights: ");
		nights = input.nextInt();
		
		System.out.print("Are you an AAA member (enter 1 for yes, 0 for no)? ");
		aaa = input.nextInt();

		System.out.print("Are you a club member (enter 1 for yes, 0 for no)? ");
		club = input.nextInt();
		
		System.out.println("");
		
		//room choice if-else statements
		if (roomchoice == 1)
			roomchoice = single;
		else if (roomchoice == 2)
			roomchoice = dOuble;
		else if (roomchoice == 3)
			roomchoice = queen;
		else if (roomchoice == 4)
			roomchoice = king;
		else if (roomchoice == 5)
			roomchoice = masterSuite;
		else
			System.out.println("Sorry, that room number is not  applicable.");
		
		//if-else statements for club membership
				if (club == 1)
				{
					clubnum = random.nextInt(10);
					if (clubnum >= 4)
					{
						club = (((clubnum) - (clubnum % 4)) / 4) * roomchoice;
						System.out.println("Congratutlations! You've qualified for our \"Stay 4 nights get 1 free promotion\" Discount will be applied during checkout depending on number of days");
					}
					else
					{
						club = 0;
						System.out.println("Unfortunately, you didn't qualify four our \"Stay 4 nights get 1 free promotion\". Better luck next time!");
					}
				}
				else if (club == 0)
					club = 0;
				else
					System.out.println("Sorry, that response number is not applicable.");
		
		System.out.println("");
		
		//meal package formatting
		System.out.println("MEAL PACKAGES (PRICES AS SHOWN PER NIGHT)\n"
				+ "0. Complimentary @ $" + complimentary + " per guest\n"
				+ "1. Standard @ $" + standard + " per guest\n"
				+ "2. Deluxe @ $" + deluxe + " per guest\n"
				+ "3. Indulgence @ $" + indulgence + " per guest\n");
		
		//initializing mealchoice variable
		System.out.println("Please select your desired meal package (enter 0/1/2/3 corresponding to the options shown above): ");
		mealchoice = input.nextInt();
		System.out.println();
		
		
		//mealchoice if-else statements
		if (mealchoice == 0)
			mealchoice = complimentary;
		else if (mealchoice == 1)
			mealchoice = standard;
		else if (mealchoice == 2)
			mealchoice = deluxe;
		else if (mealchoice == 3)
			mealchoice = indulgence;
		else
			System.out.println("Sorry, that meal number is not applicable.");
		
		//plug n chug equations
		basecost = nights * roomchoice;
		mealcost = guests * nights * mealchoice;
		prelimtotal = basecost + mealcost;
			
		//if-else statements for aaa membership
		if (aaa == 1)
			aaa = prelimtotal * 0.10;
		else if (aaa == 0)
			aaa = 0;
		else
			System.out.println("Sorry, that response number is not applicable.");
		
		discountotal = aaa + club;
		finaltotal = prelimtotal - discountotal;
		 
		 //checkout formatting
		 System.out.println("CHECKOUT\n"
			+"Room Cost:\t\t\t $" + basecost + "\n"
			+"Meal Cost:\t\t\t+$" + mealcost + "\n"
			+"Preliminary Total Cost:\t\t $" + prelimtotal + "\n"
			+"Club Member Discount:\t\t-$" + discountotal + "\n"
			+"Total Cost of Booking:\t\t $" + finaltotal);
	
				
		input.close();
	}

}
