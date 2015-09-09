import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

 
public class ChocolateBarsProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// populate the price list
		Map<String, String> barPrice= new HashMap<String,String>(){{
			
			put("Oh Henry", "0.65");
			put("Coffee Crisp", "0.80");
			put("Aero", "0.60");
			put("Smarties", "0.70");
			put("Crunchie", "0.75");
	
		}};
	// Make the hash to store the amounts
		Map<String, String> barNum = new HashMap<String, String>();
	// Loop over the entries 
		for (Map.Entry<String, String>entry : barPrice.entrySet()) {
			// Take the names from barPrice, get amount from Console
			System.out.printf("%-75s", "How many boxes of " + entry.getKey() + " would you like (48 bars per box) ? ");
			barNum.put(entry.getKey(), new Scanner(System.in).next());
			}
		
	//loop again
		float subTotal = 0;
		float HST;
		float amtDue;
		float HSTrate = 0.13f;
		for(Map.Entry<String, String>entry : barPrice.entrySet()) {
			String barName = entry.getKey();
			String barAmt = barNum.get(barName);
			float barTotal = (Float.parseFloat(barPrice.get(barName)) * (Float.parseFloat(barAmt)) * 48);
			System.out.printf("%-25s", barAmt + " boxes of " + barName);
			System.out.printf("%19s", "($" + barPrice.get(barName) + " x 48) = $" );
			System.out.printf("%2.2f\n",barTotal);
			subTotal += barTotal;
		}
		
		HST = subTotal * HSTrate;
		amtDue = subTotal + HST;
		
		System.out.printf("\n--------------------------------------------------\n");
		System.out.printf("Sub Total                               = $%3.2f \n", subTotal);
		System.out.printf("HST                                     =  $%03.2f \n", HST);
		System.out.printf("==================================================\n");
		System.out.printf("Amount Due                              = $%3.2f", amtDue);
		
			
			
	}
}