
public class Exercício2 {
    public static void main(String[] args) {
        // 1. Média de duas notas decimais
        double nota1 = 7.5;
        double nota2 = 8.2;
        double media = (nota1 + nota2) / 2;
        System.out.printf("A média das duas notas é: %.2f%n", media);

        // 2. Casting de double para int
        double valorDouble = 9.99;
        int valorInt = (int) valorDouble;
        System.out.println("O valor double é: " + valorDouble + " e o valor convertido para int é: " + valorInt);

        // 3. Concatenação de char e String
        char letra = 'A';
        String palavra = "bacana";
        String mensagem = letra + palavra;
        System.out.println("Mensagem concatenada: " + mensagem);

        // 4. Cálculo do valor total (preço * quantidade)
        double precoProduto = 19.99;
        int quantidade = 3;
        double valorTotal = precoProduto * quantidade;
        System.out.printf("O valor total para %d produtos a R$ %.2f cada é: R$ %.2f%n", quantidade, precoProduto, valorTotal);

        // 5. Conversão de dólares para reais
        double valorEmDolares = 50.0;
        double cotacaoDolar = 4.94;
        double valorEmReais = valorEmDolares * cotacaoDolar;
        System.out.printf("R$ %.2f em reais, considerando a cotação de 1 dólar = R$ %.2f%n", valorEmReais, cotacaoDolar);

        // 6. Aplicação de desconto
        double precoOriginal = 120.0;
        double percentualDesconto = 15; // 15% de desconto
        double valorDesconto = precoOriginal * (percentualDesconto / 100);
        double precoComDesconto = precoOriginal - valorDesconto;
        System.out.printf("O preço original é R$ %.2f, com um desconto de %.2f%%, o novo preço é R$ %.2f%n", precoOriginal, percentualDesconto, precoComDesconto);
    }
}
