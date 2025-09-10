package tarea2S1Nivel1;

public class Car {
    public static final String brand = "Ford";
    public static String model;
    public final int horses;

    public Car(String model, int horses) {
        if (model == null || model.trim().isEmpty()) {
            throw new IllegalArgumentException("Model cannot be empty.");
        }
        if (horses <= 0) {
            throw new IllegalArgumentException("Horses must be greater than zero.");
        }

        Car.model = model;
        this.horses = horses;
    }

    public static String getBrand() {
        return brand;
    }

    public static String getModel() {
        return model;
    }

    public int getHorses() {
        return horses;
    }

    public static void brake() {
        System.out.println("The vehicle is braking.");
    }

    public void accelerate() {
        System.out.println("The vehicle is accelerating.");
    }

    @Override
    public String toString() {
        return "Brand: " + getBrand() + ", Model: " + getModel() + "," +
                " horses: " + getHorses();
    }
}
