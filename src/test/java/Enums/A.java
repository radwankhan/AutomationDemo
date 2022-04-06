package Enums;

public class A {
	enum Week {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}

	public static void main(String[] args) {
		
		enums();
		enumToArray();
		switchCase();
	}
	public static void enums() {
		Week d = Week.TUESDAY;
		System.out.println(d.ordinal()); // to get the index number

		if (d == Week.TUESDAY) {
			System.out.println("Today is Tuesday");

		}
		System.out.println(System.lineSeparator());
	}
	public static void enumToArray() {
		Week allday[] = Week.values();
		for (Week day : allday) {
			
			System.out.print(day+" ");
			
		}
		System.out.println(System.lineSeparator());
	}
	public static void switchCase() {
		Week d = Week.SATURDAY;
		switch(d) {
		case MONDAY:
			System.out.println("Today is Monday");
			break;
		case TUESDAY:
			System.out.println("Today is Tuesday");
			break;
		case SATURDAY:
			System.out.println("Today is Saturaday");
			break;
		default:
			System.out.println("Nothing");
			
		}
	}
}
