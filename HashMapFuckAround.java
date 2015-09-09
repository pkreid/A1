import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class HashMapFuckAround {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// populate the price list
		Map<String, String> barPrice= new HashMap<String,String>(){{
			//TODO add the rest of the bars
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
			System.out.print("How many boxes of " + entry.getKey() + " ");
			barNum.put(entry.getKey(), new Scanner(System.in).next());
			}
		
	//loop again
		float subTotal = 0;
		for(Map.Entry<String, String>entry : barPrice.entrySet()) {
			String barName = entry.getKey();
			String barAmt = barNum.get(barName);
			float barTotal = (Float.parseFloat(barPrice.get(barName)) * (Float.parseFloat(barAmt)) * 48);
			System.out.print(barAmt + " boxes of " + barName + " ($" + barPrice.get(barName) + " x 48) = $(" );
			System.out.printf("%.2f)\n",barTotal);
			subTotal += barTotal;
			System.out.print(subTotal);
		}
	}
}