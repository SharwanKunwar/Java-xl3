package OOPs.Inheritance;

public class Vehicle {
    protected String name;
    protected String brand;
    protected String model;
    protected String color;
    protected long price;


    void setter(String name, String brand, String model, String color, long price){
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
    }
    String getName(){
        return name;
    }
}

class Car extends Vehicle{
    void playMusic(){
        System.out.println(name+" Playing Music...");
    }
}

class moto extends Vehicle{
    void horn(){
        System.out.println(name+" popopo");
    }
}
