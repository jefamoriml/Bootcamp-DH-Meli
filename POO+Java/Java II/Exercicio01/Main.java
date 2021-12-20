import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Estudante aluno = new Estudante("Jose", LocalDate.now(), 01, "Terceiro-Ano");
        Estudante aluno1 = new Estudante("Maria", LocalDate.now(), 02, "Terceiro-Ano");


        Disciplina matematica = new Disciplina("Matematica", "220 Horas");
        Disciplina portugues = new Disciplina("Portugues", "220 Horas");
        Disciplina ingles = new Disciplina("Inglês", "220 Horas");
        Disciplina quimica = new Disciplina("Química", "220 Horas");
        Disciplina fisica = new Disciplina("Física", "220 Horas");


        Turma turma = new Turma("Terceiro-Ano", "A");

        turma.adicionarDisciplina(matematica);
        turma.adicionarDisciplina(portugues);
        turma.adicionarDisciplina(ingles);
        turma.adicionarEstudante(aluno);
        turma.adicionarEstudante(aluno1);
    }

}

