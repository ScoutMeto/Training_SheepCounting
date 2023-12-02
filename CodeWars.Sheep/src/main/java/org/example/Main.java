package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(countingSheep(6));
    }

    public static String countingSheep(int num) {

        ArrayList<String> sheep = new ArrayList<>();

    for (int i = 0; i < num; i++) {
        sheep.add(i+1 + " sheep...");
    }

        return sheep.toString();
    }



}