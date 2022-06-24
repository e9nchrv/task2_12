package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
        SimpleLinkedList<Integer> list = new SimpleLinkedList<>();
        list.addFirst(2);
        list.addLast(7);
        list.addLast(4);
        list.addLast(3);

        int maxNumberIndex = 0;
        for (int i = 0; i < list.size(); i++)
            if (list.get(i) > list.get(maxNumberIndex)) maxNumberIndex = i;


        for (int j = 0; j < list.size(); j++) {
            if (j <= maxNumberIndex) {
                list.addLast(list.getFirst());
                list.removeFirst();
            }
            if (j == maxNumberIndex) {
                list.addLast(-list.getLast());
            }
            if (j > maxNumberIndex + 1) {
                list.addLast(list.getFirst());
                list.removeFirst();
            }
        }


        for (int i = 0; i < list.size(); i++) {
            System.out.print((i > 0 ? ", " : "") + list.get(i));
        }
    }
}

