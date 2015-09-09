import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.BoldAction;

import java.lang.Double; 
import java.lang.Object; 
public class BallPackerProgram{
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		double height = (int) GetDim("Box Height");
		double width = (int) GetDim("Box Width");
		double length = (int) GetDim("Box length");
		double ballLen = (GetDim("Ball Radius")) * 2;
		double ballNum = (Math.floor(height/ballLen) * Math.floor(width/ballLen) * Math.floor(length/ballLen));
		
			
		JOptionPane.showMessageDialog(null, "The Box can hold " + (int) Math.floor(ballNum) + " Balls");
	}
	public static float GetDim(String DimName) {
		float BoxDim;
		BoxDim = Float.parseFloat(JOptionPane.showInputDialog( "What is the " + DimName));
		return BoxDim;
		}
}
