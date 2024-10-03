//Made by: Diego Alejandro Ocampo Madroñero
class Animal{
    private String name;

    public Animal(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Animal - [Name: " + name + "]";
    }
}

class Mammal extends Animal{

    public Mammal(String name){
        super(name);
    }

    @Override
    public String toString(){
        return "Mammal - [" + super.toString() + "]";
    }
}

class Cat extends Mammal{

    public Cat(String name){
        super(name);
    }

    public void greets(){
        System.out.println("Meow");
    }

    @Override
    public String toString(){
        greets();
        return "Cat - [" + super.toString() + "Greets: Meow]";
    }
}

class Dog extends Mammal{

    public Dog(String name){
        super(name);
    }

    public void greets(){
        System.out.println("Woof");
    }

    public void greets(Dog another){
        System.out.println("Woooooooof");
    }

    @Override
    public String toString(){
        greets();
        return "Dog - [" + super.toString() + "Greets: Woof]";
    }
}
public class Fauna {
    public static void main(String[] args){
        Animal animal = new Animal("Animal");
        System.out.println(animal.toString());

        Mammal mammal = new Mammal("Mammal");
        System.out.println(mammal.toString());

        Cat cat = new Cat("Cat");
        System.out.println(cat.toString());

        Dog dog = new Dog("Dog");
        System.out.println(dog.toString());
        dog.greets(dog);
    }
}
