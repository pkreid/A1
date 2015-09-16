
import javax.swing.JOptionPane;


public class BoxWrapperProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int boxLen = GetDim("Length");
		int boxWidth = GetDim("Width");
		int boxHeight = GetDim("Height");
		
		int papLen = ((boxHeight * 2) + boxLen) + 1;
		int papWidth = ((boxWidth * 2) + (boxHeight * 2) + 1);
		JOptionPane.showMessageDialog(null, papWidth + " cm" + " * " + papLen + " cm", null, 0);
	}
	public static int GetDim(String DimName) {
	// Takes what dimension you want, asks the user for it, returns the dimension
		int DimVal = Integer.parseInt(JOptionPane.showInputDialog("What is the " + DimName + " of the object", 1));
		return DimVal;
		
	}

}
 