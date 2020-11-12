import java.util.Scanner; // declaro a importação da biblioteca

public class Uri1046 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int inicio,fim,jogo;

        inicio = teclado.nextInt();
        fim = teclado.nextInt();

        if(inicio > fim){
            fim = 24 + fim;
            jogo = fim - inicio;
            System.out.println("O JOGO DUROU "+jogo+" HORA(S)");
        }
        else if(inicio == fim){
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
        else if(inicio < fim){
            jogo = fim - inicio;
            System.out.println("O JOGO DUROU "+jogo+" HORA(S)");
        }
    }
}