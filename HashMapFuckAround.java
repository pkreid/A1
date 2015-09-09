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
			put("Oh Henry      ", "0.65");
			put("Coffee Crisp  ", "0.80");
			put("Aero          ", "0.60");
			put("Crunchie      ", "0.75");
	
		}};
	// Make the hash to store the amounts
		Map<String, String> barNum = new HashMap<String, String>();
	// Loop over the entries 
		for (Map.Entry<String, String>entry : barPrice.entrySet()) {
			// Take the names from barPrice, get amount from Console
			System.out.println("How many boxes of " + entry.getKey());
			barNum.put(entry.getKey(), new Scanner(System.in).nextLine());
			System.out.println(barNum.get(entry.getKey()));
			
		
		
		}
		
		//loop again
	
	//	for(Map.Entry<String, String>entry : barPrice.entrySet()) {
	//		System.out.println("How many boxes of " + entry.getKey() + " would you like (48 bars per box) ? ");
		//	String barName = entry.getKey();
		//	String barVal = entry.getValue();1
		//	System.out.println(entry);
		}
	//	System.out.println(BarHash.toString());
		}