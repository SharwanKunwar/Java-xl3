package OOPs.FunnyExample;

public class Code01 {
    static void main(String[] args) {
        Person p1 = new Person();
        p1.leftGeda = 1;
        p1.rightGeda = 1;
        int result = p1.say();
        if(result == 0){

        } else if (result == 1) {
            p1.rightGeda += 1;
        }

        System.out.println("left geda "+p1.leftGeda);
        System.out.println("right geda "+p1.rightGeda);

    }
}
