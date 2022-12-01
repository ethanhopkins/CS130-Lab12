package Lab12;

import java.util.ArrayList;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
			names.add("Olivia");
			names.add("Emma");
			names.add("Ava");
			names.add("Charlotte");
			names.add("Sophia");
			
		ArrayList<String> names2 = new ArrayList<String>();
			names2.add("Noah");
			names2.add("Liam");
			names2.add("William");
			names2.add("Mason");
			names2.add("James");
			
		names.addAll(names2);
		names.set(4, "Sophie");
		names.add(2, "Anne");
		System.out.println(names.contains("Liam"));
		System.out.println(names.contains("Sam") + "\n");
		names.remove(1);
		names.size();
		
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.indexOf(names.get(i)) + ". " + names.get(i));
		}
	}

}
