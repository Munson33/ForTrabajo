import java.util.Scanner;
public class For3 {

	public static void main (String args[]){
	Scanner lea=new Scanner(System.in);
	int numero,numero1,numero2;
	numero=0;
	for (int z=1;z<=10;z++){
		System.out.println("Ingrese un numero: ");
		numero1=lea.nextInt();
		numero=numero+numero1;

	}
		numero2=numero/10;
		System.out.print("La suma de los valores:");
		System.out.println(numero);
		System.out.println("El promedio: ");
		System.out.println(numero2);
	} 
} 