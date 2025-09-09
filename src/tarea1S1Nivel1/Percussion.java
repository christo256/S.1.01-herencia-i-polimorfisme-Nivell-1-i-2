package tarea1S1Nivel1;

public class Percussion extends Tools {
    public Percussion(String name, double price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("A percussion instrument is being played");
    }

    @Override
    public String toString() {
        return "Percussion instrument" + super.toString();
    }
}
