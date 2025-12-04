package OOPs.Polymorphism;

abstract class Camera{
    protected String model;
    protected String cameraName;

    void cameraDetailsSet(String model, String cameraName){
        this.model = model;
        this.cameraName = cameraName;
    }

    void click(String type){
        System.out.println(cameraName+" clicking..."+type);
    }

    void display(){
        System.out.println("Camera Displaying images or videos ...");
    }
}

public class Phone extends Camera {
    String name;
    String color;
    int price;

    Phone(String name, String color, int price){
        this.name = name;
        this.color = color;
        this.price = price;
    }
    void browse(String url){
        System.out.println(url+" Open.");
    }
    void type(String str){
        System.out.println(str+" This is String value");
    }
    void type(int val){
        System.out.println(val+" This is integer value");
    }

}

class SmartPhone extends Phone {

    SmartPhone(String name, String color, int price) {
        super(name, color, price);
    }
    void videoCall(){
        System.out.println("Video calling...");
    }
}