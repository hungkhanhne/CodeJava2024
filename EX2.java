
package java1;

import java.util.Arrays;
import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu mang: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Nhap cac phan tu mang:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}

