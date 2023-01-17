package Acesso;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class RecordStock {

    public static void recordStock(String name, String path, List<String> counted){
        FileWriter stream;
        PrintWriter print;

        try{
            stream = new FileWriter(path);
            print = new PrintWriter(stream);

            for (String line: counted){
                print.println(line);
            }
            print.close();
            stream.close();



            System.out.println("The file has been saved\n" + path);


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
