import java.util.Scanner; // declaro a importação da biblioteca

public class Uri1065 {
    public static void main(String args[]){
       Scanner teclado = new Scanner(System.in);
        
        int numero;
        int qtdpar;
        int valor;

        qtdpar=0;

        for (int cont=1;cont<=5;cont++){
            numero = teclado.nextInt();
            valor = numero % 2;
            if (valor==0){
                qtdpar++;
            }
        }
        System.out.println(qtdpar+" valores pares");
    }   
}