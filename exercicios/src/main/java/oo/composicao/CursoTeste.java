package oo.composicao;

public class CursoTeste {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Pedro");

        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("Web 2023");
        Curso curso3 = new Curso("Reactive Native");

        curso1.addAluno(aluno1);
        curso1.addAluno(aluno2);

        curso2.addAluno(aluno1);
        curso2.addAluno(aluno3);

        aluno1.addCurso(curso3);
        aluno2.addCurso(curso3);
        aluno3.addCurso(curso3);

        curso3.alunos.forEach(aluno -> System.out.println(aluno.nome));

        System.out.println(aluno1.cursos.toString());

        Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Completo");

        if(cursoEncontrado != null){
            System.out.println(cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);
        }


    }
}
