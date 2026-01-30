package Animais;

public class Animal { // Nao faz sentido colocar final nessa classe pois ela é só um 'molde'

    private String name;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public final void comer(){
        System.out.println(" nham nham nham...");
    }
}
