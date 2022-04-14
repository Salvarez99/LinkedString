package Project02;

/**
 * Represents a node in a linked list.
 * @author Stephen Alvarez
 * @version 1.0
 */
public class Node<E> {

	/**
	 * The element of this node
	 */
	private Object item;
	
	/**
	 * The link to the previous node
	 */
	private Node<E> prev;
	
	/**
	 * The link to the next node
	 */
	private Node<E> next;

	/**
	 * Constructs a default node.
	 */
	public Node() {
		this(null, null, null);
	} 
	
	/**
	 * Constructs a node with an item and link to a null previous and next node.
	 * @param item A reference to the item of this node
	 */
	public Node(Object item) {
		this.item = item;
		this.prev = null;
		this.next = null;
	}  
	
	/**
	 * Constructs a node with an item with a link to previous node with a link to null next node.
	 * @param item A reference to the item of this node
	 */
	public Node(Node<E> prev, Object item) {
		this.prev = prev;
		this.item = item;
		this.next = null;
    }	
	
	/**
	 * Constructs a node with an item with a link to a null previous node a link to next node.
	 * @param item A reference to the item of this node
	 */


	public Node(Object item, Node<E> next) {
		this.prev = null;
		this.item = item;
		this.next = next;
    }
	/**
	 * Constructs a node with an item and a link to next node and previous node.
	 * @param item A reference to the item of this node
	 * 		  prev A reference to the previous node 
	 * 		  next A reference to the next node
	 */
	public Node(Object item, Node<E> prev, Node<E> next){
		this.item = item;
		this.prev = prev;
		this.next = next;
	}
	
	/**
	 * Returns the item of this node.
	 * @return The item of this node
	 */
	public Object getItem(){
		return this.item;
	}
	
	/**
	 * Changes the item of this node.
	 * @param A reference to an item
	 */
	public void setItem(Object item){
		this.item = item;
	}
	
	/**
	 * Returns the previous reference of this node.
	 * @return A reference to the previous node of this node
	 */
	public Node<E> getPrev(){
		return this.prev;
	}
	
	/**
	 * Changes the next reference of this node
	 * @param next A reference to the previous node of this node
	 */
	public void setPrev(Node<E> prev){
		this.prev = prev;
	}
	
	/**
	 * Returns the next reference of this node.
	 * @return A reference to the next node of this node
	 */
	public Node<E> getNext(){
		return this.next;
	}
	
	/**
	 * Changes the next reference of this node
	 * @param next A reference to the next node of this node
	 */
	public void setNext(Node<E> next){
		this.next = next;
	}
	
	/**
	 * Returns a string representation of this node.
	 * @return A string representation of this node
	 */
	public String toString(){
		return getClass().getSimpleName() + ": " + this.item;
	}
	
	public boolean equals(Object item){
		return this.item == item;
	}
	
	
}
