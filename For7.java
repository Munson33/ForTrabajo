import java.util.Scanner;
public class For7 {

	public static void main (String args[]){
	Scanner lea=new Scanner(System.in);
	System.out.println("Ingrese un valor: ");
	int a;
	a= lea.nextInt();
	int factorial = 1;
	for (int b=1 ; b<=a ; b++)
    {
         factorial=b*factorial;
         System.out.println(factorial);
    }
}
}