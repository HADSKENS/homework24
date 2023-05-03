package Transport;

public class Bus extends Transport {
    String model;

    public Bus(String model) {
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
        return "Bus{" +
                "model='" + model + '\'' +
                '}';
    }
}
