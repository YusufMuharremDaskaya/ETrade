package business.concretes;

import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;
import logInWithGoogleOAuth.GoogleAuth;

public class GoogleUserAdapter implements UserService {
	private GoogleAuth googleAuth = new GoogleAuth();
	private UserDao dao;
	
	public GoogleUserAdapter(UserDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public void add(User user) {
		Boolean logged = googleAuth.logIn(user.geteMail(), user.getPassword());
		if (logged) {
			dao.add(user);
		}
	}

	@Override
	public void logIn(String eMail, String password) {
		googleAuth.logIn(eMail, password);
		
	}

}
