package odev3;

public class UserManager {

	public void singIn(User user) {

		System.out.println("Giri� Ba�ar�l� " + user.fullName);
	}

	public void signUp(User user) {

		System.out.println("Kay�t Ba�ar�l� " + user.fullName);

	}

	public void profiliDuzenle(User user) {

		System.out.println("Profil D�zenlendi " + user.fullName);
	}

}
