import java.util.Scanner;

public class gh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos= new Scanner(System.in);
		System.out.println("Unesite tri broja:");
		double a,b,c;
		 a=unos.nextDouble();
		b=unos.nextDouble();
		 c=unos.nextDouble();
		double prosjek=((a+b+c)/3);

		
		System.out.println("Vrijednost je: "+prosjek);

	}

}
