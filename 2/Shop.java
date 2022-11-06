package ru.mirea;

import java.lang.*;
import java.util.Scanner;
import java.util.Arrays;

public class Shop {
    public static void main(String[] args) {
        int ch;
        Scanner source1 = new Scanner(System.in);
        System.out.println("give me chislo kompov ");
        ch = source1.nextInt();

        String[] array = new String[ch+5];

        for (int i = 0; i<ch; i++){
            Scanner source = new Scanner(System.in);
            System.out.println("give me komp ");
            array[i] = source.next();
        }

        String komp;
        Scanner source2 = new Scanner(System.in);
        System.out.println("kakoi komp nuzhen? ");
        komp = source2.next();
        int k = 0;

        boolean flag = false;
        int ii=0;

        flag = Arrays.asList(array).contains(komp);

        if (flag == false){
            String f;
            Scanner source3 = new Scanner(System.in);
            System.out.println("Takogo net, dobavim? y/n");
            f = source3.next();

            if (f == "y"){
                array[ch+k] = komp;
            }
        }else{
            System.out.println("vot vash komp, seichas uberem ego is spiska ");
            array[ii]="";
            System.out.println(komp);
        }
    }
}
