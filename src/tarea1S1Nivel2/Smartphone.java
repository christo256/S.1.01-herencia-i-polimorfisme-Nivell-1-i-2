package tarea1S1Nivel2;

public class Smartphone extends Phone implements Clock, Camera {

    public Smartphone(String brand, String model) {
        super(brand, model);
    }


    @Override
    public void photograph() {
        System.out.println("Taking photo");
    }

    @Override
    public void alarm() {
        System.out.println("Alarm is ringing");
    }
}
