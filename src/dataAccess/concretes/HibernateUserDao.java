package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("kullanýcý hibernate ile eklendi: " + user.getName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("kullanýcý hibernate ile güncellendi: " + user.getName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("kullanýcý hibernate ile silindi: " + user.getName());
		
	}

	@Override
	public List<User> getUsers() {
		// database olmadýðý için yalan bir veri gönderir
		User user = new User(0, "Yusuf", "Daþkaya", "ydaskaya@gmail.com", "H2zvlnoc");
		User user2 = new User(0, "Engin", "Demiroð", "enginD@gmail.com", "azLc3rvb");
		User user3 = new User(0, "Kerem", "Varýþ", "keremV@gmail.com", "HlvNp153");
		List<User> list = new ArrayList<User>();
		list.add(user);
		list.add(user2);
		list.add(user3);
		return list;
	}
	
	@Override
	public User getUserByEmail(String email) {
		for (User user : getUsers()) {
			if (user.geteMail() == email) {
				return user;
			}
		}
		System.out.println("kullanýcý bulunamadý");
		return null;
	}

}
