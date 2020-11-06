package com.k7;

public class Main {

    public static void main(String[] args) {
        String s = "Every morning i do my morning exercises";
        //"abcdefghijklmnopqrstuvwxyz" -- cesareChipher
        String needl = " ";
        System.out.println("Число вхождений = " + StringTasks.intCountOf(s, needl));
        System.out.println("Шифр Цезаря: " + StringTasks.cesarCrypt(s, 3));
        System.out.println
                (StringTasks.parseContacts("Вася:0490005678;Петя:+380951234567;Леонид:0678899777")[1].getName());
        System.out.println
                (StringTasks.parseContacts("Вася:0490005678;Петя:+380951234567;Леонид:0678899777")[1].getPhone());

    }

}
