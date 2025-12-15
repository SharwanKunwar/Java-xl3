package OOPs.ClassAndObject;

public class Code02 {

    public static void main(String[] args) {
        Time t1 = new Time(2, 30, 33);
        Time t2 = new Time(6, 30, 36);

        Time result = t1.addTime(t2);
        result.displayTime();
    }
}
