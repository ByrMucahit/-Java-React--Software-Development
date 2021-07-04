package overriding;

public class studentsCreditManager extends BaseCreditManager{
	public double calculate(double cost) {
		return cost*1.10;
		
	}
}
