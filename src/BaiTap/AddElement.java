package BaiTap;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử mảng: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Nhập " + size + " phần tử cho mảng");
        for (int i = 0; i < size; i++) {
            System.out.print("Phần tử " + i + " là: ");
            array[i] = sc.nextInt();
        }

        System.out.print("Mảng hiện tại: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.print("Nhập phần tử cần chèn: ");
        int addElement = sc.nextInt();

        System.out.print("Nhập vị trí index cần chèn: ");
        int index = sc.nextInt();

        while (index <= 0 || index >= array.length) {
            System.out.println("Vị trí index " + index + " không hợp lệ, vui lòng nhập lại: ");
            index = sc.nextInt();
        }
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[index] = addElement;

        for (int i = index; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }

        System.out.print("Mảng sau khi chèn: ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}
