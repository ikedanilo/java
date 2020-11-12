import java.util.Scanner; // declaro a importação da biblioteca

public class Uri1144 {
    public static void main(String args[]){
       Scanner teclado = new Scanner(System.in);

        int N;
        int valor1,valor2,valor3,valor4,valor5,valor6;

        N = teclado.nextInt();
    
        for(int cont=1; cont <= N; cont++){
            valor1=cont;
            valor2=cont * cont;
            valor3=cont * cont * cont;
            valor4=cont;
            valor5=valor2 + 1;
            valor6=valor3 + 1;

            System.out.println(valor1+" "+valor2+" "+valor3);
            System.out.println(valor4+" "+valor5+" "+valor6);
        }       
    }   
}