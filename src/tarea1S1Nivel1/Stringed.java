package tarea1S1Nivel1;

public class Stringed extends Tools{

    public Stringed(String name, double price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("A string instrument is being played");

    }

    @Override
    public String toString() {
        return "Stringed instrument " + super.toString();
    }
}
