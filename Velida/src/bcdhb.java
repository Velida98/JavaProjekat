
public class bcdhb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 6;
		if ((i < 10) && (i > 5)) {
			System.out.println("i je manje od 10 a vece od 5");
		}
		if ((i < 10) || (i > 15)) {
			System.out.println("i je ili manje od 10 ili vece od 15");
		}

		int broj = 100;
		if (broj <= 0) {
			System.out.println("Molimo unesite broj veci od nule");
		} else if (broj >= 100) {
			System.out.println("molimo unesite broj veci od 100");
		} else {
			System.out.println("Broj koji ste unijeli je:" + broj);
		}
	}
}
