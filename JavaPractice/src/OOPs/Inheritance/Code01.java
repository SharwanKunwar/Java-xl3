package OOPs.Inheritance;

public class Code01 {
    static void main(String[] args) {
//        Vehicle car = new Vehicle("Supra", "toyota", "mk4", "white", 100000000);
//        String car_name = car.getName();
//        System.out.println(car_name);

        Car c1 = new Car();
        c1.setter("bmw", "toyota", "mk4", "white", 100000000);
        String n = c1.getName();
        c1.playMusic();
        c1.name = "whoooooo";
        System.out.println(c1.name);
        System.out.println(n);

        moto m1 = new moto();
        m1.setter("bikeMe", "toyota", "mk4", "white", 100000000);
        m1.horn();
    }
}
