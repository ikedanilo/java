import java.util.Scanner; // declaro a importação da biblioteca

public class Uri1066 {
    public static void main(String args[]){
       Scanner teclado = new Scanner(System.in);
        
        int numero,qtdpar,qtdimpar,qtdpos,qtdneg,confpos;
        qtdpar=0;
        qtdimpar=0;
        qtdpos=0;
        qtdneg=0;

        for(int cont=1;cont<=5;cont++){
            numero = teclado.nextInt();
            confpos = numero % 2;
            if(confpos == 0){
                qtdpar++;
            }
            else{
                qtdimpar++;
            }
            if(numero>0){
                qtdpos++;
            }
            else if(numero<0){
                qtdneg++;
            }
        }
        System.out.println(qtdpar+" valor(es) par(es)");
        System.out.println(qtdimpar+" valor(es) impar(es)");
        System.out.println(qtdpos+" valor(es) positivo(s)");
        System.out.println(qtdneg+" valor(es) negativo(s)");
    }   
}