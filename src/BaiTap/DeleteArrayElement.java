package BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteArrayElement {
    public static void main(String[] args) {
        int[] array = {4, 12, 7, 8, 1, 6, 9};
        int size = array.length;
        Scanner sc = new Scanner(System.in);

        System.out.print("Mảng ban đầu: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.print("Nhập phần tử cần xóa: ");
        int element = sc.nextInt();

        // tìm phần tử trong mảng
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Không tìm thấy phần tử " + element + " trong mảng");
        }
        else {
            System.out.println("Phần tử cần xóa là " + element + ", đang ở vị trí " + index + " trong mảng");
            for (int i = index; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
        System.out.print("Mảng sau khi xóa: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

    }


}

