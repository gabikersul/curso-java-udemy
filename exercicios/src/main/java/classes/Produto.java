package classes;

public class Produto {

     String nome;
     double preco;
     static double desconto = 0.25;


     Produto(String nome){
          this.nome = nome;
     }

     Produto(String nome, double preco){
          this.nome = nome;
          this.preco = preco;
     }

     Produto(){

     }

     double calculaDesconto(){
          return preco * (1 - desconto);
     }
}
