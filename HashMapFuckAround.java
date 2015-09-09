import java.util.HashMap;
import java.util.Map;


public class HashMapFuckAround {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// populate the price list
		Map<String, String> BarHash = new HashMap<String,String>(){{
			put("Oh Henry      ", "0.65");
			put("Coffee Crisp  ", "0.80");
			put("Aero          ", "0.60");
			put("Smarties      ", "0.70");
			put("Crunchie      ", "0.75");
	
		}};
	// Loop over the entries 
		for (Map.Entry<String, String>entry : BarHash.entrySet()) {
			System.out.println(entry.getKey() +" " + entry.getValue());
		}
		for(Map.Entry<String, String>entry : BarHash.entrySet()) {
			System.out.println("How many boxes of " + entry.getKey() + " would you like (48 bars per box) ? ");
		//	String barName = entry.getKey();
		//	String barVal = entry.getValue();
		//	System.out.println(entry);
		}
	//	System.out.println(BarHash.toString());
		}
}
