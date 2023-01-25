import java.util.Scanner;

public class Bee1048 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salarioInicial = entrada.nextDouble(),
        salarioReajustado = 0,
        reajusteGanho = 0, 
        porcentagemReajuste = 0;

        if (salarioInicial >= 0 && salarioInicial <= 400)
            porcentagemReajuste = 0.15;
        else if (salarioInicial > 400 && salarioInicial <= 800)
            porcentagemReajuste = 0.12;
        else if (salarioInicial > 800 && salarioInicial <= 1200)
            porcentagemReajuste = 0.10;
        else if (salarioInicial > 1200 && salarioInicial <= 2000)
            porcentagemReajuste = 0.07;
        else if (salarioInicial > 2000)
            porcentagemReajuste = 0.04;

        salarioReajustado = salarioInicial * (1 + porcentagemReajuste);
        reajusteGanho = salarioInicial * porcentagemReajuste;

        // usamos duas porcentagens em java para não gerar erro de formatação.
        System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %.0f %%\n", 
        salarioReajustado, reajusteGanho, (porcentagemReajuste*100));

        entrada.close();
    }
}