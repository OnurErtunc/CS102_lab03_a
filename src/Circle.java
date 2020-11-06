/**
 * Lab03 Circle class
 * @author Onur Ertunc
 *
 */
public class Circle extends Shape implements Locatable, Selectable{
	
	// Variables
	private int radius;
	private boolean selected;
	
	/**
	 * Constructor of the Circle class
	 * @param radius
	 * @param x
	 * @param y
	 */
	public Circle( int radius, int x, int y ) {
		this.radius = radius;
		setLocation(x, y);
	}
	
	/**
	 * the method calculates the area of the shape
	 * @return area
	 */
	public double getArea() {
		double area = Math.PI * radius* radius;
		return area;
	}
	
	/**
	 * the method calculates the perimeter of the shape
	 * @return double perimeter
	 */
	public double getPerimeter() {
		double perimeter = 2 * Math.PI * radius;
		return perimeter;
	}

	/**
	 * method returns whether selected or not
	 * @return boolean selected
	 */
	public boolean getSelected() {
		return selected;
	}

	/**
	 * method sets the param option to selected
	 * @param option
	 */
	public void setSelected(boolean option) {
		selected = option;
	}

	/**
	 * method that checks the coordinates whether they are inside of the shape or not
	 * @param x
	 * @param y
	 * @return Shape object
	 */
	public Shape contains(int x, int y) {
		if ( Math.pow(super.getX()-x,2) + Math.pow(super.getY()-y,2) <= Math.pow(radius, 2) ) {
			return this;
		}
		return null;
	}
	
	/**
	 * toString returns the info about the shape 
	 * @return str
	 */
	public String toString() {
		String str = "";
		str = "Circle, Radius: " + this.radius + " Perimeter: " + getPerimeter() + " Area: " + getArea() + " Is selected: " + getSelected() + "\t";
		return str;
	}
}
