package logInWithGoogleOAuth;

import java.util.ArrayList;
import java.util.List;

public class GoogleAuth {
	public Boolean logIn(String email, String password) {
		GoogleUser user = getUserByEmail(email);
		if(user != null) {
			if(user.password == password) {
				System.out.println("Google ile Giriþ yapýldý");
				return true;
			}else {
				System.out.println("e-mail veya þifre hatalý");
				return false;
			}
		}else {
			System.out.println("hatalý email");
			return false;
		}
		
		
	}
	
	public GoogleUser getUserByEmail(String email){
		for(GoogleUser user : getAllUser()) {
			if(user.email == email) {
				return user;
			}
		}
		return null;
	}
	
	public List<GoogleUser> getAllUser(){
		// 3 kiþilik bir kullanýcý listesinin gelmesi simülasyonu
				List<GoogleUser> list = new ArrayList<GoogleUser>();
				GoogleUser user1 = new GoogleUser();
				GoogleUser user2 = new GoogleUser();
				GoogleUser user3 = new GoogleUser();
				user1.email = "google1@gmail.com";
				user2.email = "google2@gmail.com";
				user3.email = "google3@gmail.com";
				user1.password = "123456";
				user2.password = "123456";
				user3.password = "123456";
				user1.name = "user1";
				user2.name = "user2";
				user3.name = "user3";
				user1.lastName= "";
				user2.lastName= "";
				user3.lastName= "";
				list.add(user1);
				list.add(user2);
				list.add(user3);
				return list;
	}
}

class GoogleUser {
	String email;
	String password;
	String name;
	String lastName;
}