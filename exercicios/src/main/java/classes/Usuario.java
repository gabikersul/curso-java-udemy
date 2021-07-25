package classes;

import java.util.Objects;

public class Usuario {

    String nome;
    String email;


    public boolean equals(Object objeto){
        if(objeto instanceof Usuario) {
            Usuario outro = (Usuario) objeto;
            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);

            return nomeIgual && emailIgual;
        }
        return false;
    }

    // O hashcode será abordado em outra aula
    @Override
    public int hashCode() {
        return Objects.hash(nome, email);
    }
}
