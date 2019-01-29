package com.company;

public class Main {

    public static void main(String[] args) {

        String name = "Omar Atcho";
        String nameLc = "omar atcho";
        String firstName = "Omar";
        String lastName = "Atcho";
        String changeName = name.replace('o', 'z');

        System.out.println(name.equals(nameLc));
        System.out.println(name.equalsIgnoreCase(nameLc));
        System.out.println(name.length());
        System.out.println(name.concat(nameLc));
        System.out.println(name.charAt(3));
        System.out.println(firstName.compareTo(lastName));
        System.out.println(changeName);
        System.out.println(name.substring(8));


    }
}
