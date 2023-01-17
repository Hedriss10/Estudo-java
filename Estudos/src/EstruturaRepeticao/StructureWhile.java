package EstruturaRepeticao;

public class StructureWhile {

    public static void main (String[] args){

        int register = 0;
        int numberProduct = 5;

//        ///
//        while (register < numberProduct){
//            register++;
//            System.out.println("Number Product" +  register  + "was Register");
//        }
//        ///

//        do {
//            register++;
//            System.out.println("The cashier registered the product" + register);
//        }while (register < numberProduct);

        for (int i = 0; i < numberProduct; i++){
            System.out.println("The cashier registered the product" + register);
        }

    }

}
