package Q617;

public class Person {
	private String name;
	private int height;
	
	//set method
	public Person(String name, int height) {
		this.name = name;
		this.height = height;
	}
	
	
	//get method
	public void print() {
		System.out.println(name+" "+height);

	}
	public int getHeight() {
		return height;
	}
	
}
