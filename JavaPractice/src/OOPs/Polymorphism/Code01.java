package OOPs.Polymorphism;

public class Code01 {
    static void main(String[] args) {

        Phone p1 = new Phone("redmi note 13 pro", "sky-blue", 50000);
        p1.cameraDetailsSet("RTX45", "Canon");

        SmartPhone s1 = new SmartPhone("iphone","black",100000);
        s1.cameraDetailsSet("M85","Nicon");
        s1.click("video");
        s1.browse("www.microsoft.com");
        s1.display();
        s1.type("Hello i am sharwan");
        s1.type(12);





    }
}
