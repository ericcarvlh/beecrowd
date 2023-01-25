import java.util.Scanner;

public class Bee1074 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quantidadeLeitura = entrada.nextInt(), 
        index = 0;
        String finalMessage = "";

        while (index < quantidadeLeitura) {
            String message = "";
            int numero = entrada.nextInt();

            if (numero != 0) {
                if (numero % 2 == 0)
                    message = "EVEN ";
                else 
                    message = "ODD ";

                if (numero > 0)
                    message += "POSITIVE\n";
                else 
                    message += "NEGATIVE\n";
            }  else 
                message = "NULL\n";

            finalMessage += message; 

            index++;
        }

        System.out.print(finalMessage);

        entrada.close();
    }
}