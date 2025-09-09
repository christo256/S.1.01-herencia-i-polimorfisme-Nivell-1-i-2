package tarea1S1Nivel1;

public class Wind extends Tools {

    public Wind(String name, double price){
        super(name,price);
    }

    @Override
    public void play() {
        System.out.println("A wind instrument is playing");
    }

    @Override
    public String  toString() {
        return "wind instrument: " + super.toString();
    }
}
