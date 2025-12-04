package OOPs.Inheritance;

public class Human {
    String name;
    int age;
    String address;
    String gmail;
    String gender;
    String passion;
    String language;
    long[] Numbers = new long[2];

    Human(String name, int age, String address, String gmail, String gender,String passion, String language, long[] Numbers){
        this.name = name;
        this.age = age;
        this.address = address;
        this.gmail = gmail;
        this.gender = gender;
        this.passion = passion;
        this.language = language;
        for(int i=0; i< Numbers.length; i++){
            this.Numbers[i] = Numbers[i];
        }
    }

    void intro(){
        System.out.println("My name is "+name+" i live in "+address+"\ni am "+age+" years old"+" and my gmail is "+gmail);
    }
    void speak(){
        System.out.println(name+" Speaking...");
    }
    void walk(){
        System.out.println(name+" walking...");
    }
    void MyContactList(){
        System.out.print("My contact list: ");
        for(long val: Numbers){
            System.out.print(val+" ");
        }
    }

}

class Male extends Human{

    Male(String name, int age, String address, String gmail, String gender, String passion, String language, long[] Numbers) {
        super(name, age, address, gmail, gender, passion, language, Numbers);
    }
}
