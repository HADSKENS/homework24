package Transport;

abstract class Transport {
    String model;
    public Transport(String model) {
        this.model= model;
    }

    abstract void start();
}
