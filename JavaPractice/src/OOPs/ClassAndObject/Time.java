package OOPs.ClassAndObject;

public class Time {
    int hour, minute, second; // stores time values

    // Displays time in H : M : S format
    void displayTime(){
        System.out.println(hour + "H : " + minute + "M : " + second + "S");
    }

    // Constructor to initialize time
    Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Adds two Time objects and returns a new Time object
    Time addTime(Time t){
        // Convert both times to total seconds
        int inOne = (this.hour * 3600 + this.minute * 60 + this.second)
                + (t.hour * 3600 + t.minute * 60 + t.second);

        // Extract hours (24-hour format)
        int newHour = (inOne / 3600) % 24;
        inOne -= newHour * 3600;

        // Extract minutes
        int newMinute = inOne / 60;
        inOne -= newMinute * 60;

        // Remaining seconds
        int newSecond = inOne;

        return new Time(newHour, newMinute, newSecond);
    }
}
