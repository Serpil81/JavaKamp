package odev2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Kamp kamp1 = new Kamp("C# & Angular Kamp�", "Engin Demiro�", 0.12);

		Kamp kamp2 = new Kamp();
		kamp2.kampAdi = "Java&React Kamp�";
		kamp2.kampEgitmeni = "Engin Demiro�";
		kamp2.tamamlanmaOrani = 0.56;

		Kamp[] kamplar = { kamp1, kamp2 };

		for (Kamp kamp : kamplar) {
			System.out.println("Kamp Ad�: " + kamp.kampAdi + "\n" + "Kamp E�itmeni: " + kamp.kampEgitmeni + "\n"
					+ "Tamamlanma Oran�: " + kamp.tamamlanmaOrani);

		}

		KampManager kampManager = new KampManager();
		kampManager.AddToDB(kamp1);
		kampManager.AddToDB(kamp2);
		kampManager.DeleteFromDB(kamp1);
		kampManager.DeleteFromDB(kamp2);

	}

}
