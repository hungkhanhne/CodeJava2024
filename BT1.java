package java1;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
//        nhap
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so nguyen thu nhat: ");
        int num1 = scanner.nextInt();
        System.out.println("nhap so nguyen thu hai: ");
        int num2 = scanner.nextInt();
//        phep tinh
        int cong = num1 + num2;
        int tru = num1 - num2;
        int nhan = num1 * num2;
        int chia = num1 / num2;
        int chialaydu = num1 % num2;
//        in ra 
        System.out.println("cong: " + cong);
        System.out.println("tru: " + tru);
        System.out.println("nhan: " + nhan);
        System.out.println("chia: " + chia);
        System.out.println("chialaydu: " + chialaydu);
    }
}
