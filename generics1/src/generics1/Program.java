package generics1;

import java.util.ArrayList;
import java.util.Collections;

public class Program {
public static void main(String[] args) {
	ArrayList<String> al = new ArrayList <String>();
	al.add(30);
	al.add(40);
	al.add("kodnest");
	al.add(10);
	al.add(true);
	Collections.sort(al);
	System.out.println(al);
	System.out.println("------------");
}
}
