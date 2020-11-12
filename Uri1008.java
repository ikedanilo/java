import java.util.Scanner; // declaro a importação da biblioteca

public class Uri1008 {
    public static void main(String args[]){

       Scanner teclado = new Scanner(System.in);

        int NUMBER,HORAS;
        double VALOR,SALARY;

        // entrada
        NUMBER = teclado.nextInt();
        HORAS = teclado.nextInt();
        VALOR = teclado.nextDouble();
        

        // processamento
       SALARY = HORAS * VALOR;

        // saida
         System.out.println("NUMBER = " +NUMBER);
         System.out.printf("SALARY = " + "U$"+ " %.2f\n",SALARY);

    }
}