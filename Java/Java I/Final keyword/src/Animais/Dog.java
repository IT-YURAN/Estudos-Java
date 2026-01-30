package Animais;

public class Dog extends Animal{

    private int distanciaPreferida;

    public int getDistanciaPreferida() {
        return distanciaPreferida;
    }

    public void setDistanciaPreferida(int distanciaPreferida) {
        this.distanciaPreferida = distanciaPreferida;
    }
    public void latir(){
        System.out.println("woof");
    }


//    public void comer() {
//        System.out.println("Cao comendo!");
//    }

    //Metodos finais nao podem ser usados por outras classes
}
