package tarea2S1Nivel1;

public class Main {
public static void main(String[] args) {

    Car car1 = new Car("Mustang", 400);
    Car car2 = new Car("Explorer", 350);
    System.out.println(car1);

    car1.accelerate();
    Car.brake();

    System.out.println(car2);

    car2.accelerate();
    Car.brake();


}
}
