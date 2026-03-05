import Entity.Car;
import Entity.Engine;

public class Main {
    public static void main(String[] args) {

        Engine engine=new Engine(8000,"RB25");
        Engine engine1=new Engine(9000,"GD6");

        Car car=new Car("Nissan", "sedan", 2023, engine); //injeção via construtor

        car.drive();
        System.out.println(car.getEngine());

        Car car1=new Car("Toyota", "pickup", 2023, null);
        car1.setEngine(engine1); //Injeção via setter
        car1.drive();
        System.out.println(car1.getEngine());
    }
}
