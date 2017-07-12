import java.util.Scanner;

public class vv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos= new Scanner(System.in);
		System.out.println("Unesite vrijednost bez PDV-a");
		double bezPDVa=unos.nextDouble();
		double vrijednostPDVa=bezPDVa*0.17;
		double konacnaCijena=bezPDVa+vrijednostPDVa;
		System.out.println("Vrijednost PDVa je:"+vrijednostPDVa + "KM");
		System.out.println("Konacna cijena je:" + konacnaCijena +"KM");

	}

}
