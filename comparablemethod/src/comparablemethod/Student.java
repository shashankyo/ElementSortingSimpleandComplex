package comparablemethod;

public class Student implements Comparable{
	String name;
	int id;
	int age;
	public Student(String name, int id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + "]";
	}
	
	public int compareTo(Object y)
	{
		if(this.id > ((Student)(y)).id)
		{
			return 1;
		}
		else {
			return -1;
		}
	}
}
