import java.time.LocalDate;

public abstract class FuncionarioCLT extends Funcionario {

    private Double pisoSalarial;
    private LocalDate dataDoUltimoPagamento;
    private Double valorDoUltimoSalarioPago;

    public Double getpisoSalarial() {
        return pisoSalarial;
    }

    public void setpisoSalarial(Double pisoSalarial) {
        this.pisoSalarial = pisoSalarial;
    }

    public LocalDate getDataDoUltimoPagamento() {
        return dataDoUltimoPagamento;
    }

    public void setDataDoUltimoPagamento(LocalDate dataDoUltimoPagamento) {
        this.dataDoUltimoPagamento = dataDoUltimoPagamento;
    }

    public Double getValorDoUltimoSalarioPago() {
        return valorDoUltimoSalarioPago;
    }

    public void setValorDoUltimoSalarioPago(Double valorDoUltimoSalarioPago) {
        this.valorDoUltimoSalarioPago = valorDoUltimoSalarioPago;
    }

    public FuncionarioCLT(String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
    }
}
