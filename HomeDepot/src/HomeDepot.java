import java.io.*;

class HomeDepot {
	public static void main(String[] args) throws IOException, InterruptedException {	// InterruptedException is there for the Thread.sleep 
		InputStreamReader inStream = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(inStream);
		String inData;	// declares data input String as inData

		double nuts = 0.05;	// initializes all the doubles
		double bolts = 0.05;
		double washers = 0.02;
		double subTotal = 0, totalHST = 0, total;	// initializes and declares subTotal and totalHST as 0, so no errors appear
		int inputNuts, inputBolts, inputWashers;
	
		int NutsDefault = 50;	// initializing and declaring ints
		int BoltsDefault = 50;
		int WasherDefault = 50;
		String enter = "Please enter quantity for ";	// initializing and declaring Strings
		String minimumWashers = "A minimum of 50 washers must be ordered before your order can be processed.  Please re-enter the minimum amount.";
		String minimumBolts = "A minimum of 50 bolts must be ordered before your order can be processed.  Please re-enter the minimum amount.";
		String minimumNuts = "A minimum of 50 nuts must be ordered before your order can be processed.  Please re-enter the minimum amount.";

		int i = 0;	// declare the 3 ints default # as 0
		int y = 0;
		int r = 0;

		// asking input for nuts
		System.out.println(enter + "nuts:");	// asks user to input # of nuts wanted
		inData = stdin.readLine();		
		inputNuts = Integer.parseInt(inData);	// assigns inputNuts as the data input

		if (inputNuts >= 50 && i == 0) {		// if the input is equal or greater than 50, and i is 0
			System.out.println(inputNuts + " nuts have been requested.");	// display the amount of nuts requested
		}
		
		if (inputNuts < 50 && i == 0) {	// if the input is less than 50 and i is 0
			System.out.println(minimumNuts); // asks to re enter value
			inData = stdin.readLine();
			inputNuts = Integer.parseInt(inData);	// assigns inputNuts as data input
			
		if(inputNuts < 50 && i == 0) {	// another if statement inside the if statement, 
			i++;		// to add 1 to i if it meets those requirements, 
		}
	}
		
		if (i == 1) {	// if i is 1
			System.out.println(NutsDefault + " nuts have been requested as the minimum.");	// displays the amount of nuts, minimum
		}

		// asking input for bolts
		Thread.sleep(500);	// pauses for .5 seconds
		System.out.println("\n" + enter + "bolts:");	// makes a new line, asks user to input # of wanted bolts
		inData = stdin.readLine();
		inputBolts = Integer.parseInt(inData);	// assigns int inputBolts as the data input

		if (inputBolts >= 50 && y == 0) {	// if the input is greater than 50, and i is 0
			System.out.println(inputBolts + " bolts have been requested.");	// display # of requested bolts
		}		
		
		
		
		if (inputBolts < 50 && y == 0) {	// if the input is less than 50 and y is 0
			System.out.println(minimumBolts); // asks to re enter value
			inData = stdin.readLine();
			inputBolts = Integer.parseInt(inData);	// assigns inputBolts as data input
		
		if (inputBolts < 50 && y == 0) {	// another if statement inside the if statement, 
				y++;						// to add 1 to y if it meets those requirements, 
			}
		}

		if (y == 1) {	// if y is 1
			System.out.println(BoltsDefault + " bolts have been requested as the minimum.");	// displays minimum requested value
		}

		// asking input for washers
		Thread.sleep(500);	// pauses for .5 seconds
		System.out.println("\n" + enter + "washers:");	// makes a new line, asks user to input wanted # of washers
		inData = stdin.readLine();
		inputWashers = Integer.parseInt(inData);	// declares inputWashers as the input data

		if (inputWashers >= 50 && r == 0) {		// if the int is greater than 50 and r equals 0
			System.out.println(inputWashers + " washers have been requested.");	// displays wanted # of washers
		}		
		
		
		if (inputWashers < 50 && r == 0) {	// if int is less than 50 and r equals 0
			System.out.println(minimumWashers); // asks to re enter value
			inData = stdin.readLine();
			inputWashers = Integer.parseInt(inData);	// declares inputWashers as the input data
		if (inputWashers < 50 && r == 0) {	// another if statement inside the if statement, 
				r++;					// to add 1 to r if it meets those requirements, 
			}
		}

		if (r == 1) {	// if r equals 1
			System.out.println(WasherDefault + " washers have been requested as the minimum."); // display minimum wanted washers
		}
		
		Thread.sleep(200); // pause for .2 seconds
		System.out.println("\n" + "Please wait while your order is being processed.");	// makes new line and tells them to wait
		Thread.sleep(1000);		//
		System.out.print(".");	//
		Thread.sleep(1000);		//
		System.out.print(".");	//		this is just to make it look like its processing something
		Thread.sleep(1000);		//
		System.out.print(".");	//						bamboozled
		Thread.sleep(1000);		//
		System.out.println("");	//
		
		if(i == 1) {	// if i equals 1
			System.out.println("\n" + "Nuts: " + "$" + NutsDefault * nuts);	// makes new line, prints out default nuts (50) * price per nut (0.05)
		} else {
			System.out.println("\n" + "Nuts: " + "$" + inputNuts * nuts); // or else it will just print the data input * 0.05
		}
		
		
		if(y == 1) {	// if y equals 1
			System.out.println("Bolts: " + "$" + BoltsDefault * bolts);	// makes new line, prints out default bolts (50) * price per bolt (0.05)
		} else {
			System.out.println("Bolts: " + "$" + inputBolts * bolts);	// or else it will print data input * 0.05
		}

		if(r == 1) {	// if r equals 1
			System.out.println("Washers: " + "$" + WasherDefault * washers);	// makes new line, prints out default washers (50) * price per nut (0.02)
		} else {
			System.out.println("Washers: " + "$" + inputWashers * washers);		// or else it will print data input * 0.02
		}
		
		// SUB TOTAL
		if(i == 1 && y == 1 && r == 1) { // if i, y, and r ALL equal 1
			subTotal = (NutsDefault * nuts) + (BoltsDefault * bolts) + (WasherDefault * washers); // calculate subtotal with all minimum
		System.out.println("Sub-total: " + "$" + Math.round(subTotal*100.0)/100.0);	// displays Sub-total rounded to 2 decimal places
		} else if(i == 1 && y == 1) {					// if i and y equal 1
			subTotal = (NutsDefault * nuts) + (BoltsDefault * bolts) + (inputWashers * washers);	// calculate subtotal with nuts&bolts minimum, and washer data input
		System.out.println("Sub-total: " + "$" + Math.round(subTotal*100.0)/100.0);	// displays Sub-total rounded to 2 decimal places
		} else if(i == 1 && r == 1){					// if i and r equal 1
			subTotal = (NutsDefault * nuts) + (inputBolts * bolts) + (WasherDefault * washers);		// calculate subtotal with nuts&washers minimum, and bolts data input
		System.out.println("Sub-total: " + "$" + Math.round(subTotal*100.0)/100.0);	// displays Sub-total rounded to 2 decimal places
		} else if(i == 1) {										// if i equals 1
			subTotal = (NutsDefault * nuts) + (inputBolts * bolts) + (inputWashers * washers); // calculate subtotal with nuts minimum, and washer&bolts data input
		System.out.println("Sub-total: " + "$" + Math.round(subTotal*100.0)/100.0);	// displays Sub-total rounded to 2 decimal places
		} else if(y == 1 && r == 1) {				// if y and r equal 1
			subTotal = (inputNuts * nuts) + (BoltsDefault * bolts) + (WasherDefault * washers);	// calculate subtotal with bolts&washers minimum, and nuts data input
		System.out.println("Sub-total: " + "$" + Math.round(subTotal*100.0)/100.0);	// displays Sub-total rounded to 2 decimal places
		} else if(y == 1) {										// if y equals 1
			subTotal = (inputNuts * nuts) + (BoltsDefault * bolts) + (inputWashers * washers);	// calculate subtotal with bolts minimum, and nuts&washer data input
		System.out.println("Sub-total: " + "$" + Math.round(subTotal*100.0)/100.0);	// displays Sub-total rounded to 2 decimal places
		} else if(r == 1) {									// if r equals 1
			subTotal = (inputNuts * nuts) + (inputBolts * bolts) + (WasherDefault * washers);	// calculate subtotal with washer minimum, and nuts&bolts data input
		System.out.println("Sub-total: " + "$" + Math.round(subTotal*100.0)/100.0);	// displays Sub-total rounded to 2 decimal places
		} else {
			subTotal = (inputNuts * nuts) + (inputBolts * bolts) + (inputWashers * washers);	// or else it will just calculate with all data inputs
			System.out.println("Sub-total: " + "$" + Math.round(subTotal*100.0)/100.0);	// displays Sub-total rounded to 2 decimal places
		}

  // TOTAL HST

			totalHST = subTotal * 0.15;	// the totalHST is the subTotal calculated above, multiplied by 0.15
			System.out.println("Total HST: " + "$" + Math.round(totalHST*100.0)/100.0);	// displays HST rounded to 2 decimals
		
		
		
    // TOTAL
		total = subTotal + totalHST;	// declares double total as subTotal plus totalHST
		System.out.println("Total: " + "$" + Math.round(total*100.0)/100.0);	// displays total rounded to 2 decimals places
		Thread.sleep(1000);	// pauses for a second
		System.out.println("\n" + "Thank you for shopping at Home Depot!");	// makes new line, and prints string

	}
}
