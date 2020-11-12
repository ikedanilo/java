import java.util.Scanner; // declaro a importação da biblioteca

public class Uri1114 {
    public static void main(String args[]){
       Scanner teclado = new Scanner(System.in);
        
        int senha;
        senha = 0;

        while(senha!=2002){
            senha = teclado.nextInt();

            if(senha==2002){
                System.out.println("Acesso Permitido");
            }
            else{
                System.out.println("Senha Invalida");
            }
        }
    }   
}