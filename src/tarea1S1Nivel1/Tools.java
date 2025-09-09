package tarea1S1Nivel1;

public abstract class Tools {

    private String name;
    private double price;

    public Tools(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }

    public abstract void play();

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", price=" + price +
                '€';
    }
}
