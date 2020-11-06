/**
 * Lab03 Rectangle class
 * @author Onur Ertunc
 *
 */
public class Rectangle extends Shape implements Locatable, Selectable{
	
	// Variables
	private int sides;
	private int width;
	private int height;
	private boolean selected;
	
	/**
	 * Constructor of the Rectangle class
	 * @param height
	 * @param width
	 * @param x
	 * @param y
	 */
	public Rectangle( int height, int width, int x, int y ) {
		this.height = height;
		this.width = width;
		sides = 4;
		setLocation(x, y);
	}
	
	/**
	 * getter for height
	 * @return height
	 */
	public int getHeight() {
		return this.height;
	}
	
	/**
	 * getter for width
	 * @return
	 */
	public int getWidth() {
		return this.width;
	}
	
	/**
	 * the method returns the area of the shape
	 * @return double area
	 */
	public double getArea() {
		double area = this.height * this.width;
		return area;
	}
	
	/**
	 * the method returns the perimeter of the shape
	 * @return double perimeter
	 */
	public double getPerimeter() {
		return ( this.height + this.width ) * 2;
	}
	
	/**
	 * a method that returns the selected info
	 * @return boolean selected
	 */
	public boolean getSelected() {
		return this.selected;
	}
	
	/**
	 * method that sets the choice to selected
	 * @param choice
	 */
	public void setSelected(boolean choice) {
		selected = choice;
	}
	
	/**
	 * the method returns the shapes whether the given coordinates contained by it
	 * @param x
	 * @param y
	 * @return Shape object
	 */
	public Shape contains(int x, int y) {
		if ( x >= this.getX() - width / 2 && x <= this.getX() + width / 2 && y >= this.getY() - height / 2 && y <= this.getY() + height / 2 ) {
			return this;
		}
		return null;
	}
	
	/**
	 * this method was written to prevent confusion in toString method 
	 * @return info
	 */
	public String toString() {
		String str = "";
		str = "Rectangle, Sides: " + this.sides + " Width: " + getWidth() + " Height: " + getHeight() + " Is selected: " + getSelected() + "\t";
		return str;
	}
	
}
