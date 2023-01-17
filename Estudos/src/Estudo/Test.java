package Estudo;

public class Test {

    public static void main(String[] args){
        Conta cc = new Conta(111, 222, 1000);

        cc.setAgencia(40028922);
        cc.setNumero(1388);
        cc.deposito(500);

        System.out.println( cc.getSaldo(0));

        Conta occupancy = new Conta(111, 222, 1000);

        occupancy.retirar(100);

        System.out.println(occupancy.getSaldo((0)));

    }

}
