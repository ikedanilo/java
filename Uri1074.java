import java.util.Scanner; // declaro a importação da biblioteca

public class Uri1074 {
    public static void main(String args[]){
       Scanner teclado = new Scanner(System.in);
        
        int N,valor,confpar;

        N = teclado.nextInt();

        for (int cont=1;cont<=N;cont++){
            valor = teclado.nextInt();
            confpar = valor % 2;

            if(valor>0 && confpar == 0){
                System.out.println("EVEN POSITIVE");
            }
            else if(valor>0 && confpar != 0){
               System.out.println("ODD POSITIVE"); 
            }
            else if(valor<0 && confpar == 0){
              System.out.println("EVEN NEGATIVE");   
            }
            else if(valor<0 && confpar != 0){
              System.out.println("ODD NEGATIVE"); 
            }
            else if(valor == 0){
                System.out.println("NULL");
            }
        }
    }   
}