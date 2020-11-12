import java.util.Scanner; // declaro a importação da biblioteca

public class Uri1134 {
    public static void main(String args[]){
       Scanner teclado = new Scanner(System.in);
        
       int qtdalcool,qtdgasolina,qtddiesel,opcao;

        qtdalcool=0;
        qtdgasolina=0;
        qtddiesel=0;

        opcao = teclado.nextInt();
        if(opcao != 4){

        while(opcao != 4){
            opcao = teclado.nextInt();
            if(opcao == 1){
                qtdalcool++;
            }
            else if(opcao == 2){
                qtdgasolina++;
            }
            else if(opcao == 3){
                qtddiesel++;
            }
        }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+qtdalcool);
        System.out.println("Gasolina: "+qtdgasolina);
        System.out.println("Diesel: "+qtddiesel);
    }   
}