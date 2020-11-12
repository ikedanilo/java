import java.util.Scanner; // declaro a importação da biblioteca

public class TesteSwitch {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int valor;
        System.out.println("Por favor digite um valor");
        valor = teclado.nextInt();

        switch(valor){
            case 1:
                System.out.println("Digitou o valor 1");
                break;
            case 2:
                System.out.println("Digitou o valor 2");
                break; 
            case 3:
                System.out.println("Digitou o valor 3");
                break; 
        }

    }
}