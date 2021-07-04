package arraysDemo;

public class Main {
	public static void main(String[] args) {
		String student_1 = "Engin";
		String student_2 = "Derin";
		String student_3 = "Salih";
		String student_4 = "Ahmet";
		
		System.out.println(student_1);
		System.out.println(student_2);
		System.out.println(student_3);
		System.out.println(student_4);
		
		System.out.println(student_1);
		System.out.println(student_2);
		System.out.println(student_3);
		
		System.out.println("--------------------");
		
		String[] students = new String[4];
		students[0] = "Engin";
		students[1] = "Derin";
		students[2] = "Salih";
		students[3] = "Ahmet";
		
		for(int i =0; i<students.length;i++) {
			System.out.println(students[i]);
		}
		for(String std: students) {
			System.out.println(std);
		}
		
	
	}
}
