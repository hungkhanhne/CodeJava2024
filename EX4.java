
package java1;

import java.util.Arrays;
import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("nhap so luong phan tu: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("nhap cac phan tu mang:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Mảng sau khi sắp xếp tăng dần:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

