
package classcode;
import java.util.ArrayList;
import java.util.Scanner;

public class NumberExercise {
    
    // method nhap mang so nguyen
    public static ArrayList<Integer> enterData(ArrayList<Integer> numbers) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so luong phan tu: ");
        int n = scanner.nextInt();

        System.out.println("nhap " + n + " so nguyen:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }
        return numbers;
    }   
    // method in ra man hinh
    public static void printData(ArrayList<Integer> numbers) {
        System.out.println("cac phan tu trong mang: " + numbers);
    }   
    // method tim gia tri lon thu 2 trong mang
    public static int findMax2(ArrayList<Integer> numbers) {
        if (numbers.size() < 2) {
            System.out.println("mang khong co du phan tu.");
            return Integer.MIN_VALUE; 
        }
        int max1= Integer.MIN_VALUE;
        int max2= Integer.MIN_VALUE;
        for (int number: numbers){
            if(number>max1){
                max2 = max1;
                max1 = number;
        } else if(number > max2 && number != max1){
            max2 = number;
        }
    }
        return max2;
    }
    public static void deleteOddNumber(ArrayList<Integer> numbers) {
        numbers.removeIf(number -> number % 2 != 0);
        System.out.println("Da xoa cac so le.");
    }
        
}
        
    
