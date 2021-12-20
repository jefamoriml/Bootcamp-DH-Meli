import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Turma {

    private String serie;
    private String codigo;
    private Disciplina[] disciplinas = new Disciplina[5];
    private Estudante[] estudantes = new Estudante [2];

    public Turma(String serie, String codigo) {
        this.serie = serie;
        this.codigo = codigo;
    }

    public void adicionarDisciplina(Disciplina disciplina){

        int numDisciplina = 0;
        if (numDisciplina < disciplinas.length){
            disciplinas[numDisciplina] = disciplina;
            numDisciplina++;
        }
    }

    public void adicionarEstudante(Estudante estudante){
        int numEstudantes = 0;
        if(numEstudantes < estudantes.length){
            estudantes[numEstudantes] = estudante;
            numEstudantes++;
        }
    }
}
