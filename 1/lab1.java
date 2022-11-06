package ru.mirea;
import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        int [] b = new int[5];
        int i = 0;
        int sum=0;
        for (i=0; i<5;i++){
            Scanner sc = new Scanner(System.in);
            int j = 2; System.out.print("Give me chislo ");
            if(sc.hasNextInt()) {
                j = sc.nextInt();
                b[i]=j;
            } else {
                System.out.println("Ne chislo");
            }
            sum+=b[i];
        }
        System.out.print("sum= ");
        System.out.println(sum);
        System.out.print("sred arif= ");
        System.out.println(sum/5);
    }

}

