/**
 * Selectable Interface
 * @author Onur Ertunc
 *
 */
public interface Selectable {
	
	/**
	 * a method shows whether selected or not 
	 * -- an abstract method --
	 * @return boolean selected
	 */
	public boolean getSelected();
	
	/**
	 * a method that sets whether selected or not
	 * -- an abstract method --
	 */
	public void setSelected(boolean option);
	
	
	public Shape contains(int x, int y);
	
}
