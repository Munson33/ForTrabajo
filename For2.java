import java.util.Scanner;
public class For2{

	
	public static void main (String args[]){
	Scanner lea= new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		int numero= lea.nextInt();
		for(int x=1;x<=numero;x++){
			System.out.println(x);
		}
	}
}