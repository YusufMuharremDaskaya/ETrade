package core;

import entities.concretes.User;

public class EMailSender {
	public void sendEmail(){
		System.out.println("e-mail g�nderildi");
	}
	
	public void verifyUser(User user) {
		user.setIsCheked(true);
	}
}
