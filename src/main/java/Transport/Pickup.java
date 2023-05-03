package Transport;

public class Pickup extends Transport{
    String model;
    public Pickup(String model) {
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
        return "Pickup{" +
                "model='" + model + '\'' +
                '}';
    }
}
