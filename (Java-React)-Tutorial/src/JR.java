
public class JR {
	public static void main(String[] args) {
		
		// camelCase
		// First rule in Software is closing that you opened.
		//Don't repeat yourself.
		String networkBranchButton = "Network Branch";
		double dollarPrev = 8.20;
		double dollarCurrent = 8.20;
		int maturity = 36;
		boolean didDollarDown = false;
		
		System.out.println(networkBranchButton);
		
		System.out.println("Hello World !!!");
		
		if(dollarCurrent < dollarPrev) {
			
			System.out.println("It is fell.");
		}else if(dollarCurrent > dollarPrev){
			System.out.println("Dollar is rose.");
		}
		else {
			System.out.println("Dollar is the same with previous.");
		}
		
		// Array
		String credit_1 = "Fast Credit";
		String credit_2 = "Happiness retired credit";
		String credit_3 = "Housing credit";
		String credit_4 = "Farmer credit";
		String credit_5 = "Msb credit";
		String credit_6 = "Meb credit";
		
		System.out.println(credit_1);
		System.out.println(credit_2);
		System.out.println(credit_3);
		System.out.println(credit_4);
		System.out.println(credit_5);
		System.out.println(credit_6);
		
		String[] credits = 
			{
					"Fast Credit",
					"HAppiness retired credit",
					"Housing credit",
					"Farmer Credit",
					"MSb Credit",
					"Meb credit"
					}; 
		
		// Looping
		// foreach
		for(String credit: credits) {
			
			System.out.println(credit);
		}
		
		for(int i = 0; i < credits.length ; i++) {
			System.out.println(credits[i]);
		}
		int number_1 = 10;
		int number_2 = 20;
		number_1 = number_2;
		number_2 = 100;
		System.out.println(number_1);
		
		int[] numbers_1 = {1,2,3,4,5};
		int[] numbers_2 = {10,20,30,40,50};
		numbers_1 = numbers_2;
		System.out.println(numbers_1[0]);
		
		String city_1 = "Ankara";
		String city_2 = "İstanbul";
		city_1 = city_2 ;
		city_2 = "İzmir";
		System.out.println(city_1);
	}
}
