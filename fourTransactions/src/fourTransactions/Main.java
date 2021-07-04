package fourTransactions;

public class Main {
	public static void main(String[] args) {
		fourTransaction transactions = new fourTransaction();
		
		int resultOfSum = transactions.sum(5, 7);
		int resultOfMultiply = transactions.multipy(5, 7);
		int resultOfMinus = transactions.minus(5, 7);
		float resultOfDivision = transactions.division(5, 7);
		
		System.out.println("Sum: "+resultOfSum+"\nMultipy: "+resultOfMultiply+"\nMinus: "+resultOfMinus+"\nDivision: "+resultOfDivision);
		
	}
}
