package tarea2S1Nivel1;

public class Car {
   public static final String brand = "Ford";
   public static String model;
   public final int horses;

    public Car(String model, int horses) {
        Car.model = model;
        this.horses = horses;

    }

    public static void brake(){
        System.out.println("The vehicle is braking.");
    }
    public void accelerate(){
        System.out.println("The vehicle is accelerating.");
    }

    @Override
    public String toString() {
        return "Model " + Car.model + "." +
                " horses: " + horses;
    }
}
