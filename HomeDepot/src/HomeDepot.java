import java.io.*;
import java.util.Scanner;

class HomeDepot {
	public static void main(String[] args) throws IOException, InterruptedException { // InterruptedException is there
																						// for the Thread.sleep
		Scanner Scanner = new Scanner(System.in);

		double nuts = 0.05; // initializes all the doubles
		double bolts = 0.05;
		double washers = 0.02;
		double subTotal = 0, totalHST = 0, total; // initializes and declares subTotal and totalHST as 0, so no errors
													// appear
		int inputNuts, inputBolts, inputWashers;

		int NutsDefault = 50; // initializing and declaring ints
		int BoltsDefault = 50;
		int WasherDefault = 50;
		String enter = "Please enter quantity for "; // initializing and declaring Strings
		String minimumWashers = "A minimum of 50 washers must be ordered before your order can be processed.  Please re-enter the minimum amount.";
		String minimumBolts = "A minimum of 50 bolts must be ordered before your order can be processed.  Please re-enter the minimum amount.";
		String minimumNuts = "A minimum of 50 nuts must be ordered before your order can be processed.  Please re-enter the minimum amount.";

		int i = 0; // declare the 3 ints default # as 0
		int y = 0;
		int r = 0;

		double nutPrice = 0;
		double boltPrice = 0;
		double washerPrice = 0;
		// asking input for nuts
		System.out.println(enter + "nuts:"); // asks user to input # of nuts wanted

		inputNuts = Scanner.nextInt();

		if (inputNuts >= 50) {
			System.out.println(inputNuts + " nuts have been requested.");
			nutPrice = inputNuts * nuts;
		} else if (inputNuts < 50) {
			while (inputNuts < 50 && i != 3) { // 3 tries
				System.out.println(minimumNuts); // asks to re enter value
				inputNuts = Scanner.nextInt();
				i++;
				if (i == 3) {
					System.out.println("50 nuts have been requested as the minimum.");
					nutPrice = inputNuts * 50;
				}
			}
			if (i != 3) {
				System.out.println(inputNuts + " nuts have been requested.");
				nutPrice = inputNuts * nuts;
			}

		}

		Thread.sleep(200);
		System.out.println("\n" + enter + "bolts:");
		inputBolts = Scanner.nextInt();

		if (inputBolts >= 50) {
			System.out.println(inputBolts + " bolts have been requested.");
			boltPrice = inputBolts * bolts;
		} else if (inputBolts < 50) {
			while (inputBolts < 50 && y != 3) {
				System.out.println(minimumBolts);
				inputBolts = Scanner.nextInt();
				y++;
				if (y == 3) {
					System.out.println("50 bolts have been requested as the minimum.");
					boltPrice = 50 * bolts;
				}
			}
			if (y != 3) {
				System.out.println(inputBolts + " bolts have been requested.");
				boltPrice = inputBolts * bolts;
			}
		}

		Thread.sleep(200);
		System.out.println("\n" + enter + "washers:");
		inputWashers = Scanner.nextInt();

		if (inputWashers >= 50) {
			System.out.println(inputWashers + " washers have been requested.");
			washerPrice = inputWashers * washers;
		} else if (inputWashers < 50) {
			while (inputWashers < 50 && r != 3) {
				System.out.println(minimumWashers);
				inputWashers = Scanner.nextInt();
				r++;
				if (r == 3) {
					System.out.println(WasherDefault + " washers have been requested as the minimum.");
					washerPrice = 50 * washers;
				}
			}
			if (y != 3) {
				System.out.println(inputWashers + " washers have been requested.");
				washerPrice = inputWashers * washers;
			}
		}

		Thread.sleep(200);
		System.out.println("\n" + "Please wait while your order is being processed.");
		for (int x = 0; x < 4; x++) {
			System.out.print(".");
			Thread.sleep(1000);
		}
		System.out.println();
		
			System.out.println("\n" + "Nuts: $" + nutPrice); 
			System.out.println("Bolts: $" + boltPrice); 
			System.out.println("Washers: $" + washerPrice); 
		
		// TOTAL w/ HST

			total = (nutPrice + boltPrice + washerPrice) * 1.15;
			System.out.println("Total: $" + Math.round(total * 100.0) / 100.0); 
		

		System.out.println("\n" + "Thank you for shopping at Home Depot!");

	}
}
