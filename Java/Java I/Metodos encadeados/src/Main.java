public class Main {

    public static void main(String[] args) {

        String nome ="yuran";
        nome= nome.concat(" monjane");

        nome=nome.concat(" monjane").
                toUpperCase().
                trim();
        System.out.println(nome);
    }
}
