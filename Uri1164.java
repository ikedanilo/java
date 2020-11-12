import java.util.Scanner; // declaro a importação da biblioteca

public class Uri1164 {
    public static void main(String args[]){
       Scanner teclado = new Scanner(System.in);

        int N,valor,soma,resto;

        N = teclado.nextInt();

        for(int cont=1;cont<=N;cont++){
            soma=0;
            valor = teclado.nextInt();

            for(int div=1;div<valor;div++){
                resto = valor % div;
                if(resto == 0){
                    soma = soma + div;
                }
            }        
            if(soma == valor){
                System.out.println(valor+" eh perfeito");
            }
            else{
                System.out.println(valor+" nao eh perfeito");
            }             
        }
    }   
}