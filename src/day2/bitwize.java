import java.util.Scanner;
public class bitwize {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = s.nextInt();
        System.out.println("Enter the value of b:");
        int b = s.nextInt();
        System.out.println("AND:" + (a & b));
        System.out.println("OR:" + (a | b));
        System.out.println("XOR:" + (a ^ b));
    }
}