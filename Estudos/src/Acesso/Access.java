package Acesso;

import java.util.ArrayList;
import java.util.List;

import static Acesso.RecordStock.recordStock;

public class Access {

    public static void main(String[] args){

        String name = "Stock.csv";
        String directory = "E:\\Projetos\\Estudos-java\\Estudos\\";
        String path =  directory + "\\" + name;

        List<String> counted = new ArrayList<>();
        counted.add("We are adding ball");
        counted.add("We are adding bicycle");
        counted.add("We are adding shirt");
        counted.add("We are adding cap");
        counted.add("We are adding glass");

        recordStock(name, path, counted);



    }

}
