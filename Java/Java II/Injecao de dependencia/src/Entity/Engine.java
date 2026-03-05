package Entity;

import Interfaces.Engineconfig;

public class Engine implements Engineconfig {
    private final String name;
    private final int maxRPM;

    public Engine(int maxRPM, String name) {
        this.maxRPM = maxRPM;
        this.name = name;
    }

    public int getMaxRPM() {
        return maxRPM;
    }

    @Override
    public void start() {
        System.out.println("Engine started");
    }

    @Override
    public void stop() {
        System.out.println("Engine stopped");
    }

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                ", maxRPM=" + maxRPM +
                '}';
    }
}
