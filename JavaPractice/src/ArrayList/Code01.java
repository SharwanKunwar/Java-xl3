package ArrayList;

import java.util.ArrayList;

// Write a program to add elements in arraylist.

public class Code01 {
    static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        for(int i=0; i<l1.size(); i++)
        {
            System.out.println(l1.get(i));
        }
    }
}
