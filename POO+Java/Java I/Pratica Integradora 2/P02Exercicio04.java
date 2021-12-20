import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P02Exercicio04 {



    public static void main(String[] args) {
        int arr[] = {16223, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8};
        radixSort(arr);
    }


    public static void radixSort(int arr[]) {
        String arrString[] = new String[arr.length];
        int maiorValor = 0;
        int menorValor = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                maiorValor = arr[i];
                menorValor = arr[i];
            }

            if (arr[i] > maiorValor) {
                maiorValor = arr[i];
            }

            if (arr[i] < menorValor) {
                menorValor = arr[i];
            }
        }


        for (int i = 0; i < arr.length; i++) {
            String numeroComZeros = String.format("%0" + String.valueOf(maiorValor).length() + "d", arr[i]);

            arrString[i] = numeroComZeros;
        }


        int posVerificada = String.valueOf(maiorValor).length() - 1;
        while (posVerificada >= 0) {
            List<List<String>> listaDeListas = new ArrayList<>();

            for (int k = 0; k < 10; k++) listaDeListas.add(new ArrayList<>());

            for (String s : arrString) {
                int ultimoDigito = Character.getNumericValue(s.charAt(posVerificada));

                listaDeListas.get(ultimoDigito).add(s);
            }

            int cont = 0;
            for (List<String> lista : listaDeListas) {
                for (String s : lista) {
                    arrString[cont] = s;

                    cont++;
                }
            }
            posVerificada--;
        }
        Arrays.stream(arrString).forEach(s -> System.out.print(s + " "));
    }
}
