import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {


            int  numero1=0, resto, i=0;

            System.out.println("Digite um Número: ");
            int numero = new Scanner(System.in).nextInt();

            while ( numero >= numero1){
                ++numero1;

                resto = numero % numero1;

                if ( resto == 0){
                    i++;
                }

            }
            if ( i <= 2)   {

                System.out.println("O Número "+numero+" é primo");
            }
            else
            {
                System.out.println("Numéro "+numero+" não é primo");
            }

        }

    }
