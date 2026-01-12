package ThucHanh;

import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        // khởi tạo mảng
        String[] students = {"a", "b", "c", "e", "f", "g", "h"};
        Scanner sc = new Scanner(System.in);

        // nhập giá trị cần tìm
        System.out.println("Nhập giá trị cần tìm: ");
        String input = sc.nextLine();
        boolean isExist = false;

        // kiểm tra
        while (!isExist) {
            for (int i = 0; i < students.length; i++) {
                if (students[i].equals(input)) {
                    System.out.print("Vị trí của " + input + " trong danh sách là: " + i);
                    isExist = true;
                    break;
                }
            }
            // nếu không tìm thấy, nhập lại
            if (!isExist) {
                System.out.print("Không tìm thấy, vui lòng nhập lại: ");
                input = sc.nextLine();
            }
        }


    }
}
