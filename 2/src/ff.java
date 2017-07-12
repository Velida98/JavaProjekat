import java.util.Scanner;
public class ff {

	public static void main(String[] args) {
		// deklarisati varijable i dodijeliti im vrijednost
		int broj=5;
		int rezultat=broj*2;
		//isprintati rezulatat

		System.out.println("Rezultat je: "+ rezultat);
		
		System.out.println("unesite jedan broj:");
		Scanner input=new Scanner(System.in);
		double poluprecnik1=input.nextDouble();
		double povrsina=poluprecnik*poluprecnik*pi;
		double pi=3.14159;
		System.out.println("Povrsina kruga tog poluprecnika "+poluprecnik +" iznosi " +povrsina);
		
	}

}
