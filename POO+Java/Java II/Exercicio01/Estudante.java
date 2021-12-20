import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class Estudante {

    private String nome;
    private LocalDate dataNascimento;
    private Integer matricula;
    private String serie;

    public Estudante(String nome, LocalDate dataNascimento, Integer matricula, String serie) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.matricula = matricula;
        this.serie = serie;
    }
}
