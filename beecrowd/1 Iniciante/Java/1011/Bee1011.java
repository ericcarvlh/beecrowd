import java.util.Scanner;
import java.io.IOException;
import java.lang.Math;

public class Bee1011 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        /* Declarando o valor do raio e o valor do pi. */
        double raio = sc.nextDouble(), pi = 3.14159;
        /* Realizanod o cálculo do volume. */
        double volume = (4/3.0) * pi * Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f\n", volume);

        sc.close();
    }
}