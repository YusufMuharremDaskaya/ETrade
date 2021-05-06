package business.abstracts;

import entities.concretes.User;

public interface UserService {
	public void add(User user);
	public void logIn(String eMail, String password);

}
