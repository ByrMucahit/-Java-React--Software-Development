package abstractclasses;

public class Main {
	public static void main(String[] args) {
		WomanGameCalculater womanGameCalculator = new WomanGameCalculater();
		womanGameCalculator.calculate();
		womanGameCalculator.gameOver();
		
		GameCalculater gameCalculator = new WomanGameCalculater();
		
	}
}
