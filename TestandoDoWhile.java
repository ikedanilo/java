import java.util.Scanner; // declaro a importação da biblioteca

public class TestandoDoWhile {
    public static void main(String args[]){

        int valor;

        valor = 100;
 
        do{
            System.out.println("Valor = "+valor);
            valor++; // valor = valor + 1; 
            // tb é igual a valor += 5 --> valor = valor + 5 (este tipo é mais versatil)

        } while(valor <= 10);

        System.out.println("*** FIM DO PROGRAMA ***");
    }   
}