import java.util.Scanner;

public class Bee1037 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        double numeroIntervalo = entrada.nextDouble();

        if (numeroIntervalo > 100 || numeroIntervalo < 0)
            System.out.println("Fora de intervalo");
        else {
            if (numeroIntervalo >= 0 && numeroIntervalo <= 25)
                System.out.println("Intervalo [0,25]");
            else if (numeroIntervalo > 25 && numeroIntervalo <= 50)
                System.out.println("Intervalo (25,50]");
            else if (numeroIntervalo > 50 && numeroIntervalo <= 75)
                System.out.println("Intervalo (50,75]");
            else if (numeroIntervalo > 75 && numeroIntervalo <= 100)
                System.out.println("Intervalo (75,100]");
        }

        entrada.close();
    }
}