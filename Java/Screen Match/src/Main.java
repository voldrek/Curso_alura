import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Esse é 0 Screen Match");
        String nomeFilme = "Top Gun: Maverick";

        int anoDeLancamento = 2022;


        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;

        int classicacao = (int) (media /2);

        String sinopse = "Filme de aventura com galã dos anos 80";

        System.out.printf(
                "Filme: %s%n" +
                        "Ano de lançamento: %s%n" +
                        "Média: %.2f%n" +
                        "Sinopse: %s%n" +
                        "classificação: %s",
                nomeFilme, anoDeLancamento, media, sinopse, classicacao);




    }
}