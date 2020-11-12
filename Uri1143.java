import java.util.Scanner; // declaro a importação da biblioteca

public class Uri1143 {
    public static void main(String args[]){
       Scanner teclado = new Scanner(System.in);

        int N,valor1,valor2,valor3;

        N = teclado.nextInt();

        for(int cont=1; cont<=N; cont++){
            valor1 = cont;
            valor2 = cont * cont;
            valor3 = cont * cont * cont;

            System.out.println(valor1+" "+valor2+" "+valor3);
        }
    }   
}