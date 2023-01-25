import java.util.Scanner;

public class Bee1042 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valorA = entrada.nextInt(), 
        valorB = entrada.nextInt(),
        valorC = entrada.nextInt();

        String valorInicial = valorA+"\n"+valorB+"\n"+valorC+"\n";

        if (valorA > valorB) { // entao A eh maior
            int variavelAuxiliar = valorA;
            valorA = valorB;
            valorB = variavelAuxiliar;
        }

        if (valorB > valorC) { // entao B eh maior
            int variavelAuxiliar = valorB;
            valorB = valorC;
            valorC = variavelAuxiliar;
        }

        if (valorA > valorB) { // entao A eh maior
            int variavelAuxiliar = valorA;
            valorA = valorB;
            valorB = variavelAuxiliar;
        }

        System.out.printf("%d\n%d\n%d\n\n%s", valorA, valorB, valorC, valorInicial);

        entrada.close();
    }
}