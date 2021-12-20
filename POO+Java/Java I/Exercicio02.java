import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        System.out.print("Digite a quantidade:");
        int num = new Scanner(System.in).nextInt();

        System.out.print("Digite o numero de multiplo: ");
        int num2 = new Scanner(System.in).nextInt();

        for (int i = 0; i <= num; i ++){

           if (i % num2 == 0){
               System.out.println("multipos de "+ " " +num2 +" "+ i);
           }
        }
    }
}
