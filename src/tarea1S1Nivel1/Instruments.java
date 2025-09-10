package tarea1S1Nivel1;

public abstract class Instruments {

    private String name;
    private double price;

    public Instruments(String name, double price)
            throws IllegalArgumentException {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(" The name cannot be empty.");
        }
        if (price <= 0) {
            throw new IllegalArgumentException(" The price cannot be 0 or less.");
        }
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
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
