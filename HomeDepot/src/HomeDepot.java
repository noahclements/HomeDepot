import java.io.*;

class HomeDepot {
	public static void main(String[] args) throws IOException, InterruptedException {
		InputStreamReader inStream = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(inStream);
		String inData;

		double nuts = 0.05;
		double bolts = 0.05;
		double washers = 0.02;
		double subTotal = 0, totalHST = 0, total;
		int inputNuts, inputBolts, inputWashers;
	
		int NutsDefault = 50;
		int BoltsDefault = 50;
		int WasherDefault = 50;
		String enter = "Please enter quantity for ";
		String minimumWashers = "A minimum of 50 washers must be ordered before your order can be processed.  Please re-enter the minimum amount.";
		String minimumBolts = "A minimum of 50 bolts must be ordered before your order can be processed.  Please re-enter the minimum amount.";
		String minimumNuts = "A minimum of 50 nuts must be ordered before your order can be processed.  Please re-enter the minimum amount.";

		int i = 0;
		int y = 0;
		int r = 0;

		// asking input for nuts
		System.out.println(enter + "nuts:");
		inData = stdin.readLine();
		inputNuts = Integer.parseInt(inData);

		if (inputNuts >= 50 && i == 0) {
			System.out.println(inputNuts + " nuts have been requested.");
		}
		
		if (inputNuts < 50 && i == 0) {
			System.out.println(minimumNuts); // asks to re enter value
			inData = stdin.readLine();
			inputNuts = Integer.parseInt(inData);
			
		if(inputNuts < 50 && i == 0) {
			i++;
		}
	}
		
		if (i == 1) {
			System.out.println(NutsDefault + " nuts have been requested as the minimum.");
		}

		// asking input for bolts
		Thread.sleep(500);
		System.out.println("\n" + enter + "bolts:");
		inData = stdin.readLine();
		inputBolts = Integer.parseInt(inData);

		if (inputBolts >= 50 && i == 0) {
			System.out.println(inputBolts + " bolts have been requested.");
		}		
		
		
		
		if (inputBolts < 50 && y == 0) {
			System.out.println(minimumBolts); // asks to re enter value
			inData = stdin.readLine();
			inputBolts = Integer.parseInt(inData);
		
		if (inputBolts < 50 && y == 0) {
				y++;
			}
		}

		if (y == 1) {
			System.out.println(BoltsDefault + " bolts have been requested as the minimum.");
		}

		// asking input for washers
		Thread.sleep(500);
		System.out.println("\n" + enter + "washers:");
		inData = stdin.readLine();
		inputWashers = Integer.parseInt(inData);

		if (inputWashers >= 50) {
			System.out.println(inputWashers + " washers have been requested.");
		}		
		
		
		if (inputWashers < 50 && r == 0) {
			System.out.println(minimumWashers); // asks to re enter value
			inData = stdin.readLine();
			inputWashers = Integer.parseInt(inData);
		if (inputWashers < 50 && r == 0) {
				r++;
			}
		}

		if (r == 1) {
			System.out.println(WasherDefault + " washers have been requested as the minimum.");
		}
		
		Thread.sleep(200);
		System.out.println("\n" + "Please wait while your order is being processed.");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.println("");
		
		if(i == 1) {
			System.out.println("\n" + "Nuts: " + "$" + NutsDefault * nuts);
		} else {
			System.out.println("\n" + "Nuts: " + "$" + inputNuts * nuts);
		}
		
		
		if(y == 1) {
			System.out.println("Bolts: " + "$" + BoltsDefault * bolts);
		} else {
			System.out.println("Bolts: " + "$" + inputBolts * bolts);
		}

		if(r == 1) {
			System.out.println("Washers: " + "$" + WasherDefault * washers);
		} else {
			System.out.println("Washers: " + "$" + inputWashers * washers);
		}
		
		// SUB TOTAL
		if(i == 1 && y == 1 && r == 1) { // nuts, bolts, and washers
			subTotal = (NutsDefault * nuts) + (BoltsDefault * bolts) + (WasherDefault * washers);
		System.out.println("Sub-total: " + "$" + Math.round(subTotal*100.0)/100.0);
		} else if(i == 1 && y == 1) {					// nuts, bolts
			subTotal = (NutsDefault * nuts) + (BoltsDefault * bolts) + (inputWashers * washers);
		System.out.println("Sub-total: " + "$" + Math.round(subTotal*100.0)/100.0);
		} else if(i == 1 && r == 1){					// nuts, washers
			subTotal = (NutsDefault * nuts) + (inputBolts * bolts) + (WasherDefault * washers);
		System.out.println("Sub-total: " + "$" + Math.round(subTotal*100.0)/100.0);
		} else if(i == 1) {										// nuts
			subTotal = (NutsDefault * nuts) + (inputBolts * bolts) + (inputWashers * washers);
		System.out.println("Sub-total: " + "$" + Math.round(subTotal*100.0)/100.0);
		} else if(y == 1 && r == 1) {				// Bolts and Washers
			subTotal = (inputNuts * nuts) + (BoltsDefault * bolts) + (WasherDefault * washers);
		System.out.println("Sub-total: " + "$" + Math.round(subTotal*100.0)/100.0);
		} else if(y == 1) {										// bolts
			subTotal = (inputNuts * nuts) + (BoltsDefault * bolts) + (inputWashers * washers);
		System.out.println("Sub-total: " + "$" + Math.round(subTotal*100.0)/100.0);
		} else if(r == 1) {									// washers
			subTotal = (inputNuts * nuts) + (inputBolts * bolts) + (WasherDefault * washers);
		System.out.println("Sub-total: " + "$" + Math.round(subTotal*100.0)/100.0);
		} else {
			subTotal = (inputNuts * nuts) + (inputBolts * bolts) + (inputWashers * washers);
			System.out.println("Sub-total: " + "$" + Math.round(subTotal*100.0)/100.0);
		}

  // TOTAL HST

			totalHST = subTotal * 0.15;
			System.out.println("Total HST: " + "$" + Math.round(totalHST*100.0)/100.0);
		
		
		
    // TOTAL
		total = subTotal + totalHST;
		System.out.println("Total: " + "$" + Math.round(total*100.0)/100.0);
		Thread.sleep(1000);
		System.out.println("\n" + "Thank you for shopping at Home Depot!");

	}
}
