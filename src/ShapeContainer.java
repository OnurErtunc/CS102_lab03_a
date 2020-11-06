import java.util.ArrayList;
/**
 * Lab03 The ShapeContainer class
 * @author Onur Ertunc
 *
 */
public class ShapeContainer {
	
	// Variables
	private ArrayList<Shape> shapeHolder;
	
	/**
	 * Constructor of the ShapeContainer class
	 */
	public ShapeContainer() {
		shapeHolder = new ArrayList<Shape>();
	}
	
	/**
	 * the method adds an Shape class object to the collection 
	 * @param s
	 */
	public void add( Shape s ) {
		shapeHolder.add(s);
	}
	
	/**
	 * the method that calculates the total area of the shapes in the collection
	 * @return double total area
	 */
	public double getArea() {
		double totalArea = 0;
		for ( int i = 0; i < shapeHolder.size(); i++ ) {
			totalArea = totalArea + (shapeHolder.get(i)).getArea();
		}
		return totalArea;
	}
	
	/**
	 * the method that calculates the total perimeter of the shapes in the colleciton
	 * @return double perimeterOfAllShapes
	 */
	public double getPerimeter() {
		double perimeterOfAllShapes = 0;
		
		for ( int i = 0; i < shapeHolder.size(); i++ ) {
			perimeterOfAllShapes = perimeterOfAllShapes + (shapeHolder.get(i)).getPerimeter() ;
		}
		
		return perimeterOfAllShapes;
	}
	
	/**
	 * the toString method of the ShapeContainer class
	 * @return String info
	 */
	public String toString() {
		String info = "";
		
		for ( int i = 0; i < shapeHolder.size(); i++ ) {
			info = info + (shapeHolder.get(i)).toString();
		}
		return info;
	}
	
	/**
	 * the method that removes the not wanted Shapes
	 */
	public void remove() {
		for ( int i = 0; i < shapeHolder.size(); i++ ) {
			if ( ((Selectable)shapeHolder.get(i)).getSelected() == true ) {
				shapeHolder.remove(i);
			}
		}
	}
	
	/**
	 * finds the first shape
	 * @param x
	 * @param y
	 */
	public void getFirstShape(int x, int y) {
        int d = 0;
        
        if( shapeHolder.size() > 0 ){
              while ( d < shapeHolder.size() && (((Selectable)shapeHolder.get(d)).contains(x,y))==null ){
                    d++;
              }
              
              if( d < shapeHolder.size() && shapeHolder.get(d)!= null && ((Selectable)shapeHolder.get(d)).contains(x,y) != null ){
                    System.out.println(shapeHolder.get(d).toString());
                    ((Selectable)shapeHolder.get(d)).setSelected(true);
                    System.out.println( "Making it selected: " );
                    System.out.println(shapeHolder.get(d).toString());
              }
              else
                    System.out.println(" There are no shapes that contain this (x,y) ");
        }
        else
        System.out.println(" There are no shapes in container ");
	}
}
