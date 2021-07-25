package classes;

public class Data {

    int dia;
    int mes;
    int ano;


    Data(){
      //  dia = 01;
      //  mes = 01;
      //  ano = 1970;
        this(01, 01, 1970); //posso usar como construtor
    }

    Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String dataFormatada(){
        return String.format("%d/%d/%d",dia,mes,ano);
    }
}
