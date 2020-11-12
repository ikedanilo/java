import java.util.Scanner; // declaro a importação da biblioteca

public class Uri1019 {
    public static void main(String args[]){

       Scanner teclado = new Scanner(System.in);

        int N,horas,minu,segu,resto;

        N = teclado.nextInt();

        horas = N / 3600; // 1h = 3600 segundos
        resto = N % 3600;

        minu =resto /60; //1min = 60 segundos
        segu = resto %60;

        System.out.println(horas+":"+minu+":"+segu);

    }
}
