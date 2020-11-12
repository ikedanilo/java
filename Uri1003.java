import java.util.Scanner; // declaro a importação da biblioteca

public class Uri1003 {
    public static void main(String args[]){

       Scanner teclado = new Scanner(System.in);

       int A,B,SOMA;

       // entrada
       A = teclado.nextInt();
       B = teclado.nextInt();

       // processamento
       SOMA = A + B;

       System.out.println("SOMA = " +SOMA);
       
    }
}