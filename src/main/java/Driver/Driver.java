package Driver;

import Transport.Car;
import org.springframework.beans.factory.annotation.Autowired;

public class Driver {
    String name;
    @Autowired
    Car transport;

    public Driver(String name) {
        this.name=name;
    }
    public Car getTransport() {
        return transport;
    }
    public void startCar(){
        System.out.println(getName()+" Сел в машину " + getTransport());
    }

    public String getName() {
        return name;
    }
@Autowired
    public void setTransport(Car transport) {
        this.transport = transport;
    }

    @Override
    public String toString() {
        return "Driver{" + name +
                " transport=" + transport +
                '}';
    }

}
