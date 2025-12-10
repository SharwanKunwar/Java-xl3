package OOPs.ClassAndObject;

public class Code01 {
    static void main(String[] args) {
        Distance d1 = new Distance(5,8);
        Distance d2 = new Distance(6, 10);
        Distance result = d1.addDistance(d2);
        result.displayDistance();
    }
}
