public class Continhas {
    public static void main(String args[]){

        // poderia também fazer int a,b,c;        
        int a;
        int b;
        int c;

        a = 19;
        b = 3;

        c = a + b;

        // Dessa forma abaixo colocando + significa que esta concatenando texto
        System.out.println("Valor da soma = " + c);

        c = a - b;
        System.out.println("Valor da subtracao = " + c);

        c = a * b;
        System.out.println("Valor da multriplicacao = " + c);

        c = a / b;
        System.out.println("Valor da divisao = " + c);

        c = a % b;
        System.out.println("Valor do resto = " + c);

        float d;

        d = 1f / 2;
        System.out.println("Valor do d = " + d);
    }
}
