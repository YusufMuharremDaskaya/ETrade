import business.abstracts.UserService;
import business.concretes.GoogleUserAdapter;
import business.concretes.UserManager;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

//Sahte databesedeki google kullanýcýlarý 
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
//Sahte databasedeki email kullanýcýlarý
//User user3 = new User(0, "Kerem", "Varýþ", "keremV@gmail.com", "HlvNp153");
//User user2 = new User(0, "Engin", "Demiroð", "enginD@gmail.com", "azLc3rvb");
//User user = new User(0, "Yusuf", "Daþkaya", "ydaskaya@gmail.com", "H2zvlnoc");


public class Main {
	public static void main(String[] args) {
		
		UserService userService = new GoogleUserAdapter(new HibernateUserDao());
		User user = new User(1, "yusuf", "daþkaya", "google1@gmail.com", "123456");
		//eðer yukarýda GoogleUserAdapter kullanmaktaysanýz eðer, kullanýcý eklerken "hatalý email" mesajý çýkmasýnýn sebebi, add iþleminin databsse ekleme þeklinde çalýþmasý ve böyle bir google user bulunmadýðýndan giriþ yapýlamamasýdýr.
		userService.add(user);
		//henüz bir database olmadýðýndan dolayý bu kullanýcý herhangi bir sisteme kayýt olmuyor. fakat arkaplanda sahte bir database var.
		userService.logIn("google1@gmail.com", "123456");
	}
}
