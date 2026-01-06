package ArrayList;

// use of addAll method from the arraylist

import java.util.ArrayList;

public class Code02 {
    static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
            l1.add(1);
            l1.add(2);
            l1.add(3);
            l1.add(4);
            l1.add(5);

        ArrayList<Integer> l2 = new ArrayList<>();
            l2.add(10);
            l2.add(20);
            l2.add(30);
            l2.add(40);
            l2.add(50);

            l1.addAll(3,l2);

            for(int i=0; i<l1.size(); i++){
                System.out.println(l1.get(i));
            }

    }
}
