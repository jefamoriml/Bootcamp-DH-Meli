import java.text.NumberFormat;
import java.util.Scanner;

public class P02Exercicio03 {

    public static void main(String[] args) {

        Produto[] produtos = new Produto[3];
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

        double total =0;

        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Informe o nome do produto: ");
            String nomeProduto = new Scanner(System.in).next();

            System.out.println("Informe o valor do produto: ");
            double valorProduto = new Scanner(System.in).nextDouble();

            System.out.println("Informe a quantidade do produto: ");
            int quantidadeProduto = new Scanner(System.in).nextInt();

            produtos[i] = new Produto(nomeProduto, valorProduto, quantidadeProduto);

            total = total + (valorProduto * quantidadeProduto);
        }

        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Produto " + i);
            System.out.println(produtos[i].nome);
            System.out.println(numberFormat.format(produtos[i].valor));
            System.out.println("Quantidade: " + produtos[i].quantidade + "\n");
        }

        System.out.println("Valor total: " + total);
    }
}

