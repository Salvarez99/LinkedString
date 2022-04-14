package Project02;
/**
 * Implementations of operations a doubly linked list.
 * @author Stephen Alvarez
 * @version 1.0
 */

public class LinkedString {

	private Node<Character> head;
	private Node<Character> current;
	private int count; 
	
	public LinkedString()
	{	
		this.head = null;
		this.current = null;
		this.count = 0;
	}
	
	public LinkedString(String str){
		for (int i = 0; i < str.length(); i++) {
			
			if(head == null){
				//if list is empty
				
				Node<Character> newNode = new Node<Character>(str.charAt(i));
				head = newNode;
				current = head;
				count++;
				
			}else if(head != null && head.getNext() == null){
				//if list has one item
				
				//create newNode, set newNode's prev to head, set item to passed item
				//set head's next node equal to newNode
				//set current equal to newNode
				//increment count by 1
				Node<Character> newNode = new Node<Character>(head, str.charAt(i));
				head.setNext(newNode);
				current = newNode;
				count++;
				
			}else{
				//if list has more than one item
				
				//create newNode, set newNode's prev to current, set item to passed item
				//set current's next equal to newNode
				//set current equal to newNode
				//increment count by 1
				Node<Character> newNode = new Node<Character>(current, str.charAt(i));
				current.setNext(newNode);
				current = newNode;
				count++;
			}
			
			
		}
	}
	
	public LinkedString(char c){
		if(head == null){
			//if list is empty
			
			Node<Character> newNode = new Node<Character>(c);
			head = newNode;
			current = head;
			count++;
			
		}else if(head != null && head.getNext() == null){
			//if list has one item
			
			//create newNode, set newNode's prev to head, set item to passed item
			//set head's next node equal to newNode
			//set current equal to newNode
			//increment count by 1
			Node<Character> newNode = new Node<Character>(head,c);
			head.setNext(newNode);
			current = newNode;
			count++;
			
		}else{
			//if list has more than one item
			
			//create newNode, set newNode's prev to current, set item to passed item
			//set current's next equal to newNode
			//set current equal to newNode
			//increment count by 1
			Node<Character> newNode = new Node<Character>(current, c);
			current.setNext(newNode);
			current = newNode;
			count++;
		}
	}

	public char charAt(int index) throws ListIndexOutOfBoundsException , ListException{
		if (this.isEmpty() == true) {
			throw new ListException("This LinkedString is empty.");
		} else if (index < 0 || index > this.length()) {
			throw new ListIndexOutOfBoundsException("The index value must be between 0 and " + (this.length()));
		}
		
		
		current = head;
		int pos = 0;
		
		while(pos != index)
		{
			current = current.getNext();
			pos++;
		}
		return (char) current.getItem();
	}
	
	public LinkedString concat(LinkedString stringB){
		LinkedString concat = new LinkedString();
		int i = 0;
		while(i != this.length()){
			concat.add(this.get(i));
			i++;
		}
			
		i = 0;
		
		while(i != stringB.length()){
			concat.add(stringB.get(i));
			i++;
		}
			
		
		return concat;
	}
	
	public Boolean isEmpty(){
		return this.count == 0;
	}
	
	public int length(){
		return this.count;
	}
	
	public LinkedString substring(int pos1,int pos2)throws ListIndexOutOfBoundsException{
		
		if (pos1 < 0 || pos1 > this.length()) {
			throw new ListIndexOutOfBoundsException( "Position 1: " + pos1 + " must be between 0 and " + (this.length()));
		} else if(pos2 < 0 || pos2 > this.length()){
			throw new ListIndexOutOfBoundsException( "Position 2: " + pos2 + " must be between 0 and " + (this.length()));
		}
		
		LinkedString subStr = new LinkedString();
		
		if (pos2 < pos1) { //if pos1 is greater than pos2 print backwards
			for (int i = pos1; i != pos2; i--){
				subStr.add(this.charAt(i));
			}
		} else { //if pos1 is less than pos2 print forwards
			for (int i = pos1; i != pos2 ; i++) {
				subStr.add(this.charAt(i));
			}
		}
		
		return subStr;
	}
		
	public void add(Object item){
		
		if(head == null){
			//if list is empty
			
			Node<Character> newNode = new Node<Character>(item);
			head = newNode;
			current = head;
			count++;
			
		}else if(head != null && head.getNext() == null){
			//if list has one item
			
			//create newNode, set newNode's prev to head, set item to passed item
			//set head's next node equal to newNode
			//set current equal to newNode
			//increment count by 1
			Node<Character> newNode = new Node<Character>(head, item);
			head.setNext(newNode);
			current = newNode;
			count++;
			
		}else{
			//if list has more than one item
			
			//create newNode, set newNode's prev to current, set item to passed item
			//set current's next equal to newNode
			//set current equal to newNode
			//increment count by 1
			Node<Character> newNode = new Node<Character>(current, item);
			current.setNext(newNode);
			current = newNode;
			count++;
		}
	}
	
	public Object get(int index) throws ListIndexOutOfBoundsException , ListException{
		
		if (this.isEmpty() == true) {
			throw new ListException("This LinkedString is empty.");
		} else if (index < 0 || index > this.length() - 1) {
			throw new ListIndexOutOfBoundsException("The index value must be between 0 and " + (this.length() - 1));
		}else{
			int i = 0;
			current = head;
			
			if (index == 0)
				return current.getItem();
			
			while (i != index) {
					current = current.getNext();
					i++;
			}
			
			return current.getItem();
		}
		
		
	}

}