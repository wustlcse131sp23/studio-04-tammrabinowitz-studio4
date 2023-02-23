package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a FileNotFoundException
		String shape = in.next();
		int color1 = in.nextInt();
		int color2 = in.nextInt();
		int color3 = in.nextInt();
		boolean shaded = in.nextBoolean();
		double x = in.nextDouble();
		double y = in.nextDouble();
		double halfwidth = in.nextDouble();
		double halfheight = in.nextDouble();
		
		StdDraw.setPenColor (color1, color2, color3);
		if (shaded == true && shape.equalsIgnoreCase("rectangle")) {
			StdDraw.filledRectangle(x,y,halfwidth,halfheight);
		}
		else if (shaded == false && shape.equalsIgnoreCase("rectangle")) {
			StdDraw.rectangle(x,y,halfwidth,halfheight);
		}
		else if (shaded == true && shape.equalsIgnoreCase("ellipse"))
		{
			StdDraw.filledEllipse(x,y,halfwidth,halfheight);
		}
		else if (shaded == false && shape.equalsIgnoreCase("ellipse"))
		{
			StdDraw.ellipse(x,y,halfwidth,halfheight);
		}
		else if (shaded == true && shape.equalsIgnoreCase("square"))
		{
			StdDraw.filledSquare(x, y, halfheight);
		}
		else if (shaded == false && shape.equalsIgnoreCase("square"))
		{
			StdDraw.square(x, y, halfheight);
		}
		
		
		//StdDraw.setPenColor(Color.RED);
		//StdDraw.filledRectangle(.5, .5, .5, .25);
		
		//System.out.println(in.nextLine());
	}
}
