//Made by: Diego Alejandro Ocampo Madroñero
class Shape{
    private String color = "red";
    private boolean filled = true;

    public Shape(){
    }

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    @Override
    public String toString(){
        return "Shape - [Color: " + color + ", Filled: " + filled + "]";
    }
}

class Circle extends Shape{
    private double radius = 2.0;

    public Circle(){
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString(){
        return "Circle - ["+ super.toString()+ "Radius: " + radius + "]";
    }
}

class Rectangle extends Shape{
    private double width = 3.0;
    private double length = 4.0;

    public Rectangle(){
    }

    public Rectangle(double width,double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getArea(){
        return width * length;
    }

    public double getPerimeter(){
        return 2 * (width + length);
    }

    @Override
    public String toString(){
        return "Rectangle - [" + super.toString()+ "Width: " + width + ", Length: " + length +"]";
    }
}

class Square extends Rectangle{
    private double side;

    public Square(){
    }

    public Square(double side){
        this.side = side;
    }

    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
        this.side = side;
    }

    public double getSide(){
        return side;
    }

    public void setSide(double side){
        this.side = side;
        super.setWidth(side);
        super.setLength(side);
        }

    @Override
    public void setWidth(double side){
        this.side = side;
        super.setWidth(side);
        super.setLength(side);
        }

    @Override
    public void setLength(double side){
        this.side = side;
        super.setWidth(side);
        super.setLength(side);
        }

    @Override
        public String toString(){
        return "Square - ["+ super.toString() + "]";
    }
}

public class Forms{
    public static void main(String[] args){
        Shape shape = new Shape();
        System.out.println(shape);

        Circle circle = new Circle();
        System.out.println(circle);

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        Square square = new Square();
        square.setSide(5.0);
        System.out.println(square);
    }
}