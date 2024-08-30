
package java1;

import java.util.Scanner;

public class SAKAI1GK {  
    // method nhap mang so thuc
    public static float[] importData(float[] arrays) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        arrays = new float[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap phan tu thu "+ (i + 1) + ": ");
            arrays[i] = scanner.nextFloat();
        }
        return arrays;
    }

    // method xuat ra man hinh
    public static void printData(float[] arrays) {
        System.out.println("Mang da nhap la:");
        for (float element : arrays) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // mehtod tim so lon thu 2 trong mang
    public static float findMax2(float[] arrays) {
        float max1 = Float.MIN_VALUE;
        float max2 = Float.MIN_VALUE;

        for (float num : arrays) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num < max1) {
                max2 = num;
            }
        }
        return max2;
    }

    // method xoa phan tu le
    public static float[] deleteOddNumber(float[] arrays) {
        int count = 0;
        for (float num : arrays) {
            if (num % 2 == 0) {
                count++;
            }
        }

        // tao mang chi co phan tu chang
        float[] newArray = new float[count];
        int index = 0;
        for (float num : arrays) {
            if (num % 2 == 0) {
                newArray[index++] = num;
            }
        }
        return newArray;
    }
    public static void main(String[] args) {
        float[] arrays = null;
        arrays = importData(arrays);
        printData(arrays);
        float max2 = findMax2(arrays);
        System.out.println("Phan tu lon thu 2 trong mang la: " + max2);
        arrays = deleteOddNumber(arrays);
        System.out.print("mang sau khi xoa phan tu le: ");
        printData(arrays);
    }
}

