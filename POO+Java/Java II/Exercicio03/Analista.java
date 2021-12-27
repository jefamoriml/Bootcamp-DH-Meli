import java.time.LocalDate;

public class Analista extends FuncionarioCLT{

    private static Double pisoSalarial = 4000.00;
    private static Double bonificacao = 0.08;
    private boolean bateuAMeta = false;
    private static boolean temDSR = true;
    private static Integer jornadaDeTrabalho = 40;

    public Analista(String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
    }

    public void pagarSalario(boolean bateuAMeta) {
        this.bateuAMeta = bateuAMeta;
        this.setDataDoUltimoPagamento(LocalDate.now());
        if(this.bateuAMeta)
            this.setValorDoUltimoSalarioPago(pisoSalarial + (pisoSalarial*bonificacao));
        else
            this.setValorDoUltimoSalarioPago(pisoSalarial);
        System.out.println("Valor pago @ Analist@ " + this.getNome() + " " + this.getSobrenome() + " em " + this.getDataDoUltimoPagamento() + ": "+ this.getValorDoUltimoSalarioPago());
    }
}
