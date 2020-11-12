import java.util.Scanner; // declaro a importação da biblioteca

public class Uri1067 {
    public static void main(String args[]){
       Scanner teclado = new Scanner(System.in);
        
        int X,qtdimpar,confimpar,cont;

        X = teclado.nextInt();

        for(cont = 1;cont<=X;cont++){
            confimpar = cont % 2;
            if(confimpar != 0){
                System.out.println(cont);
            }
        }
    }   
}