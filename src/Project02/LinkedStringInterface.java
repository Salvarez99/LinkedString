package Project02;

/**
 * Specifications on the design of operations of an doubly linked list. 
 * @author Stephen Alvarez
 * @version 1.0 
 */
public interface LinkedStringInterface {

	/**
	 * Return the char value at the specified index.
	 * @param index
	 * @return
	 */
	public char charAt(int index);
	
	/**
	 * Concatenate a specified linked string to the end of this linked string
	 * @param stringB
	 * @return
	 */
	public LinkedString concat(LinkedString stringB);
	
	/**
	  * Determines whether a list is empty. 
	  * @return A boolean value specifying if this list is empty or not
	  */
	public Boolean isEmpty();
	
	/**
	  * Returns the length of a list. 
	  * @return An integer specifying the length of a list
	  */
	public int length();
	
	/**
	  * Returns a substring from LinkedString starting at 1st passed position and ending at 2nd passed position
	  * @return A new LinkedString consisting of characters from original LinkedString
	  */
	public LinkedString substring(int pos1,int pos2);
	
	/**
	 * Gets item at given index
	 * @param index A reference to a position in the list
	 * @return Object at given index
	 */
	public Object get(int index);
}