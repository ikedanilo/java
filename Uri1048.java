import java.util.Scanner; // declaro a importação da biblioteca

public class Uri1048 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double salario,reajuste,novo;

        salario = teclado.nextDouble();

        if(salario <= 400.00 && salario > 0){
            novo = salario * 1.15;
            reajuste = salario * 0.15;
            System.out.printf("Novo salario: %.2f\n",novo);
            System.out.printf("Reajuste ganho: %.2f\n",reajuste);
            System.out.println("Em percentual: 15 %");
        }
        else if(salario > 400.00 && salario <= 800.00){
            novo = salario * 1.12;
            reajuste = salario * 0.12;
            System.out.printf("Novo salario: %.2f\n",novo);
            System.out.printf("Reajuste ganho: %.2f\n",reajuste);
            System.out.println("Em percentual: 12 %");
        }
        else if(salario > 800.00 && salario <= 1200.00){
            novo = salario * 1.10;
            reajuste = salario * 0.10;
            System.out.printf("Novo salario: %.2f\n",novo);
            System.out.printf("Reajuste ganho: %.2f\n",reajuste);
            System.out.println("Em percentual: 10 %");
        }
        else if(salario > 1200.00 && salario <= 2000.00){
            novo = salario * 1.07;
            reajuste = salario * 0.07;
            System.out.printf("Novo salario: %.2f\n",novo);
            System.out.printf("Reajuste ganho: %.2f\n",reajuste);
            System.out.println("Em percentual: 7 %");
        }
        else if(salario > 2000.00){
            novo = salario * 1.04;
            reajuste = salario * 0.04;
            System.out.printf("Novo salario: %.2f\n",novo);
            System.out.printf("Reajuste ganho: %.2f\n",reajuste);
            System.out.println("Em percentual: 4 %");
        }
    }
}