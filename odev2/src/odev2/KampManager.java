package odev2;

public class KampManager {
	public void AddToDB(Kamp kamp) {
		System.out.println(kamp.kampAdi + " Veritaban�na Eklendi.");
	}

	public void DeleteFromDB(Kamp kamp) {
		System.out.println(kamp.kampAdi + " Veritaban�ndan Silindi.");
	}
}
