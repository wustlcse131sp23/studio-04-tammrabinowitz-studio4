package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(25,25,0);
		StdDraw.setPenRadius(.01);
		StdDraw.line(.6, .85, .3, .25);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.rectangle(.5, .5, .5, .5);
		StdDraw.setPenColor(50,150,50);
		StdDraw.filledEllipse(.5, .5, .175, .25);
		StdDraw.setPenColor(200,0,50);
		StdDraw.filledCircle(.5,.6, .1);
		
	}
}