package switchDemo;

public class Main {
	public static void main(String[] args) {
		char grade = 'F';
		
		switch(grade) {
		case 'A':
			System.out.println("Perfect: You have  passed.");
			break;
		
		case 'B':
			System.out.println("Very Good : You have  passed.");
			
		case 'C':
			System.out.println("Good : You've passed");
		case 'D':
			System.out.println("Not bad : You've passed.");
		case 'F':
			System.out.println("I'm sorry, you haven't  passed.");
		}
		
	}

}
