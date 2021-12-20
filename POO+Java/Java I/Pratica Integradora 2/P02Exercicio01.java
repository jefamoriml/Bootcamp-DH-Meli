import java.util.Arrays;

public class P02Exercicio01 {

    public static void ordernaCrescente(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
            }
        }
    }

    public static void ordernaDecrescente(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {52, 10, 85, 1324, 01, 13, 62, 30, 12, 127};

        ordernaCrescente(arr);
        Arrays.stream(arr).forEach(n -> System.out.print(n + " "));

        System.out.println();

        ordernaDecrescente(arr);
        Arrays.stream(arr).forEach(n -> System.out.print(n + " "));
    }
}
