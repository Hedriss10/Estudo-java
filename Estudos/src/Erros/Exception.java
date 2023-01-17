package Erros;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Exception {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("E:\\Projetos\\Estudos-java\\Estudos\\nota.txt");

        PrintWriter print =  new PrintWriter(fw);
        print.println("Maça =  R$ 4,20");
        print.println("Morango =  R$ 4,20");
        print.println("Melancia =  R$ 4,20");
        print.println("Total  =  R$ 16,60");
        print.close();
        fw.close();

    }

}
