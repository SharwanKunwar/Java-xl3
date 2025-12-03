package OOPs.Abstraction;

public class Code01 {
    static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sayHello();
        d1.sleep();
        Cat c1 = new Cat();
        c1.sayBye();
        c1.sleep();
    }
}

abstract class Animal{
    abstract void sayHello();
    abstract void sayBye();
    void sleep(){
        System.out.println(" sleeping ..............");
    }
}

class Dog extends Animal{

    @Override
    void sayHello() {
        System.out.println("vahou vahou hello!!!");
    }

    @Override
    void sayBye() {
        System.out.println("vahou vahou Bye!!!");
    }

    @Override
    void sleep(){
        System.out.println("wowowowowowowowo");
    }
}

class Cat extends Animal{

    @Override
    void sayHello(){
        System.out.println("mewmew Hey");
    }
    @Override
    void sayBye() {
        System.out.println("MewMew Bye!!!");
    }

    @Override
    void sleep() {
        super.sleep();
    }
}