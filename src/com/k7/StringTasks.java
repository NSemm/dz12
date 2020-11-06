package com.k7;

import java.util.Arrays;
import java.util.Objects;

public class StringTasks {
    static int intCountOf(String s, String needl) {
        int poz = 0;
        int count = 0;
        while (s.indexOf(needl, poz) != -1) {
            poz = s.indexOf(needl, poz) + needl.length();
            ++count;
        }
        return count;
    }

    static String cesarCrypt(String s, int key) {
        String cryptAlphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] temp = s.toCharArray();
        for (int i = 0; i < temp.length; i++) {
            char element = s.toLowerCase().charAt(i);
            if (element == ' ') {
                temp[i] = ' ';
                continue;
            }
            int alphabetIndex = cryptAlphabet.indexOf(element) + key;
            if (alphabetIndex > cryptAlphabet.length() - 1)
                temp[i] = cryptAlphabet.charAt(alphabetIndex - cryptAlphabet.length());
            else temp[i] = cryptAlphabet.charAt(alphabetIndex);
        }
        return String.copyValueOf(temp);
    }

    static Contact[] parseContacts(String s) {
        Contact[] contacts = new Contact[0];
        String[] tempIn = s.split(";");
        for (int i = 0; i < tempIn.length; i++) {
            String name = tempIn[i].substring(0, tempIn[i].indexOf(":"));
            String phone = tempIn[i].substring(tempIn[i].indexOf(":") + 1);
            Contact contact = new Contact(name, phone);
            contacts = Arrays.copyOf(contacts, contacts.length + 1);
            contacts[contacts.length - 1] = contact;
        }
        return contacts;
    }

}
