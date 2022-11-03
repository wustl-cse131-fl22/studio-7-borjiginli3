package studio7;

import edu.princeton.cs.introcs.StdDraw;


public class Rectangle {
		
		private double length;
		private double width;
	
		public double area(double length, double width) {
			return length*width;
		}
		public boolean isSquare(double length, double width) {
			if(width==length) {
				return true;
			}else {
				return false;
			}
		}
		public double perimeter(double length, double width) {
			return length*2+width*2;
		}
		public void draw(double length, double width) {
			StdDraw.setPenColor(255,255,255);
			StdDraw.rectangle(width, length, 0.5, 0.5);
		}

public static void main(String[] args) {
	
	Rectangle rectOne = new Rectangle();
	rectOne.draw(0.5, 0.5);
}
}
