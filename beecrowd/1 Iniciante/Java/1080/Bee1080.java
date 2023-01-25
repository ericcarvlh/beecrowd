import java.util.Scanner;

public class Bee1080 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int index = 0, posicaoValor = 0, maiorNumero = 0;
		while (index < 100) {
		    int numero = entrada.nextInt();
		    if (maiorNumero < numero) {
		        maiorNumero = numero;
		        posicaoValor = index + 1;
		    }
		    index++;
		}
		
	    System.out.printf("%d\n%d\n", 
	    maiorNumero, 
	    posicaoValor);
		
		entrada.close();
	}
}
