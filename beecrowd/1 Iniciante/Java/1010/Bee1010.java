import java.util.Scanner;
import java.io.IOException;

public class Bee1010 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
	    double valorTotal = 0; /* Valor total da operação, valor a pagar. */
		for(int i = 0; i < 2; i++){
    	    int qntdPeca = sc.nextInt(); /* recebendo a quantidade de peças. */
    	    double valorUni = sc.nextDouble(); /* recebendo o valor unitário. */
    	    valorTotal += (qntdPeca * valorUni);
		}
	
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);
	
		sc.close();
	}
}