import java.time.LocalDate;

public class Diretor extends FuncionarioCLT {

    private static Double salarioBase = 15000.00;
    private static Double participacaoNosLucros = 0.03;

    public Diretor(String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
    }

    public void pagarSalario(Double valorDoLucro) {
        this.setDataDoUltimoPagamento(LocalDate.now());
        this.setValorDoUltimoSalarioPago(salarioBase + (valorDoLucro*participacaoNosLucros));
        System.out.println("Valor pago @ Diretor@ " + this.getNome() + " " + this.getSobrenome() + " em " + this.getDataDoUltimoPagamento() + ": "+ this.getValorDoUltimoSalarioPago());
    }
}
