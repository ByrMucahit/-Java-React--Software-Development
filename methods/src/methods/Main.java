package methods;

public class Main {
	public static void main(String[] args) {
		numberFİnding();
	
	}
	
	public static void numberFİnding() {
		int[] numbers = new int[] {1,2,3,4,5};
		int toBeSought = 6;
		boolean isThere = false;
		
		for(int number: numbers) {
			if(number == toBeSought) {
				isThere = true;
				break;
			}
		}
		
		if(isThere) {
			givenMessage("Number is availabel: "+toBeSought);
		}
		else {
			givenMessage("Number is not available: "+toBeSought);
		}
	}
	
	public static void givenMessage(String message) {
		System.out.println(message);
	}
}
