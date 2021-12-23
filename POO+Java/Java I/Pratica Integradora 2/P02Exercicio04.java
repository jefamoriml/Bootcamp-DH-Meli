import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.List;
import java.util.stream.Stream;

public class P02Exercicio04 {



    public static int countDigits (int number) {
        return (number == 0)
                ? 1
                : (int)(Math.log10(number) + 1);
    }

    public static List<String> setZerosAEsquerdaEConverteParaString(int digitoMaximo, int iArr[]){
        List<String> listNumerosConvertidosParaString = new ArrayList<>();
        for(int n: iArr){
            String numeroComZerosAEsquerda = String.format("%0"+ digitoMaximo + "d", n);
            listNumerosConvertidosParaString.add(numeroComZerosAEsquerda);
        }
        return listNumerosConvertidosParaString;
    }

    public static List<String> ordenaLista(List<String> arr, int digitoMaximo, int n){
        List<List<String>> listaDeListas = new ArrayList<>();
        for(int i = 0; i<10;i++){
            listaDeListas.add(new ArrayList<>());
        }

        List<String> newArray = new ArrayList<>();
        for(String s: arr){
            switch(s.charAt(s.length()-n)){
                case '0': listaDeListas.get(0).add(s);
                    break;
                case '1': listaDeListas.get(1).add(s);
                    break;
                case '2': listaDeListas.get(2).add(s);
                    break;
                case '3': listaDeListas.get(3).add(s);
                    break;
                case '4': listaDeListas.get(4).add(s);
                    break;
                case '5': listaDeListas.get(5).add(s);
                    break;
                case '6': listaDeListas.get(6).add(s);
                    break;
                case '7': listaDeListas.get(7).add(s);
                    break;
                case '8': listaDeListas.get(8).add(s);
                    break;
                case '9': listaDeListas.get(9).add(s);
                    break;
            }
        }
        for(List<String> list: listaDeListas){
            for(String s: list){
                newArray.add(s);
            }
        }

        listaDeListas = new ArrayList<>();
        for(int i = 0; i<10;i++){
            listaDeListas.add(new ArrayList<>());
        }

        return (n<digitoMaximo)
                ? ordenaLista(newArray, digitoMaximo, n+1)
                : newArray;
    }
    public static void radixSort(int iArr[]){

        int maiorDigito = 0;
        for (int num: iArr) {
            if(countDigits(num) > maiorDigito)
                maiorDigito = countDigits(num);
            else
                continue;
        }
        List<String> arrString = setZerosAEsquerdaEConverteParaString(maiorDigito, iArr);

        System.out.println(ordenaLista(arrString, maiorDigito, 1));
    }
    public static void main(String[] args){
        int iArr[] = {16223, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8};

        radixSort(iArr);

        for(int i : iArr){
            System.out.println(i + " ");
        }
    }
}
