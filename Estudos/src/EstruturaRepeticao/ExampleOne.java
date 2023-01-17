package EstruturaRepeticao;

public class ExampleOne {

    public static void main(String[] args){

        String names = "hedris;rocha;pereira";


        String[] dis = names.split(";");

        for (String d: dis){
            System.out.println(d);
        }



    }


}
