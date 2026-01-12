package ThucHanh;

import java.util.Scanner;

// đảo ngược mảng
public class ReverseArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);

        // nhập kích thước mảng
        do {
            System.out.println("Nhập số phần tử mảng: ");
            size = input.nextInt();
        } while (size <= 0 || size > 20);
        array = new int[size];

        // nhập mảng
        int index = 0;
        while (index < size) {
            System.out.print("Phần tử " + index  + ": ");
            array[index] = input.nextInt();
            index++;
        }

        // in mảng
        System.out.print("Các phần tử trong mảng: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // đảo ngược mảng
        for (int i = 0; i <= array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        
        // in mảng sau khi đảo ngược
        System.out.print("Mảng sau khi đảo ngược: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
