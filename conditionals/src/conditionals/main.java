package conditionals;

public class main {

	public static void main(String[] args) {
		int number = 21;
		if(number < 20) {
			System.out.println("Number is smaller than 20");
		}
		
		if(number<15) {
			System.out.println("Number is smaller than 15");
		}else if(number == 20) {
			System.out.println("Number is equal 20");
		}else {
			System.out.println("Number is greater than both numbers");
		}
	}
}
