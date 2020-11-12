import java.util.Scanner; // declaro a importação da biblioteca

public class ExemploIf {
    public static void main(String args[]){
 
        Scanner teclado = new Scanner(System.in);

        float n1,p,media;

        System.out.println("Digite a nota da prova");
        n1 = teclado.nextFloat();
        System.out.println("Digite a nota do projeto");
        p = teclado.nextFloat();

        media = (n1 + p) / 2;

        System.out.println("Sua media ="+media);

        if (media >= 6) {
            System.out.println("Parabens voce passou!");
        }
        else {
            System.out.println("Dessa vez nao deu! Ate ano que vem!");
        }
        System.out.println("**** FIM DO PROGRAMA ***");
    }
}