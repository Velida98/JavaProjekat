import java.util.Scanner;

public class Modul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos=new Scanner(System.in);
		
		System.out.print("Unesite broj sekundi");
		int sekundeKorisnik=unos.nextInt();
		
		int minute=sekundeKorisnik/60;
		int sekunde=sekundeKorisnik%60;
		
		System.out.println(sekundeKorisnik+"sekundi je:"+minute+"minute i"+sekunde +"sekundi");

	}

}
