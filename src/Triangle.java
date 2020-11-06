/**
 * Lab03 Triangle class
 * @author Onur Ertunc
 *
 */
public class Triangle extends Shape implements Locatable {
	
	// Variables
	private int a;
	private int b;
	private int c;
	private boolean selected;
	
	/**
	 * Constructor of the Triangle class
	 * @param a
	 * @param b
	 * @param c
	 * @param x
	 * @param y
	 */
	public Triangle( int a, int b, int c, int x, int y ) {
		this.a = a;
		this.b = b;
		this.c = c;
		setLocation(x, y);
	}
	
	/**
	 * the method calculates the area of the shape
	 * @return double area
	 */
	public double getArea() {
		double s = ( this.a + this.b + this.c ) / 2;
		double area = Math.sqrt( s * (s-this.a) * (s-this.b) * (s-this.c) );
		return area;
	}
	
	/**
	 * the method calculates the perimeter of the shape
	 * @return double perimeter
	 */
	public double getPerimeter() {
		return a + b + c;
	}

	@Override
	public boolean getSelected() {
		return selected;
	}

	@Override
	public void setSelected(boolean option) {
		selected = option;
	}

	@Override
	public Shape contains(int x, int y) {
		double area = getArea();
		double radius = (a * b * c) / (4 * area);
		if ( x <= this.getX() + radius && x >= this.getX() - radius && y <= this.getY() + radius && y >= this.getY() - radius ) {
			return this;
		}
		return null;
	}
	
	
}
