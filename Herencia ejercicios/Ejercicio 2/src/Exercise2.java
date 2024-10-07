import java.util.Scanner;

class Name{
    protected  String name;
    protected  String lastName1;
    protected  String lastName2;

    public Name(String name, String lastName1, String lastName2){
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
    }

    public void askName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        System.out.println("Enter your first last name: ");
        lastName1 = sc.nextLine();
        System.out.println("Enter your second last name: ");
        lastName2 = sc.nextLine();
    }

    public void show(){
        System.out.println("Name: " + name + " " + lastName1 + " " + lastName2);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName1() {
        return lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public String getLastName2() {
        return lastName2;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }
}

class Address extends Name{
    private String street;
    private String city;
    private String state;
    private String postalCode;

    public Address(String name, String lastName1, String lastName2, String street, String city, String state, String postalCode){
        super(name, lastName1, lastName2);
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }

    public void newAddress(String street, String city, String state, String postalCode){
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }

    public void newName(String name, String lastName1, String lastName2){
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
    }

    @Override
    public void show(){
        super.show();
        System.out.println("Street: " + street);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Postal code: " + postalCode);
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}

public class Exercise2 {
    public static void main(String[] args) {
        Address address = new Address("Miguel", "Hernandez", "Gonzalez", "Calle 123", "Cali", "Valle del Cauca", "12345");

        System.out.println("Current address: ");
        address.show();

        System.out.println("\nNew information: ");
        address.askName();
        address.newAddress("Calle 456", "Bogota", "Cundinamarca", "54321");

        System.out.println("\nUpdated information: "); 
        address.show();
    }
}