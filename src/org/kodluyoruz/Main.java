package org.kodluyoruz;

public class Main {

    public static void main(String[] args) {
        Queue<String> q1 = new Queue<String>();

        System.out.println(q1.peek());

        q1.add("Ali");
        q1.add("Veli");
        q1.add("49");
        q1.add("50");

        System.out.println(q1.peek());
        System.out.println(q1.peek());

        q1.add("ekleme");

        try {
            System.out.println(q1.poll());
            System.out.println(q1.poll());
            System.out.println(q1.poll());
            System.out.println(q1.poll());
            System.out.println(q1.poll());
            System.out.println(q1.poll());

        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        Queue<Integer> q2 = new Queue<Integer>();

        System.out.println(q2.peek());

        q2.add(47);
        q2.add(48);
        q2.add(49);
        q2.add(50);

        System.out.println(q2.peek());
        System.out.println(q2.peek());

        q2.add(51);

        try {
            System.out.println(q2.poll());
            System.out.println(q2.poll());
            System.out.println(q2.poll());
            System.out.println(q2.poll());
            System.out.println(q2.poll());
            System.out.println(q2.poll());

        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
