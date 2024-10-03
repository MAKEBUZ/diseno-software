//Made by: Diego Alejandro Ocampo Madroñero
class Circle{
    private double radius = 1.0;
    private String color = "red";

    public Circle(){
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    
    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double setArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString(){
        return "Circulo - [El radio es igual a: " + radius + ", El Color es igual a: =" + color + "]";
    }
}


class Cylinder extends Circle{
    private double height = 1.0;

    public Cylinder(){
    }

    public Cylinder(double height){
        this.height = height;
    }

    public Cylinder(double height, double radius){
        super(radius);
        this.height = height;
    }

    public Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getVolume(){
        return setArea() * height;
    }

    @Override
    public String toString(){
        return "Cilindro - [La altura es igual a: " + height + ", " + super.toString() + "]";
    }
}

public class Circunference{
    public static void main(String[] args){
        Circle c = new Circle(2.0, "blue");
        System.out.println(c.toString());
        System.out.println("El Area: " + c.setArea());

        Cylinder cy = new Cylinder(3.0, 2.0, "green");
        System.out.println(cy.toString());
        System.out.println("El Volumen: " + cy.getVolume());
    }
}