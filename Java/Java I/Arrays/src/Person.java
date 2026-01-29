public class Person {

    private String first_name;
    private String last_name;
    private String address;

    public Person(String first_name, String last_name, String address) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getAddress() {
        return address;
    }

    public void imprimmir(){
        System.out.println(this.first_name);
    }
}
