import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.BoldAction;

import java.lang.Double; 
import java.lang.Object; 
public class BallPackerProgram{
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		int height = (int) GetDim("Box Height");
		int width = (int) GetDim("Box Width");
		int length = (int) GetDim("Box length");
		float BallRad = GetDim("Ball Radius");
		double ballVol = (BallRad * 2);
		int ballCount =0;
		while(height >= ballVol && length >= ballVol && width >= ballVol) {
			height -= ballVol;
			length -= ballVol;
			width -= ballVol;
			ballCount += 1;
			
		}
		
		
		
		
		
		JOptionPane.showMessageDialog(null, "The Box can hold " + ballCount + " Balls");
		
		}
	
	public static float GetDim(String DimName) {
		float BoxDim;
		BoxDim = Float.parseFloat(JOptionPane.showInputDialog( "What is the " + DimName));
		return BoxDim;
		}
}