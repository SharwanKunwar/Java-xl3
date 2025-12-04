package OOPs.Inheritance;

public class Code01 {
    static void main(String[] args) {

//        Human H1 = new Human("Sharwan jung kunwar",22,"Bhaktapur-bode","sharwankunwar07@gmail.com","Male","Software Engineer","Nepali", new long[]{9814631974L, 9763290022L});
//        H1.intro();
//        H1.MyContactList();

        Male m1 = new Male("Parbesh rawal",23,"Bhaktapur-bode","parbeshRawal07@gmail.com","Male","Software Engineer","Nepali", new long[]{9814631974L, 9763290022L});
        m1.intro();

        m1.speak();
        m1.walk();
    }

}
