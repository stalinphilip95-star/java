
package day2;


import java.util.Scanner;


public class Arithmetic{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        //addition
        int c = a+b;
        System.out.println("addition:" + c);

        c=0;
        c=a-b;
        System.out.println("substraction:" + c);

        c = 0;
        //multiple
        c=a*b;
        System.out.println("multipe:" + c);
        //div
        c=0;
        c=a/b;
        System.out.println("division:" + c);
        c=0;
        //mod
        c=a%b;
        System.out.println("mod:" + c);
    }
}
