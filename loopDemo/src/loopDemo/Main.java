package loopDemo;

public class Main {
	public static void main(String[] args) {
		
		//For
		for(int i =1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println("Loop is done.");
		
		//While
		int i=1;
		while(i<10) {
			System.out.println(i);
			i+=2;
		}
		
		//Do-While
		int j=1;
		do {
			System.out.println(j);
			j+=2;
		}while(i<10);
		System.out.println("Do-While Loop is done");
	}
}
