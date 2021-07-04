package methods2;

public class Main {
	public static void main(String[] args) {
		String message = "Weather is so beautiful today.";
		String newMessage = givenCity();
		System.out.println(newMessage);
		int number = sum(5,7);
		System.out.println(number);
		
		int sum = sum2(1,2,3,4,5);
		System.out.println(sum);
		
		
	}
	
	public static void Add() {
		System.out.println("To be Added");
	}
	public static void delete() {
		System.out.println("To be removed");
	}
	public static void update() {
		System.out.println("To be Updated");
		return;
	}
	public static int sum(int num1, int num2) {
		return num1+num2;
	}
	public static String givenCity() {
		return "Ankara";
	}
	public static int sum2(int... numbers) {
		int summary = 0;
		for(int number: numbers) {
			summary +=number;
		}
		return summary;
	}

}
