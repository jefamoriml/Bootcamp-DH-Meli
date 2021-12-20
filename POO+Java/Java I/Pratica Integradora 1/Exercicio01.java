import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        int numero1;

        System.out.print("Digite um número:");
        int numero = new Scanner(System.in).nextInt();

        for (int i = 0; i <= numero; i++){

            numero1 = i % 2;
            if (numero1 % 2 == 0){
                System.out.println("Numeros pares" +i);
            }
        }
    }
}
