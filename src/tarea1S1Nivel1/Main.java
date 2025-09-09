package tarea1S1Nivel1;

public class Main {
    public static void main(String[] args) {

        Wind trumpet = new Wind("Trumpet", 600);

        Stringed harp = new Stringed("Harp", 1500);

        Percussion drum = new Percussion("Drum", 400);




        System.out.println(trumpet.toString());
        trumpet.play();

        System.out.println(harp.toString());
        harp.play();

        System.out.println(drum.toString());
        drum.play();
    }
}
