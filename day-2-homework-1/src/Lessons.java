
public class Lessons {
	
	String title;
	String teachBy;
	String processing;
	String note;
	int tutorialID;
	
	public Lessons(String title, String teachBy, String processing, String note, int tutorialID) {
		this();
		this.title = title;
		this.teachBy = teachBy;
		this.processing = processing;
		this.note = note;
		this.tutorialID = tutorialID;
	}
	public Lessons() {
		System.out.println("Tutorial list has been veiwed.");
	}
}
