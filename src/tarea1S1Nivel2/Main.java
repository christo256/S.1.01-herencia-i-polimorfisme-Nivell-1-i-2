package tarea1S1Nivel2;

public class Main {
    public static void main(String[] args) {

        Smartphone mySmarthphone = new Smartphone("Apple", "Iphone 16");

        System.out.println("Phone Brand: " + mySmarthphone.getBrand() + ". Model: " + mySmarthphone.getModel());
        mySmarthphone.call("688302679");
        mySmarthphone.photograph();
        mySmarthphone.alarm();


    }
}
