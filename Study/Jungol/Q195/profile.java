package Q195;

public class profile {
	
	 public String name,add,number;
	 
	public profile(String name,String number,String add) {
	
		this.name = name;
		this.number = number;
		this.add = add;
	}
	 
	void objprint() {
		System.out.println("name : "+name);
		System.out.println("tel : "+number);
		System.out.println("address : " + add);
	}
	
}
