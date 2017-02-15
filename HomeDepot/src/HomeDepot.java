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
  System.out.println(enter + "nuts:");
		inData = stdin.readLine();
		inputNuts = Integer.parseInt(inData);
	while(i < 2) {
		if(inputNuts < 50) {
		    System.out.println(minimumNuts); // asks to re enter value 
		    inData = stdin.readLine();
		    inputNuts = Integer.parseInt(inData);
			System.out.println(inputNuts + " nuts have been requested.");
			i++;
		 }
			else if (inputNuts >= 50) {
			System.out.println(inputNuts + " nuts have been requested.");
			}
			else System.out.println(NutsDefault + " nuts have been requested as the minimum.");
		
	}
		 System.out.println(enter + "bolts:");
		inData = stdin.readLine();
		inputBolts = Integer.parseInt(inData);
		System.out.println(inputBolts + " bolts have been requested.");
		
	System.out.println(enter + "washers:");
		inData = stdin.readLine();
		inputWashers = Integer.parseInt(inData);
    System.out.println(inputWashers + " washers have been requested.");
    
    
    
 /*   
    if(inputNuts < 50) {
      System.out.println(minimumNuts);
      inputNuts = Integer.parseInt(inData);
		  System.out.println(inputNuts + " nuts have been requested.");
		  
    }
    */
    if(inputBolts < 50) {
      System.out.println(minimumBolts);
      inputBolts = Integer.parseInt(inData);
		  System.out.println(inputBolts + " bolts have been requested.");
    }
    if(inputWashers < 50) {
      System.out.println(minimumWashers);
      inputWashers = Integer.parseInt(inData);
      System.out.println(inputWashers + " washers have been requested.");
    }
    
    
    System.out.println("Please wait while your order is being processed.");
    Thread.sleep(1000);
    System.out.print(".");
    Thread.sleep(1000);
    System.out.print(".");
    Thread.sleep(1000);
    System.out.print(".");
    
 
   
    
    System.out.println("Nuts: " + "$" + inputNuts * nuts);
    
    System.out.println("Bolts: " + "$" + inputBolts * bolts);
    
    System.out.println("Washers: " + "$" + inputWashers + washers);
    
    subTotal = (inputNuts * nuts) + (inputBolts + bolts) + (inputWashers + washers);
    System.out.println("Sub-total: " + "$" + subTotal);
    
    totalHST = (inputNuts * nuts) + (inputBolts + bolts) + (inputWashers + washers) * 0.15;
    System.out.println("HST: " + "$" + totalHST);
    
    
    System.out.println("Total: " + "$" + subTotal + totalHST);
    
    System.out.println("Thank you for shopping at Home Depot!");
    
  
}
}