package OOPs.FunnyExample;

import java.util.Scanner;

public class Person {
    int leftGeda;
    int rightGeda;

    int say(){
        Scanner sc = new Scanner(System.in);
        String[] ans = {"he is good.", "He is insane"};
        for(String val: ans){
            System.out.println(val);
        }
        System.out.println("chose what you wannt say : ");
        int op = sc.nextInt();
        System.out.println(ans[op]+": "+op);

        return  (op);

    }
}
