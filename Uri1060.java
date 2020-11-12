import java.util.Scanner; // declaro a importação da biblioteca

public class Uri1060 {
    public static void main(String args[]){
       Scanner teclado = new Scanner(System.in);
        
        float numero;
        int qtdePositivos=0;

        // como eu conto até 6?
        for (int cont=1; cont<=6; cont++){
            numero = teclado.nextFloat();
            if(numero>0){
              //  System.out.println("Voce digitou um numero positivo");    
                qtdePositivos++;
            }
        }
        System.out.println(qtdePositivos+" valores positivos");
    }   
}