package findNumber;

public class Main {
	public static void main(String[] args) {
		int[] numbers = new int[] {1,2,5,7,9,0};
		int itwillbefound = 5;
		boolean IsIt= false;
		
		for (int number : numbers) {
			if(number == itwillbefound) {
				IsIt=true;
				break;
			}
		}
		if(IsIt) {
			System.out.println("there is a this number");
		}
		
	}
}
