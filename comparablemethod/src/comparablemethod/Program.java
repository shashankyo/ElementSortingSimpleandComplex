package comparablemethod;

import java.util.ArrayList;

public class Program {
public static void main(String[] args) {
	Student s1 = new Student("Aniketh", 19, 24);
	Student s2 = new Student("Roshan", 15, 23);
	Student s3 = new Student("Reshma", 17, 26);
	ArrayList <Student> al1 = new ArrayList <Student>();
	al1.add(s1);
	al1.add(s2);
	al1.add(s3);
	System.out.println(al1);
	Collecions.sort(al1);
	System.out.println(al1);
	
}
}
