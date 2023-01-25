import java.io.IOException;
import java.util.Scanner;

public class Bee1051 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        double salario;
        double impostoERoubo;
        salario = sc.nextDouble();
        
        if (salario <= 2000.00)
            System.out.println("Isento");
        else if(salario >= 2000.01 && salario <= 3000.00){
            impostoERoubo = (salario - 2000.00) * 0.08;
            System.out.printf("R$ %.2f\n", impostoERoubo);
        } else if (salario >= 3000.01 && salario <= 4500.00){
            impostoERoubo = ((salario - 3000.00) * 0.18) + 80;
            System.out.printf("R$ %.2f\n", impostoERoubo);
        } else {
            impostoERoubo = ((salario - 4500) * 0.28) + 350;
            System.out.printf("R$ %.2f\n", impostoERoubo);
        }

        sc.close();
    }
}