package com.company;

public class Main {

    public static void main(String[] args) {
        Class class1 = new Class(2, "esen", new int[]{1,2,3});
        System.out.println(class1.getNumber() + " "+ class1.getWord());
        for (int i = 0; i < class1.getArray().length; i++) {
            System.out.print(class1.getArray()[i] + " ");
        }
    }
}
