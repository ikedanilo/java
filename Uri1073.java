import java.util.Scanner; // declaro a importação da biblioteca

public class Uri1073 {
    public static void main(String args[]){
       Scanner teclado = new Scanner(System.in);
        
        int N,confpar,Nquadr;

        N = teclado.nextInt();

        for (int cont=1;cont<=N;cont++){
            confpar = cont % 2;
            if(confpar == 0){
                Nquadr = cont * cont;
                System.out.println(cont+"^2 = "+Nquadr);
            }
        }
    }   
}