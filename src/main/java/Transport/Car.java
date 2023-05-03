package Transport;

public class Car extends Transport {
    String model;

    public Car(String model) {
        super(model);
    }

    @Override
    void start() {

    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }
}
