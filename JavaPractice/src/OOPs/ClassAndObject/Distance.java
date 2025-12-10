package OOPs.ClassAndObject;

public class Distance {
    int feet;
    int inch;

    Distance(int feet, int inch){
        this.feet = feet;
        this.inch = inch;
    }
    Distance addDistance(Distance d2){
        int totalInches = (this.feet * 12 + this.inch) + (d2.feet*12+d2.inch);
        int newFeet = totalInches/12;
        int newInch = totalInches%12;

        return new Distance(newFeet, newInch);

    }
    void displayDistance(){
        System.out.println(feet + " feet " + inch + " inch");
    }
}
