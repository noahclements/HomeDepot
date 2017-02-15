import java.io.*;

class HomeDepot {
	public static void main(String[] args) throws IOException, InterruptedException {
		InputStreamReader inStream = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(inStream);
		String inData;

		double nuts = 0.05;
		double bolts = 0.05;
		double washers = 0.02;
		double subTotal, totalHST;
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

		System.out.println(enter + "nuts:");
		inData = stdin.readLine();
		inputNuts = Integer.parseInt(inData);

		if (inputNuts < 50 && i == 0) {
			System.out.println(minimumNuts); // asks to re enter value
			inData = stdin.readLine();
			inputNuts = Integer.parseInt(inData);
			i++;
		}
		if (inputNuts >= 50) {
			System.out.println(inputNuts + " nuts have been requested.");
		}
		if (i == 1) {
			System.out.println(NutsDefault + " nuts have been requested as the minimum.");
		}

		System.out.println(enter + "bolts:");
		inData = stdin.readLine();
		inputBolts = Integer.parseInt(inData);

		if (inputBolts < 50 && y == 0) {
			System.out.println(minimumBolts); // asks to re enter value
			inData = stdin.readLine();
			inputBolts = Integer.parseInt(inData);
			y++;
		}
		if (inputBolts >= 50) {
			System.out.println(inputBolts + " bolts have been requested.");
		}
		if (y == 1) {
			System.out.println(BoltsDefault + " bolts have been requested as the minimum.");
		}

		System.out.println(enter + "washers:");
		inData = stdin.readLine();
		inputWashers = Integer.parseInt(inData);

		if (inputWashers < 50 && r == 0) {
			System.out.println(minimumWashers); // asks to re enter value
			inData = stdin.readLine();
			inputWashers = Integer.parseInt(inData);
			r++;
		}
		if (inputWashers >= 50) {
			System.out.println(inputWashers + " washers have been requested.");
		}
		if (r == 1) {
			System.out.println(WasherDefault + " washers have been requested as the minimum.");
		}
		
		Thread.sleep(500);
		System.out.println("\n" + "Please wait while your order is being processed.");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.println("");
		System.out.println("\n" + "Nuts: " + "$" + inputNuts * nuts);

		System.out.println("Bolts: " + "$" + inputBolts * bolts);

		System.out.println("Washers: " + "$" + inputWashers + washers);

		subTotal = (inputNuts * nuts) + (inputBolts + bolts) + (inputWashers + washers);
		System.out.println("Sub-total: " + "$" + Math.round(subTotal*100.0)/100.0);

		totalHST = (inputNuts * nuts) + (inputBolts + bolts) + (inputWashers + washers) * 0.15;
		System.out.println("HST: " + "$" + Math.round(totalHST*100.0)/100.0);

		double total = subTotal + totalHST;
		System.out.println("Total: " + "$" + Math.round(total*100.0)/100.0);
		Thread.sleep(1000);
		System.out.println("\n" + "Thank you for shopping at Home Depot!");

	}
}