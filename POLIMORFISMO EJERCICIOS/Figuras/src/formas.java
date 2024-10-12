class FiguraGeometrica{
    private int valor1;

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public double getArea(){
        return 0;
    }

    public double getPerimetro(){
        return 0;
    }
}

class Circulo extends FiguraGeometrica{
    @Override
    public double getArea(){
        return Math.PI * Math.pow(getValor1(), 2);
    }

    @Override
    public double getPerimetro(){
        return 2 * Math.PI * getValor1();
    }
}

class Cuadrado extends FiguraGeometrica{
    @Override
    public double getArea(){
        return Math.pow(getValor1(), 2);
    }

    @Override
    public double getPerimetro(){
        return 4 * getValor1();
    }
}

class Cubo extends Cuadrado{
    @Override
    public double getArea(){
        return 6 * Math.pow(getValor1(), 2);
    }
}

class Rectangunlo extends FiguraGeometrica{
    private int valor2;

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    @Override
    public double getArea(){
        return getValor1() * getValor2();
    }

    @Override
    public double getPerimetro(){
        return 2 * (getValor1() + getValor2());
    }
}

class Triangulo extends FiguraGeometrica{
    private int valor2;

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    @Override
    public double getArea(){
        return (getValor1() * getValor2()) / 2;
    }

    @Override
    public double getPerimetro(){
        return getValor1() + getValor2() + Math.sqrt(Math.pow(getValor1(), 2) + Math.pow(getValor2(), 2));
    }
}

public class formas{
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.setValor1(5);
        System.out.println("El area del circulo es: " + circulo.getArea());
        System.out.println("El perimetro del circulo es: " + circulo.getPerimetro());
        System.err.println("");

        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setValor1(5);
        System.out.println("El area del cuadrado es: " + cuadrado.getArea());
        System.out.println("El perimetro del cuadrado es: " + cuadrado.getPerimetro());
        System.err.println("");

        Cubo cubo = new Cubo();
        cubo.setValor1(5);
        System.out.println("El area del cubo es: " + cubo.getArea());
        System.out.println("El perimetro del cubo es: " + cubo.getPerimetro());
        System.err.println("");

        Rectangunlo rectangunlo = new Rectangunlo();
        rectangunlo.setValor1(5);
        rectangunlo.setValor2(10);
        System.out.println("El area del rectangunlo es: " + rectangunlo.getArea());
        System.out.println("El perimetro del rectangunlo es: " + rectangunlo.getPerimetro());
        System.err.println("");

        Triangulo triangulo = new Triangulo();
        triangulo.setValor1(5);
        triangulo.setValor2(10);
        System.out.println("El area del triangulo es: " + triangulo.getArea());
        System.out.println("El perimetro del triangulo es: " + triangulo.getPerimetro());
    }
}