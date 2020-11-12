import java.util.Scanner; // declaro a importação da biblioteca

public class Uri1070 {
    public static void main(String args[]){
       Scanner teclado = new Scanner(System.in);
        
        int X,cont,Nimpar;

        cont=1;
        X = teclado.nextInt();
        
        while(cont<=6){
            Nimpar = X % 2;
            if(Nimpar != 0){
                System.out.println(X);
                cont++;
            }
            X++;
        }
    }   
}