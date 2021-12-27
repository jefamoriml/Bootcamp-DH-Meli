import java.time.LocalDate;

public class Gerente extends FuncionarioCLT{

    private static Double pisoSalarial = 6000.00;
    private static Double bonificacao = 0.125;
    private boolean bateuAMeta = false;
    private static Integer jornadaDeTrabalho = 36;


    public Gerente(String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
    }

    public void pagarSalario(boolean bateuAMeta) {
        this.bateuAMeta = bateuAMeta;
        this.setDataDoUltimoPagamento(LocalDate.now());
        if(this.bateuAMeta)
            this.setValorDoUltimoSalarioPago(pisoSalarial + (pisoSalarial*bonificacao));
        else
            this.setValorDoUltimoSalarioPago(pisoSalarial);
        System.out.println("Valor pago Gerente " + this.getNome() + " " + this.getSobrenome() + " em " + this.getDataDoUltimoPagamento() + ": "+ this.getValorDoUltimoSalarioPago());
    }
}
