package business.concretes;

import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserManager implements UserService {
	UserDao userDao;
	
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		Pattern pattern = Pattern.compile("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9]))\\.){3}(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9])|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])");
		Matcher matcher = pattern.matcher(user.geteMail());
		if(user.getPassword().length() >= 6) {
			
		}else {
			System.out.println("Þifre en az altý karakterden oluþalýdýr");
			return;
		}
		
		if(user.getName().length() >= 2 && user.getLastName().length() > 2) {
			
		}else{
			System.out.println("Ýsim ve soyisim en az 2 karakterden oluþmalýdýr");
			return;
		}
		if (matcher.find()) {
			
		}else {
			System.out.println("");
		}
		for (User element : userDao.getUsers()) {
			if (element.geteMail() == user.geteMail()) {
				System.out.println("Bu email adresi daha önce kullanýlmýþ");
				return;
			}
		}
		
		
		
		userDao.add(user);
		
	}

	@Override
	public void logIn(String email, String password) {
		User user = userDao.getUserByEmail(email);
		if (user.getPassword() == password) {
			System.out.println("Giriþ yapýldý");
		} else {
			System.out.println("Giriþ baþarýsýz : lütfen emailinizi ve þifrenizi kontrol ediniz");
		}
	}
}
