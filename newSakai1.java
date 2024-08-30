
package java1;
  import java.util.Scanner;
public class newSakai1 {

    // method nhap mang so thuc
    public static float[] importData(float[] arrays) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrays.length; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arrays[i] = scanner.nextFloat();
        }
        return arrays;
    }
    
    // method xuat mang ra man hinh
    public static void printData(float[] arrays) {
        System.out.print("Mang da nhap: ");
        for (float num : arrays) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // method tim phan tu thu hai trong mang
    public static float findMax2(float[] arrays) {
        float max1 = Float.MIN_VALUE;
        float max2 = Float.MIN_VALUE;

        for (float num : arrays) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num != max1) {
                max2 = num;
            }
        }
        return max2;
    }

    // method xoa phan tu le ra khoai mang
    public static float[] deleteOddNumber(float[] arrays) {
        int count = 0;
        for (float num : arrays) {
            if (num % 2 == 0) {
                count++;
            }
        }

        // tạo mang moi chi chua phan tu chang
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
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap so luong phan tu cua mang: ");
        int n = scanner.nextInt();
        float[] arrays = new float[n];
        arrays = importData(arrays);
        printData(arrays);
        float max2 = findMax2(arrays);
        System.out.println("gia tri lon thu 2 trong mang: " + max2);
        arrays = deleteOddNumber(arrays);
        System.out.print("mang sau khi xoa cac phan tu le: ");
        printData(arrays);
    }
}

