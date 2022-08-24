import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int a2 = scan.nextInt();
        int b = scan.nextInt();
        int b2 = scan.nextInt();
        int a3 = scan.nextInt();
        int a4 = scan.nextInt();
        int b3 = scan.nextInt();
        int b4 = scan.nextInt();

        int sumA = a + a2 + a3 + a4;
        int sumB = b + b2 + b3 + b4;

        if (sumA > sumB) {
            System.out.println("1");
        } else if (sumA < sumB) {
            System.out.println("2");
        } else if (sumA == sumB) {
            System.out.println("DRAW");
        }
    }
}
