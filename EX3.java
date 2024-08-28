
package java1;

import java.util.Arrays;
import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so luong phan tu: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("nhap cac phan tu mang:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = (double) sum / size;
        System.out.println("Tong la: " + sum);
        System.out.println("Trung binh la: " + average);
    }
}

