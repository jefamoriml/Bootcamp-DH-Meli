import java.math.BigDecimal;

public class P02Exercicio02 {

    public static void main(String[] args) {
        BigDecimal valEmpX = new BigDecimal(1130000);
        double porcEmpX = 1.48;
        BigDecimal valEmpY = new BigDecimal(18400000);
        double porcEmpY = 0.32;

        int anoAtual = 2021;
        while (valEmpX.compareTo(valEmpY) < 0) {
            anoAtual++;

            valEmpX = valEmpX.add(new BigDecimal(porcEmpX).multiply(valEmpX));
            valEmpY = valEmpY.add(new BigDecimal(porcEmpY).multiply(valEmpY));

            System.out.println("Empresa X - 01/01/" + anoAtual + " - Valor da empresa: " + String.format("%.2f", valEmpX.doubleValue() / 1000000) + "m");
            System.out.println("Empresa Y - 01/01/" + anoAtual + " - Valor da empresa: " + String.format("%.2f", valEmpY.doubleValue() / 1000000) + "m\n");

        }
    }
}
