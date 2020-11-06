/**
 * Lab03 Shape class
 * @author Onur Ertunc
 *
 */
abstract public class Shape implements Locatable, Selectable{
	
	// Variables
	int x = 0;
	int y = 0;
	
	/**
	 * getArea method that calculates the area of shapes
	 * -- this is an abstract method --
	 * @return double area
	 */
	public abstract double getArea();
	
	/**
	 * getPerimeter method that calculates the perimeter of 
	 * shapes -- this is an abstract method --
	 * @return double perimeter
	 */
	public abstract double getPerimeter();
	
	/**
	 * a method that returns the x value
	 * @return x
	 */
	public int getX() {
		return this.x;
	}
	
	/**
	 * a method that returns the y value
	 * @return y
	 */
	public int getY() {
		return this.y;
	}
	
	/**
	 * setLocation method that overrides the setLocation method implemented 
	 * in Locatable interface.
	 * @param int x, int y
	 */
	public void setLocation( int x, int y ) {
		this.x = x;
		this.y = y;
	}		
}
