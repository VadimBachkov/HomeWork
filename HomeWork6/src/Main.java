public class Main {

    public static void main(String[] args) {
        //Задание с животными

        Cat cat = new Cat("Bob",2);
        Dog dog = new Dog("King", 13);
        Rat rat = new Rat("Dirty", 1);

        cat.makeNoise();
        dog.makeNoise();
        rat.makeNoise();

        //Задание с интсрументами

        Instrument [] instrument = new Instrument[3];
        instrument[0] = new  Guitar(6);
        instrument[1] = new Drum(838);
        instrument[2] = new Tuba(400);

        for (Instrument i : instrument){
            i.play();
        }
    }
}
