import java.util.Scanner; // declaro a importação da biblioteca

public class Uri1017 {
    public static void main(String args[]){

       Scanner teclado = new Scanner(System.in);

        int TEMPO,VELOCIDADE;
        float KM,LITROS;
        
        // entrada
        TEMPO = teclado.nextInt();
        VELOCIDADE = teclado.nextInt();
        
        // processamento
        KM = VELOCIDADE * TEMPO;
        LITROS = KM / 12;

        // saida
         System.out.printf("%.3f\n",LITROS);

    }
}