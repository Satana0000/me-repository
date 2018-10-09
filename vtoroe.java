package decart;

import java.awt.Point;

public class vtoroe {
	public static void main(String[] args) {
		Point p1 = new Point (4,7); 
		Point p2 = new Point (8,6);
		double t =Math.sqrt(Math.pow((p2.getX() - p1.getX()), 2) + Math.pow((p2.getY() - p1.getY()), 2));
		System.out.print(t);

	}
}
