package java1;

import java.util.Scanner;

public class PTB1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhap he so a và b
        System.out.print("Nhap a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap b: ");
        double b = scanner.nextDouble();

        // giai phuong trinh ax + b = 0
        if (a == 0) {
            if (b == 0) {
                System.out.println("phuong trinh co vo so nghiem.");
            } else {
                System.out.println("phuong trinh vo nghiem.");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiem cua phuong trinh la: x = " + x);
        }

    }
}
