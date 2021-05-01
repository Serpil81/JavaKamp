package odev3;

public class UserManager {

	public void singIn(User user) {

		System.out.println("Giriþ Baþarýlý " + user.fullName);
	}

	public void signUp(User user) {

		System.out.println("Kayýt Baþarýlý " + user.fullName);

	}

	public void profiliDuzenle(User user) {

		System.out.println("Profil Düzenlendi " + user.fullName);
	}

}
