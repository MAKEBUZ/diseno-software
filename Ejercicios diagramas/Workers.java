//Made by: Diego Alejandro Ocampo Madroñero
class Person {
    private String name;
    private String address;
    
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public String getAdress(){
        return address;
    }

    public void setAdress(String address){
        this.address = address;
    }

    @Override
    public String toString(){
        return "Person - [Name: " + name + ", Address: " + address + "]";
    }
}

class Student extends Person{
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee){
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram(){
        return program;
    }

    public void setProgram(String program){
        this.program = program;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public double getFee(){
        return fee;
    }

    public void setFee(double fee){
        this.fee = fee;
    }

    @Override
    public String toString(){
        return "Student - ["+super.toString() + ", Program: " + program + ", Year: " + year + ", Fee: " + fee + "]";
    }
}

class Staff extends Person{
    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay){
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool(){
        return school;
    }

    public void setSchool(String School){
        this.school = school;
    }

    public double getPay(){
        return pay;
    }

    public void setPay(double pay){
        this.pay = pay;
    }

    @Override
    public String toString(){
        return "Staff - [" + super.toString() + ", School: " + school + ", Pay: " + pay + "]";
    }
}

public class Workers {
    public static void main(String[] args) {
        Person person = new Person("Juan", "Calle 123");
        System.out.println(person);

        Student student = new Student("Pedro", "Calle 456", "Ingenieria", 2020, 1000);
        System.out.println(student);

        Staff staff = new Staff("Maria", "Calle 789", "Colegio", 2000);
        System.out.println(staff);
    }
}
