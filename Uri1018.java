import java.util.Scanner; // declaro a importação da biblioteca

public class Uri1018 {
    public static void main(String args[]){
 
        Scanner teclado = new Scanner(System.in);
        
        // variaveis de entrada
        int valor;
        // variaveis de saida
        int q100,q50,q20,q10,q5,q2,q1;
        // posso ter outras variaveis para me facilitar a vida?
        int resto100,resto50,resto20,resto10,resto5,resto2,resto1;

        // entrada
        valor = teclado.nextInt();

        // processamento
        q100 = valor / 100;
        // quanto sobrou?
        resto100 = valor % 100;

        q50 = resto100 / 50;
        resto50 = resto100 % 50;

        q20 = resto50 / 20;
        resto20 = resto50 % 20;

        q10 = resto20 / 10;
        resto10 = resto20 % 10;

        q5 = resto10 / 5;
        resto5 = resto10 % 5;

        q2 = resto5 / 2;
        resto2 = resto5 % 2;

        q1 = resto2 / 1;

        // saida
        System.out.println(valor);
        System.out.println(q100+" nota(s) de R$ 100,00");
        System.out.println(q50+" nota(s) de R$ 50,00");
        System.out.println(q20+" nota(s) de R$ 20,00");
        System.out.println(q10+" nota(s) de R$ 10,00");
        System.out.println(q5+" nota(s) de R$ 5,00");
        System.out.println(q2+" nota(s) de R$ 2,00");
        System.out.println(q1+" nota(s) de R$ 1,00");
    }
}









