import java.util.Scanner; // declaro a importação da biblioteca

public class Extrator {
    public static void main(String args[]){
 
        Scanner teclado = new Scanner(System.in);

        int numero;
        int un,de,ce;

        int resto; // para armazenar o resto da divisao

        numero = teclado.nextInt();

        // se eu pegar esse numero e dividir por 100, obtenho as centenas
        ce = numero / 100;
        resto = numero % 100;
        de = resto / 10;
        un = resto % 10;

        System.out.println("Centena: "+ce);
        System.out.println("Sobrou: "+resto);
        System.out.println("Dezena: "+de);
        System.out.println("Unidade:: "+un);

    }
}





