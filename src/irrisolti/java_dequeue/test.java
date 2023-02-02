package java_dequeue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();

            if(m < 3)
                deque.add(num);


        }

        if(deque.getFirst() == deque.getLast())
            System.out.println(3);
        else
            System.out.println(2);

    }

}
