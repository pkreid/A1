import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.BoldAction;

import java.lang.Double; 
import java.lang.Object; 
public class BallPackerProgram{
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	// Grab the dimensions from the user
		double length = GetDim("Box length");		
		double width =  GetDim("Box Width");
		double height = GetDim("Box Height");		
		double ballLen = GetDim("Ball Radius") * 2;
	// Find how many whole balls fit into each dimension, multiple to get total number of balls
		double ballNum = (Math.floor(height/ballLen) * Math.floor(width/ballLen) * Math.floor(length/ballLen));
		JOptionPane.showMessageDialog(null, "The Box can hold " + (int) Math.floor(ballNum) + " Balls");
	}
	public static double GetDim(String DimName) {
		double boxDim;
		boxDim = Double.parseDouble(JOptionPane.showInputDialog( "What is the " + DimName));
		return boxDim;
		}
}
