import java.io.*;
import java.util.Scanner;

class HomeDepot {
	public static void main(String[] args) throws IOException, InterruptedException { 
		Scanner Scanner = new Scanner(System.in);

		double nuts = 0.05; // initializes all the doubles
		double bolts = 0.05;
		double washers = 0.02;
		double total; 
		int inputNuts, inputBolts, inputWashers;

		String minString1 = "A minimum of 50 ";
		String minString2 = " washers must be ordered before your order can be processed.  Please re-enter the minimum amount.";

		int i = 0; 
		int y = 0;
		int r = 0;

		double nutPrice = 0;
		double boltPrice = 0;
		double washerPrice = 0;
		
		System.out.println("Please enter quantity for nuts:"); 
		inputNuts = Scanner.nextInt();

		if (inputNuts >= 50) {
			System.out.println(inputNuts + " nuts have been requested.");
			nutPrice = inputNuts * nuts;
		} else if (inputNuts < 50) {
			while (inputNuts < 50 && i != 3) { // 3 tries
				System.out.println(minString1 + "nuts" + minString2); // asks to re enter value
				inputNuts = Scanner.nextInt();
				i++;
				if (i == 3) {
					System.out.println("50 nuts have been requested as the minimum.");
					nutPrice = 50 * nuts;
				}
			}
			if (i != 3) {
				System.out.println(inputNuts + " nuts have been requested.");
				nutPrice = inputNuts * nuts;
			}

		}

		Thread.sleep(200);
		System.out.println("\n" + "Please enter quantity for bolts:");
		inputBolts = Scanner.nextInt();

		if (inputBolts >= 50) {
			System.out.println(inputBolts + " bolts have been requested.");
			boltPrice = inputBolts * bolts;
		} else if (inputBolts < 50) {
			while (inputBolts < 50 && y != 3) {
				System.out.println(minString1 + "bolts" + minString2);
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
		System.out.println("\n" + "Please enter quantity for washers:");
		inputWashers = Scanner.nextInt();

		if (inputWashers >= 50) {
			System.out.println(inputWashers + " washers have been requested.");
			washerPrice = inputWashers * washers;
		} else if (inputWashers < 50) {
			while (inputWashers < 50 && r != 3) {
				System.out.println(minString1 + "washers" + minString2);
				inputWashers = Scanner.nextInt();
				r++;
				if (r == 3) {
					System.out.println("50 washers have been requested as the minimum.");
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
