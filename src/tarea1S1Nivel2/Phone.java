package tarea1S1Nivel2;

public class Phone {

    private String brand;
    private String model;

    public Phone(String brand, String model) {
        if (brand == null || brand.trim().isEmpty()) {
            throw new IllegalArgumentException(" The mark cannot be empty.");
        }
        if (model == null || model.trim().isEmpty()) {
            throw new IllegalArgumentException(" The model cannot be empty.");
        }
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void call(String number) {
        if (number == null || number.trim().isEmpty()) {
            throw new IllegalArgumentException(" The phone number cannot be empty.");
        }
        System.out.println("Calling number: " + number);

    }
}
