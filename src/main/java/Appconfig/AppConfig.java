package Appconfig;

import Driver.Driver;
import Transport.Bus;
import Transport.Car;
import Transport.Pickup;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name = "car")
    public Car getCarBean(){
        return new Car("BMW");
    }
    @Bean(name = "Pickup")
    public Pickup getPickupBean(){
        return new Pickup("Nissan");
    }
    @Bean(name = "Bus")
    public Bus getBusBean(){
        return new Bus("Scool");
    }
    @Bean(name = "driver")
    public Driver getDriver() {
        return new Driver("Вася");
    }
    @Bean(name = "driver1")
    public Driver getDriver1(){
        return new Driver("Данил");
    }
    @Bean(name = "driver2")
    public Driver getDriver2(){
        return new Driver("Иван");
    }
}
