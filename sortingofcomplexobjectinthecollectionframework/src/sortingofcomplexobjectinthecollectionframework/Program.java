package sortingofcomplexobjectinthecollectionframework;

import java.util.ArrayList;

public class Program {
public static void main(String[] args) {
	Student s1 = new Student("Aniket", 19, 24);
	Student s2 = new Student("Roshan", 15, 23);
	Student s3 = new Student("Rashmi", 16, 22);
	ArrayList al1 = new ArrayList();
	al1.add(s1);
	al1.add(s2);
	al1.add(s3);
	System.out.println(al1);
}
}
