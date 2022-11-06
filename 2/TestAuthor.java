package ru.mirea;

import java.lang.*;
import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Egor", "",'M');
        String email;
        Scanner source = new Scanner(System.in);
        System.out.println("give me email ");
        email = source.next();
        a1.setEmail(email);
        System.out.println(a1.toString());



    }
}
