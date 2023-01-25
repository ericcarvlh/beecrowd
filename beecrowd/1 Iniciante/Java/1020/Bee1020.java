import java.util.Scanner;
import java.io.IOException;

public class Bee1020 {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);

        int idadeEmDias = entrada.nextInt();

        // uso o operador "/" de uma forma que ele so retorna a parte inteira.
        int anos = idadeEmDias / 365; // pegando a quantidade de meses, mesmo se tiver 366 ele so vai pegar de uma forma que nao seja numero decimal.
        int meses = (idadeEmDias % 365) / 30; // pegando os dias que sobraram dos anos para converter para mes se a quantidade de dias for maior que 30.
        int dias =  (idadeEmDias % 365) % 30; // fazendo o mesmo de cima com uma diferença de que pegamos somente os dias de uma forma que pegamos so aquilo que nao se encaixa na parte de cima.

        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", anos, meses, dias);

        entrada.close();
    }
}
