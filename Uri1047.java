import java.util.Scanner; // declaro a importação da biblioteca

public class Uri1047 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int ihora,imin,fhora,fmin,itempo,ftempo,FIM,horafinal,minfinal;
        

        ihora = teclado.nextInt();
        imin = teclado.nextInt();
        fhora = teclado.nextInt();
        fmin = teclado.nextInt();

        ihora = ihora * 60;
        itempo = ihora + imin;

        fhora = fhora * 60;
        ftempo = fhora + fmin;

        if(itempo > ftempo){
            ftempo = ftempo + 1440;
            FIM = ftempo - itempo;
            horafinal = FIM / 60;
            minfinal = FIM % 60;
            System.out.println("O JOGO DUROU "+horafinal+" HORA(S) E "+minfinal+" MINUTO(S)");
        }
        else if(itempo < ftempo){
            FIM = ftempo - itempo;
            horafinal = FIM / 60;
            minfinal = FIM % 60;
            System.out.println("O JOGO DUROU "+horafinal+" HORA(S) E "+minfinal+" MINUTO(S)");
        }
        else if(itempo == ftempo){
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }
    }
}