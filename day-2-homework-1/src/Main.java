
public class Main {
	public static void main(String[] args) {
		
		
		Lessons lesson1 = new Lessons("Yazılım Gelistirici Yetistirme Kampı (JAVA+REACT)", "Engin Demirdog", "ÜCRETSİZ", "",1);
		Lessons lesson2 = new Lessons("Yazılım Gelistirici Yetistirme Kampı (C#+ Angular)", "Engin Demirdog", "ÜCRETSİZ", "2 ay sürecek Yazılım Geliştirici kampımızın takip, döküman ve duyurularını ...",2);
		Lessons lesson3 = new Lessons("Programlama Giriş İçin Temel Kurs", "Engin Demirdog", "ÜCRETSİZ", "PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantığını anlaşılır...",3);
		
		Lessons[] listOfLessons = { lesson1,lesson2, lesson3};
		
		for(Lessons lesson: listOfLessons) {
			System.out.println("Title of lesson: "+lesson.title);
			System.out.println("Tough By: "+lesson.teachBy);
			System.out.println("Processing: "+lesson.processing);
			System.out.println("note : "+lesson.note);
			
		}
		
		System.out.println("------------------------------------");
		
		
		Detail detailOfLesson1 = new Detail(1,"JAVA","Eclipse","12h");
		Detail detailOfLesson2 = new Detail(2,"C#","VS","18h");
		Detail detailOfLesson3 = new Detail(3,"Python","PyCharm","12h");
		
		Detail[] detailsOfTutorial = {detailOfLesson1, detailOfLesson2, detailOfLesson3};
		for(Detail detail : detailsOfTutorial) {
			System.out.println("ID: "+detail.tutorialID);
			System.out.println("Programming Language :"+detail.ProgrammingLanguage);
			System.out.println("IDE: "+detail.RecommendedIDE);
			System.out.println("Average Of time of finising : "+detail.AverageProcessingwhicInHour);
		}
		System.out.println("------------------------------------");
		
		JoinProgramm program = new JoinProgramm();
		program.JoinTutorial(lesson1);
		program.JoinTutorial(lesson2);
		program.JoinTutorial(lesson3);
		
		
	}

}
