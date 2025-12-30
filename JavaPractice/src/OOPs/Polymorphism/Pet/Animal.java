package OOPs.Polymorphism.Pet;



class DomesticAnimal{
    String name;
    String color;
    int price;


    DomesticAnimal(String name, String color,int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }
    void getAllName(){
        System.out.println("Name: "+this.name);
    }
    void getDetails(){
        System.out.println("Name: "+this.name);
        System.out.println("Color: "+this.color);
        System.out.println("Price: "+this.price);
    }


}



class Dog extends DomesticAnimal{

    Dog(String name, String color,int price) {
        super(name, color,price);
    }
}

class Cat extends DomesticAnimal{

    Cat(String name, String color, int price) {
        super(name, color,price);
    }
}