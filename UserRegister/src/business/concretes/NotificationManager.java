package business.concretes;

import business.abstracts.NotificationService;

public class NotificationManager implements NotificationService {

	@Override
	public void goodNews(String message) {
		// TODO Auto-generated method stub
		System.out.println("Well done, don't faced accident, "+message);
	}

	@Override
	public void badNews(String message) {
		// TODO Auto-generated method stub
		System.out.println("We faced error : "+ message);
		
	}

}
