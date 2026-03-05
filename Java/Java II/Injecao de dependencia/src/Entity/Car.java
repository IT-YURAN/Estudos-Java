package Entity;

public class Car {
    private String make;
    private String model;
    private int year;
    private Engine engine; //Declarando uma dependência do motor

    // Constructor Injection: Dependency is provided through the constructor
    public Car(String make, String model, int year, Engine engine) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.engine = engine; //A dependência do motor é injetada traves do construtor
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void drive(){
        engine.start();
        System.out.println("Car driving");
    }
    public void stop(){
        engine.stop();
        System.out.println("Car stopped");
    }
}
