import java.util.Scanner;

class Circle{
    public double radius;

    public Circle(){
        this.radius = 1.0;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public void askRadius(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        this.radius = sc.nextDouble();
    }

    public double area(){
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double circunference(){
        return 2 * Math.PI * this.radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}

class Cylinder extends Circle{
    public double height;

    public Cylinder(){
        super();
        this.height = 1.0;
    }

    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }

    public void askHeight(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of the cilinder: ");
        this.height = sc.nextDouble();
    }

    public double volume(){
        return super.area() * this.height;
    }

    @Override
    public double circunference(){
        return 2 * Math.PI * this.radius * (this.radius + this.height);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


}

class HollowCylinder extends Cylinder{
    public double innerRadius;

    public HollowCylinder(){
        super();
        this.innerRadius = 1.0;
    }

    public HollowCylinder(double radius, double height, double innerRadius){
        super(radius, height);
        this.innerRadius = innerRadius;
    }
    public void askInnerRadius(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the inner radius of the hollow cylinder: ");
        this.innerRadius = sc.nextDouble();
    }

    @Override
    public double volume(){
        return super.volume() - Math.PI * Math.pow(this.innerRadius, 2) * this.height;
    }

    @Override
    public double circunference(){
        return super.circunference() - 2 * Math.PI * this.innerRadius;
    }

    public double getInnerRadius() {
        return innerRadius;
    }

    public void setInnerRadius(double innerRadius) {
        this.innerRadius = innerRadius;
    }
}

public class Figure{
    public static void main(String[] args) {
        Circle circle = new Circle();

        circle.askRadius();
        System.out.println("Area of the circle: " + circle.area());
        System.out.println("Circunference of the circle: " + circle.circunference());
        System.out.println("");

        Cylinder cylinder = new Cylinder();

        cylinder.askRadius();
        cylinder.askHeight();
        System.out.println("Area of the cylinder: " + cylinder.area());
        System.out.println("Circunference of the cylinder: " + cylinder.circunference());
        System.out.println("");

        HollowCylinder hollowCylinder = new HollowCylinder();

        hollowCylinder.askRadius();
        hollowCylinder.askHeight();
        hollowCylinder.askInnerRadius();
        System.out.println("Area of the hollow cylinder: " + hollowCylinder.area());
        System.out.println("Circunference of the hollow cylinder: " + hollowCylinder.circunference());
        System.out.println("");
    }
}