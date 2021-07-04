package smallProjectPrimeNumber;

public class Main {
	public static void main(String[] args) {
		int number = 25;
		int remainder = number % 2;
		System.out.println(remainder);
		boolean isPrime = true;
		
		
		if(number == 1) {
			System.out.println("Number is not prime");
			return;
		}
		
		if(number <1) {
			System.out.println("Invalid number");
		}
		for(int i=2; i<number;i++) {
			if(number % i == 0) {
				isPrime = false;
			}
		}
		
		if(isPrime) {
			System.out.println("It's prime");
		}else {
			System.out.println("It's not prime");
		}
	}
}
