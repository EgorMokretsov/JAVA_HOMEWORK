package ru.mirea;
import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        int [] b = new int[5];
        int i = 0;
        int sum=0;
        while (i<5){
            Scanner sc = new Scanner(System.in);
            int j = 2; System.out.print("Give me chislo ");
            if(sc.hasNextInt()) {
                j = sc.nextInt();
                b[i]=j;
            } else {
                System.out.println("Ne chislo");
            }
            sum+=b[i];
            i++;
        }
        for (i=0;i<5;i++){
            for (int j=0;j<4;j++){
                if (b[j]>b[j+1]){
                    int a;
                    a=b[j];
                    b[j]=b[j+1];
                    b[j+1]=a;
                }
            }
        }
        System.out.print("sum= ");
        System.out.println(sum);
        System.out.print("sred arif= ");
        System.out.println(sum/5);
        System.out.print("min= ");
        System.out.println(b[0]);
        System.out.print("max= ");
        System.out.println(b[4]);
    }

}
