
public class Detail {
	
	String ProgrammingLanguage;
	String RecommendedIDE;
	String AverageProcessingwhicInHour;
	int tutorialID;
	
	
	public  Detail(int tutorialID,String ProgrammingLanguage, String RecommendedIDE, String AverageProcessingwhicInHour) {
		this.ProgrammingLanguage = ProgrammingLanguage;
		this.RecommendedIDE = RecommendedIDE;
		this.AverageProcessingwhicInHour = AverageProcessingwhicInHour;
		this.tutorialID = tutorialID;
	}
}
