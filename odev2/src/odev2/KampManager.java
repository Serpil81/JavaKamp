package odev2;

public class KampManager {
	public void AddToDB(Kamp kamp) {
		System.out.println(kamp.kampAdi + " Veritabanýna Eklendi.");
	}

	public void DeleteFromDB(Kamp kamp) {
		System.out.println(kamp.kampAdi + " Veritabanýndan Silindi.");
	}
}
