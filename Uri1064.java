import java.util.Scanner; // declaro a importação da biblioteca

public class Uri1064 {
    public static void main(String args[]){
       Scanner teclado = new Scanner(System.in);
        
        float numero,somatoria,media;
        int qtdePositivos=0;
        somatoria=0;

        //sei contar ate 6?
        for(int cont=1; cont<=6; cont++){
            numero = teclado.nextFloat();
            if (numero >0){
                qtdePositivos++;
                somatoria = somatoria + numero;
            }
        }
        media = somatoria / qtdePositivos;

        System.out.println(qtdePositivos+" valores positivos");
        System.out.printf("%.1f\n",media);
    }   
}