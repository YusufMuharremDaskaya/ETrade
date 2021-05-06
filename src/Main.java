import business.abstracts.UserService;
import business.concretes.GoogleUserAdapter;
import business.concretes.UserManager;
import core.EMailSender;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

//Sahte databasedeki email kullan�c�lar�
//User user3 = new User(0, "Kerem", "Var��", "keremV@gmail.com", "HlvNp153");
//User user2 = new User(0, "Engin", "Demiro�", "enginD@gmail.com", "azLc3rvb");
//User user = new User(0, "Yusuf", "Da�kaya", "ydaskaya@gmail.com", "H2zvlnoc");


public class Main {
	public static void main(String[] args) {
		EMailSender mailCheck = new EMailSender();
		UserService userService = new UserManager(new HibernateUserDao());
		User user = new User(1, "yusuf", "da�kaya", "google1@gmail.com", "123456");
		//e�er yukar�da GoogleUserAdapter kullanmaktaysan�z e�er, kullan�c� eklerken "hatal� email" mesaj� ��kmas�n�n sebebi, add i�leminin databsse ekleme �eklinde �al��mas� ve b�yle bir google user bulunmad���ndan giri� yap�lamamas�d�r.
		userService.add(user);
		//hen�z bir database olmad���ndan dolay� bu kullan�c� herhangi bir sisteme kay�t olmuyor. fakat arkaplanda sahte bir database var.
		mailCheck.verifyUser(user);
		userService.logIn("google1@gmail.com", "123456");
	}
}
