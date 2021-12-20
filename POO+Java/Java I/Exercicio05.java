import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {


        System.out.print("Digite a quantidade de números: ");
        int qtidade = new Scanner(System.in).nextInt();
        System.out.print("Digite a quantidade de dígitos: ");
        int numDigitos = new Scanner(System.in).nextInt();
        System.out.print("Dígito: ");
        int digito = new Scanner(System.in).nextInt();

        int curr = 0;

        for (int i = 0; i < qtidade;) {

            int aux = Integer.toString(curr).length() - Integer.toString(curr).replaceAll(Integer.toString(digito), "").length();

            if (aux == numDigitos) {
                System.out.println(curr);
                i++;
            }
            curr++;
        }

    }
}
