package collectionsort;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

public class Program {
public static void main(String[] args) {
//	ArrayList al = new ArrayList();
//	al.add(30);
//	al.add(40);
//	al.add(20);
//	al.add(10);
//	al.add(50);
//	System.out.println(al);
//	Collections.sort(al);
//	System.out.println(al);
	
	ArrayDeque ad = new ArrayDeque();
	ad.add(30);
	ad.add(40);
	ad.add(20);
	ad.add(10);
	ad.add(50);
	System.out.println(ad);
//	Collections.sort(ad); error
	
	ArrayList al1 = new ArrayList();
	al1.addAll(ad);
	Collections.sort(al1);
	ad.clear();
	ad.addAll(al1);
	System.out.println(ad);
}
}
