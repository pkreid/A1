
import javax.swing.JOptionPane;


public class BoxWrapperProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int boxHeight = GetDim("Height");
		int boxLen = GetDim("Length");
		int boxWidth = GetDim("Width");
	//	System.out.println(height);
		
		int papLen = ((boxHeight * 2) + boxLen) + 1;
		int papWidth = ((boxWidth * 2) + (boxHeight * 2) + 1);
		JOptionPane.showMessageDialog(null, Integer.toString(papLen) + " * " "Integer.toString(papWidth), null, 0);
	}
	public static int GetDim(String DimName) {
		int DimVal = Intege r.parseInt(JOptionPane.showInputDialog("What is the " + DimName + " of the object", 1));
		return DimVal;
		
	}

}
 