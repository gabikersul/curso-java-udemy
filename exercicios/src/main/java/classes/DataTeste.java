package classes;

public class DataTeste {
    public static void main(String[] args) {

        Data data1 = new Data(05,12,2020);
        

        Data data2 = new Data();

    //    data2.dia = 10;
    //    data2.mes = 12;
    //    data2.ano = 1997;

        System.out.println(data1.dataFormatada());
        System.out.println(data2.dataFormatada());
    }
}
