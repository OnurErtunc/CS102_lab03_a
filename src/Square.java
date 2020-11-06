/**
 * Lab03 Square Class
 * @author Onur Ertunc
 *
 */
public class Square extends Rectangle implements Locatable {
	
	// Variables
	private int side;
	
	/**
	 * Constructor of the Square class
	 * @param side
	 * @param x
	 * @param y
	 */
	public Square( int side, int x, int y ) {
		super( side, side, x, y);
		this.side = side;
	}
	
	/**
	 * the method calculates the area of the shape
	 * @return double area
	 */
	public double getArea() {
		return super.getArea();
	}
	
	/**
	 * the method that calculates the perimeter of the shape
	 * @return double perimeter
	 */
	public double getPerimeter() {
		return super.getPerimeter();
	}
	
	/**
	 * getter to reach the side
	 * @return side
	 */
	public int getSide() {
		return side;
	}
	
	/**
	 * toString method returns the info about the shape
	 * @return str
	 */
	public String toString() {
		String str = "";
		str = "Square, Sides: " + getSide() + " Is selected: " + getSelected() + "\t";
		return str;
	}
}
