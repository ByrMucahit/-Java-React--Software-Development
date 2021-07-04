package recapDemo1;

public class Main {
	public static void main(String[] args) {
		int number_1 = 266;
		int number_2 = 25;
		int number_3 = 26;
		int greatestNumber = number_1;
		
		if(greatestNumber < number_2) {
			greatestNumber = number_2;
		}
		
		if(greatestNumber < number_3) {
			greatestNumber = number_3;
		}
		
		System.out.println("The greates number : "+greatestNumber);
	}

}
