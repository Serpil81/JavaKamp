package odev2;

public class Kamp {

	public Kamp() {

		System.out.println("Merhaba,ben constructor'ý olmayan kampým:) ");
	}

	public Kamp(String kampAdi, String kampEgitmeni, double tamamlanmaOrani) {

		this.kampAdi = kampAdi;
		this.kampEgitmeni = kampEgitmeni;
		this.tamamlanmaOrani = tamamlanmaOrani;

	}

	String kampAdi;
	String kampEgitmeni;
	double tamamlanmaOrani;

}
