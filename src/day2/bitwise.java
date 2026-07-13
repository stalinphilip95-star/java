package day2;

import java.util.Scanner;
public class bitwise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = s.nextInt();
        System.out.println(a>>2);
        System.out.println(a<<2);
    }
}