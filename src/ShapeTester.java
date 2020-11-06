import java.util.*;
/**
 * Lab03 ShapeTester Class
 * @author Onur Ertunc
 *
 */
public class ShapeTester {
	
	public static void mainMenu() {
		
		System.out.println( " ************************************* " );
		System.out.println( " 1- Create an empty set of shapes" );
		System.out.println( " 2- Add Shape " );
		System.out.println( " 3- Compute and show total area " );
		System.out.println( " 4- Find the shape that contains given x, y " );
		System.out.println( " 5- Remove all selected shapes from the set ");
		System.out.println( " 6- Print the collection " );
		System.out.println( " 7- Quit " );
		System.out.println( " ************************************* " );
	}
	
	public static void shapeMenu() {
		System.out.println( " ************************************* " );
		System.out.println( " 1- Create and add a Rectangle " );
		System.out.println( " 2- Create and add a Square " );
		System.out.println( " 3- Create and add a Triangle " );
		System.out.println( " 4- Create and add a Circle " );
		System.out.println( " 5- Return to main menu " );
		System.out.println( " ************************************* " );
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner( System.in );
		Scanner innerScan = new Scanner( System.in );
		
		// Variables
		ShapeContainer set = null;
		int menuInput1;
		int menuInput2;
		
		// Program Code
		do {
			mainMenu();
			
			System.out.println( "Make a selection: ");
			menuInput1 = scan.nextInt();
			
			if ( menuInput1 == 1 ) {
				set = new ShapeContainer();
			}
			
			else if ( menuInput1 == 2 ) {
				
				do {
					shapeMenu();
					System.out.println( "Make a selection: " );
					menuInput2 = scan.nextInt();
					
					if ( menuInput2 == 1 ) {
						System.out.print( "Enter the height and width of the Rectangle respectively: " );
						int height = innerScan.nextInt();
						int width = innerScan.nextInt();
						System.out.print( "Enter the x and y-coordinates: ");
						int x = innerScan.nextInt();
						int y = innerScan.nextInt();
						
						Rectangle rec = new Rectangle( height, width, x, y );
						set.add(rec);
					}
					
					else if ( menuInput2 == 2 ) {
						System.out.print( "Enter the side length of the square: " );
						int side = innerScan.nextInt();
						System.out.print( "Enter the x and y-coordinates: ");
						int x = innerScan.nextInt();
						int y = innerScan.nextInt();
						
						Square sqr = new Square( side, x, y );
						set.add(sqr);
					}
					
					else if ( menuInput2 == 3 ) {
						System.out.print( "Enter the side lengths of the triangle: " );
						int a = innerScan.nextInt();
						int b = innerScan.nextInt();
						int c = innerScan.nextInt();
						System.out.print( "Enter the x and y-coordinates: ");
						int x = innerScan.nextInt();
						int y = innerScan.nextInt();
						
						Triangle tri = new Triangle( a, b, c, x, y );
						set.add(tri);
					}
					
					else if ( menuInput2 == 4 ) {
						System.out.print( "Enter the radius of the circle: " );
						int radius = innerScan.nextInt();
						System.out.print( "Enter the x and y-coordinates: ");
						int x = innerScan.nextInt();
						int y = innerScan.nextInt();
						
						Circle cir = new Circle( radius, x, y);
						set.add(cir);
					}
				} while ( menuInput2 != 5 );				
			}
			
			else if ( menuInput1 == 3 ) {
				System.out.println( "Total Area: " + set.getArea() );
			}
			
			else if ( menuInput1 == 4 ) {
				System.out.print( "Enter the x and y-coordinates: ");
				int x = innerScan.nextInt();
				int y = innerScan.nextInt();
				set.getFirstShape(x, y);
			}
			
			else if ( menuInput1 == 5 ) {
				set.remove();
			}
			
			else if ( menuInput1 == 6 ) {
				System.out.println(set.toString());
			}
			
		} while( menuInput1 != 7 );
		
		System.out.println( "Goodbye... " );
		scan.close();
		innerScan.close();
	}
}
