import java.util.*;
public class list5 {
	public static void main(String[] args) {
		LinkedList<String> arr = new LinkedList<String>();
		arr.add("January");
		arr.add("Febuary");
		arr.add("March");
		arr.add("April");
		arr.add("May");
		arr.add("June");
		arr.add("July");
		arr.add("August");
		arr.add("September");
		arr.add("October");
		arr.add("November");
		arr.add("December");
		
		Iterator<String> it = arr.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
		