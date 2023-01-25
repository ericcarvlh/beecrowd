import java.util.Scanner;

public class Bee1038 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int codigoLanche = entrada.nextInt();
        int quantidadeProduto = entrada.nextInt();
        double precoTotal = 0;

        if (codigoLanche == 1)
            precoTotal = 4 * quantidadeProduto;
        else if (codigoLanche == 2)
            precoTotal = 4.5 * quantidadeProduto;
        else if (codigoLanche == 3)
            precoTotal = 5 * quantidadeProduto;
        else if (codigoLanche == 4)
            precoTotal = 2 * quantidadeProduto;
        else if (codigoLanche == 5)
            precoTotal = 1.5 * quantidadeProduto;

        System.out.printf("Total: R$ %.2f\n", precoTotal);

        entrada.close();
    }
}