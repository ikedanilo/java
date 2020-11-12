import java.util.Scanner; // declaro a importação da biblioteca

public class Uri1001 {
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int A,B,X;

        // entrada
        A = teclado.nextInt();
        B = teclado.nextInt();

        // processamento
        X = A + B;

        //saida
        System.out.println("X = " + X);

    }
}