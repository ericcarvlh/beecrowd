import java.util.Scanner;

public class Bee1045 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double valorA = entrada.nextDouble(), 
        valorB = entrada.nextDouble(),
        valorC = entrada.nextDouble();

        if (valorA < valorB) { // entao o valor B é o maior.
            double variavelAuxiliar = valorA;
            valorA = valorB;
            valorB = variavelAuxiliar;
        }

        if (valorA < valorC) { // entao o valor C é o maior.
            double variavelAuxiliar = valorA;
            valorA = valorC;
            valorC = variavelAuxiliar;
        }

        if (valorB < valorC) { // entao o valor C é o maior.
            double variavelAuxiliar = valorB;
            valorB = valorC;
            valorC = variavelAuxiliar;
        }

        String mensagemFinal = "";
        if (valorA >= valorB + valorC)
            mensagemFinal = "NAO FORMA TRIANGULO\n";
        else {
            if ((valorA * valorA) == (valorB * valorB + valorC * valorC))
                mensagemFinal += "TRIANGULO RETANGULO\n";

            if ((valorA * valorA) > (valorB * valorB + valorC * valorC))
                mensagemFinal += "TRIANGULO OBTUSANGULO\n";

            if ((valorA * valorA) < (valorB * valorB + valorC * valorC))
                mensagemFinal += "TRIANGULO ACUTANGULO\n";

            if ((valorA == valorB) && (valorB == valorC))
                mensagemFinal += "TRIANGULO EQUILATERO\n";
            else if ((valorA == valorB) || (valorB == valorC) || (valorA == valorC))
                mensagemFinal += "TRIANGULO ISOSCELES\n";
        }

        System.out.print(mensagemFinal);

        entrada.close();
    }
}