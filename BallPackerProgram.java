import javax.swing.JOptionPane;
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
	// this line tests that all of the boxes dimensions are greater than the balls radius
		if ((BallRad * 2) >  (float) height || (BallRad * 2) > (float) length  || (BallRad *2 > (float) width)) {
			JOptionPane.showMessageDialog(null, "The box cannot hold any balls");
			System.exit(0);
		}
		
		
		int BoxVol = (height * width * length); 
	
		double BallVol = Math.pow((BallRad * 2), 3.0);
		int BallNum;
		BallNum = (int) Math.floor(BoxVol/BallVol);
		JOptionPane.showMessageDialog(null, "The Box can hold " + BallNum + " Balls");
		
		}
	
	public static float GetDim(String DimName) {
		float BoxDim;
		BoxDim = Float.parseFloat(JOptionPane.showInputDialog( "What is the " + DimName));
		return BoxDim;
		}
}