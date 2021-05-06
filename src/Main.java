import business.abstracts.UserService;
import business.concretes.GoogleUserAdapter;
import business.concretes.UserManager;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

//Sahte databesedeki google kullan�c�lar� 
//user1.email = "google1@gmail.com";
//user2.email = "google2@gmail.com";
//user3.email = "google3@gmail.com";
//user1.password = "123456";
//user2.password = "123456";
//user3.password = "123456";
//user1.name = "user1";
//user2.name = "user2";
//user3.name = "user3";
//user1.lastName= "";
//user2.lastName= "";
//user3.lastName= "";
//
//Sahte databasedeki email kullan�c�lar�
//User user3 = new User(0, "Kerem", "Var��", "keremV@gmail.com", "HlvNp153");
//User user2 = new User(0, "Engin", "Demiro�", "enginD@gmail.com", "azLc3rvb");
//User user = new User(0, "Yusuf", "Da�kaya", "ydaskaya@gmail.com", "H2zvlnoc");


public class Main {
	public static void main(String[] args) {
		
		UserService userService = new GoogleUserAdapter(new HibernateUserDao());
		User user = new User(1, "yusuf", "da�kaya", "google1@gmail.com", "123456");
		//e�er yukar�da GoogleUserAdapter kullanmaktaysan�z e�er, kullan�c� eklerken "hatal� email" mesaj� ��kmas�n�n sebebi, add i�leminin databsse ekleme �eklinde �al��mas� ve b�yle bir google user bulunmad���ndan giri� yap�lamamas�d�r.
		userService.add(user);
		//hen�z bir database olmad���ndan dolay� bu kullan�c� herhangi bir sisteme kay�t olmuyor. fakat arkaplanda sahte bir database var.
		userService.logIn("google1@gmail.com", "123456");
	}
}
