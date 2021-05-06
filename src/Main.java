import business.abstracts.UserService;
import business.concretes.GoogleUserAdapter;
import business.concretes.UserManager;
import core.EMailSender;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

//Sahte databasedeki email kullanýcýlarý
//User user3 = new User(0, "Kerem", "Varýþ", "keremV@gmail.com", "HlvNp153");
//User user2 = new User(0, "Engin", "Demiroð", "enginD@gmail.com", "azLc3rvb");
//User user = new User(0, "Yusuf", "Daþkaya", "ydaskaya@gmail.com", "H2zvlnoc");


public class Main {
	public static void main(String[] args) {
		EMailSender mailCheck = new EMailSender();
		UserService userService = new UserManager(new HibernateUserDao());
		User user = new User(1, "yusuf", "daþkaya", "google1@gmail.com", "123456");
		//eðer yukarýda GoogleUserAdapter kullanmaktaysanýz eðer, kullanýcý eklerken "hatalý email" mesajý çýkmasýnýn sebebi, add iþleminin databsse ekleme þeklinde çalýþmasý ve böyle bir google user bulunmadýðýndan giriþ yapýlamamasýdýr.
		userService.add(user);
		//henüz bir database olmadýðýndan dolayý bu kullanýcý herhangi bir sisteme kayýt olmuyor. fakat arkaplanda sahte bir database var.
		mailCheck.verifyUser(user);
		userService.logIn("google1@gmail.com", "123456");
	}
}
