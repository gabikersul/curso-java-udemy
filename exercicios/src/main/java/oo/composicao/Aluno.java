package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    final String nome;
    final List<Curso> cursos = new ArrayList<>();

    Aluno(String nome){
        this.nome = nome;
    }

    void addCurso(Curso curso){
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    Curso obterCursoPorNome(String nomeCurso){
        for(Curso curso: cursos){
            if(curso.nome.equalsIgnoreCase(nomeCurso)){
                return curso;
            }
        }
        return null;
    }

    public String toString(){
        return nome;
    }


}
