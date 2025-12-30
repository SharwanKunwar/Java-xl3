package OOPs.Polymorphism.Pet;

import java.util.Scanner;

public class Code01 {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int balance = 100;

        DomesticAnimal Huskey = new Dog("huskey","white",10);
        DomesticAnimal bull = new Dog("Bull","black",20);
        DomesticAnimal Germansharped = new Dog("Germansharped","gray",30);

        DomesticAnimal[] animals = {Huskey, bull, Germansharped};

        System.out.println("** Welcome to Our Pet Platform **");
        System.out.println("\nWe have owner friendly pets: ");
        System.out.println("\n1. Check out pet details.\n2. Buy pet.");
        System.out.println("--------------------------");
        System.out.print("Select : ");
        int option = scanner.nextByte();

        if(option == 1){

            int count = 1;
            for(DomesticAnimal item: animals){
                System.out.println(count+". "+item.name);
                count++;
            }
            System.out.println("----------------------------------------");
            System.out.print("Select pet Number: ");
            int op = scanner.nextInt();


            switch (op){
                case 1:
                    System.out.println("--------------------------");
                    Huskey.getDetails();
                    System.out.println("--------------------------");
                    break;

                case 2:
                    System.out.println("--------------------------");
                    bull.getDetails();
                    System.out.println("--------------------------");
                    break;

                case 3:
                    System.out.println("--------------------------");
                    Germansharped.getDetails();
                    System.out.println("--------------------------");
                    break;

                default:
                    System.out.println("Invalid input!!! ");

            }

        }else{
            System.out.println("--------------------------");
            int count = 1;
            for(DomesticAnimal item: animals){
                System.out.println(count+". "+item.name);
                count++;
            }
            System.out.println("--------------------------");
            System.out.print("Select : ");
            int buy = scanner.nextInt();
            switch (buy){
                case 1:
                    System.out.println("------------------------------------------------");
                    balance -= Huskey.price;
                    System.out.println("Congratulation you got "+Huskey.name+" as a pet.");
                    System.out.println("And now your total balance is : "+balance);
                    System.out.println("------------------------------------------------");
                    break;

                case 2:
                    System.out.println("------------------------------------------------");
                    balance -= bull.price;
                    System.out.println("Congratulation you got "+bull.name+" as a pet.");
                    System.out.println("And now your total balance is : "+balance);
                    System.out.println("------------------------------------------------");
                    break;

                case 3:
                    System.out.println("------------------------------------------------");
                    balance -= Germansharped.price;
                    System.out.println("Congratulation you got "+Germansharped.name+" as a pet.");
                    System.out.println("And now your total balance is : "+balance);
                    System.out.println("------------------------------------------------");
                    break;

                default:
                    System.out.println("invalid input!!");
                    break;

            }
        }













    }
}
