package overriding;

public class Main {
	public static void main(String[] args) {
		//TeacherCreditManager teacherCreditManager = new TeacherCreditManager();
		//System.out.println(teacherCreditManager.calculate(10000));
		
		BaseCreditManager[] creditManagers = new BaseCreditManager[] {new TeacherCreditManager(), new AgriculturalCreditManager(), new studentsCreditManager()};
		for(BaseCreditManager creditManager: creditManagers) {
			System.out.println(creditManager.calculate(1000));
		}
		
	}

}
