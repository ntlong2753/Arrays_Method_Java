package ThucHanh;

import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int array[];
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        size = sc.nextInt();

        while (size < 0 || size > 20) {
            System.out.println("Số lượng phần tử trong mảng không được vượt quá 20, vui lòng nhập lại: ");
            size = sc.nextInt();
        }
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Phần tử " + i + " là: ");
            array[i] = sc.nextInt();
        }

        System.out.println("Các phần tử trong mảng là: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int max = array[0];
        int index = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i + 1;
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng là: " + max + " ở vị trí " + index);
    }
}
