package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao {
	List<User> users = new ArrayList<User>();
	
	@Override
	public void add(User user) {
		System.out.println("kullan�c� hibernate ile eklendi: " + user.getName());
		users.add(user);
	}

	@Override
	public void update(User user) {
		System.out.println("kullan�c� hibernate ile g�ncellendi: " + user.getName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("kullan�c� hibernate ile silindi: " + user.getName());
		
	}

	@Override
	public List<User> getUsers() {
		// database olmad��� i�in yalan bir veri g�nderir
		User user = new User(0, "Yusuf", "Da�kaya", "ydaskaya@gmail.com", "H2zvlnoc");
		User user2 = new User(0, "Engin", "Demiro�", "enginD@gmail.com", "azLc3rvb");
		User user3 = new User(0, "Kerem", "Var��", "keremV@gmail.com", "HlvNp153");
		users.add(user);
		users.add(user2);
		users.add(user3);
		return users;
	}
	
	@Override
	public User getUserByEmail(String email) {
		for (User user : getUsers()) {
			if (user.geteMail() == email) {
				return user;
			}
		}
		System.out.println("kullan�c� bulunamad�");
		return null;
	}

}
