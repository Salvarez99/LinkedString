package Project02;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Helper class for the driver program. 
 * @author Stephen Alvarez
 * @version 1.0
 */

public class Helper {
	public static void start() throws FileNotFoundException{
		ArrayList<LinkedString> lsAL = new ArrayList<>();
		
		System.out.println("Create()");
		create(lsAL);
		
		System.out.println("Display()\n");
		display(lsAL);
		
		System.out.println("\nCharAt()");
		testCharAt(lsAL);
		
		System.out.println("Concat()");
		testConcat(lsAL);
		
		System.out.println("IsEmpty()");
		testIsEmpty(lsAL);
		
		System.out.println("Length()");
		testLength(lsAL);
		
		System.out.println("Substring()");
		testSubstring(lsAL);
		
		
	}
	
	public static void create(ArrayList<LinkedString> list)  throws FileNotFoundException{
		Scanner input = new Scanner(new File("datalist.txt"));

		while(input.hasNextLine()){
			String str = input.nextLine();
			list.add(new LinkedString(str));
		}
	
		input.close();	
}
	
	public static void display(ArrayList<LinkedString> list){
		
		for(int i = 0; i < list.size(); i++){
			
			for (int j = 0; j < list.get(i).length(); j++) {
				
				System.out.print(list.get(i).charAt(j));
			}
			
			if (i == list.size() - 1) {
				System.out.print(".\n");
			} else
				System.out.print(", ");
		}	
	}
	
	public static void testCharAt(ArrayList<LinkedString> list){
		LinkedString character = new LinkedString('y');
		
		System.out.println(character.get(0) + "\n");
	}
	
	public static void testConcat(ArrayList<LinkedString> list){
		LinkedString concat = new LinkedString();
		concat = list.get(0).concat(list.get(7));
		
		for (int j = 0; j < concat.length(); j++) {
			
			System.out.print(concat.charAt(j));
		}

		System.out.println("\n");
	}
	
	public static void testIsEmpty(ArrayList<LinkedString> list){
		LinkedString empty = new LinkedString();
		System.out.println("LinkedString empty: " + empty.isEmpty());
		
		System.out.println("List[0] is empty: " + list.get(0).isEmpty() + "\n");
		
		
	}
	
	public static void testLength(ArrayList<LinkedString> list){
		System.out.println("List[0] length: " + list.get(0).length() + "\n");
	}
	
	public static void testSubstring(ArrayList<LinkedString> list){
		LinkedString sub = new LinkedString();
		sub = list.get(0).substring(2,6);
		

		for (int j = 0; j < sub.length(); j++) {
			
			System.out.print(sub.charAt(j));
		}

		System.out.println("\n");
	
	}
	
}
