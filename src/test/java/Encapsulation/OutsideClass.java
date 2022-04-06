package Encapsulation;

public class OutsideClass {

	public static void main(String[] args) {
		
		Person ecap = new Person();
		
		ecap.setName("Radwan");
		ecap.setAge(30);
		
		System.out.println("Name is: "+ecap.getName() +System.lineSeparator()+ "Age is: "+ecap.getAge());
		
	}

}
