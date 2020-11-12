import java.util.Scanner; // declaro a importação da biblioteca

public class Uri1142 {
    public static void main(String args[]){
       Scanner teclado = new Scanner(System.in);

        int N,valor1,valor2,valor3;

        N = teclado.nextInt();
        
        valor1=1;
        valor2=2;
        valor3=3;

        for(int cont=1;cont<=N;cont++){

            System.out.println(valor1+" "+valor2+" "+valor3+" PUM");
            valor1 = valor1 + 4;
            valor2 = valor2 + 4;
            valor3 = valor3 + 4;            
        }   
    }   
}