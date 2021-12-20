import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        System.out.print("Digite um numero: ");
        int numero = new Scanner(System.in).nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 1; i < numero; i++) {
            if (isPrimo(i)) {
                arr.add(i);
            }
        }
        System.out.println("A quantidade de numeros primos entre 1 e " + numero + ": " + arr.size());
        System.out.println("Os numeros primos entre 1 e " + numero + " são: "+ arr);
    }

    public static boolean isPrimo(int number) {
        for (int j = 2; j < number; j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }
}
