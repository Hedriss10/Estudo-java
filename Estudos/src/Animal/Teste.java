package Animal;

public class Teste {

    public static void main (String[] args){
        Animal animal = new Animal();
        animal.setAlimentary("Every animal feeds");
        animal.setLocomotive("Every animal moves");

        Dog dog = new Dog();
        dog.setAlimentary("Dog be feeds");
        dog.setLocomotive("Dog be moves");
        dog.setBark("Dog be Bark Au Au");

        Animal poodle = new Dog();
        poodle.setLocomotive("Dog is walking because it has four legs");
        poodle.setAlimentary("Dog be eating");


    }

}
