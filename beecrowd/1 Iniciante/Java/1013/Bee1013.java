import java.util.Scanner;

public class Bee1013 {
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valorA = entrada.nextInt(), 
        valorB = entrada.nextInt(), 
        valorC = entrada.nextInt(),
        maior = 0;

        if (valorA > valorB)
            maior = valorA;
        else 
            maior = valorB;
            
        if (maior < valorC)
            maior = valorC;
        
        System.out.printf("%d eh o maior\n", maior);

        entrada.close();
	}
}
