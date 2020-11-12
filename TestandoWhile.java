import java.util.Scanner; // declaro a importação da biblioteca

public class TestandoWhile {
    public static void main(String args[]){

        int valor;

        valor = 0;
        while (valor <=10){
            System.out.println("Valor = "+valor);
            valor = valor + 1;
        }
        System.out.println("*** FIM DO PROGRAMA ***");
    }
}