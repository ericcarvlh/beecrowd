import java.util.Scanner;

public class Bee1049 {
    public static void main (String[]args) {
        Scanner entrada = new Scanner (System.in);

        String primeiraPalavra = entrada.nextLine (),
        segundaPalavra = entrada.nextLine (),
        terceiraPalavra = entrada.nextLine (),
        animal = "";

        if (primeiraPalavra.equals("vertebrado")) {
            if (terceiraPalavra.equals("onivoro"))
                if (segundaPalavra.equals("ave"))
                    animal = "pomba";
                else 
                    animal = "homem";
            else {
                if (terceiraPalavra.equals("herbivoro"))
                    animal = "vaca";
                else 
                    animal = "aguia";
            }
        } else {
            if (terceiraPalavra.equals("hematofago")) {
                if (segundaPalavra.equals("inseto"))
                    animal = "pulga";
                else 
                    animal = "sanguessuga";
            } else {
                if (terceiraPalavra.equals("herbivoro"))
                    animal = "lagarta";
                else 
                    animal = "minhoca";
            }
        }
        
        System.out.println(animal);
        
        entrada.close ();
    }
}