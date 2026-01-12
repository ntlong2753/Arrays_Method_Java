package BaiTap;

public class MaxElement {
    public static void main(String[] args) {
        // khởi tạo mảng 2 chiều
        double[][] matrix = {
                {1.5, 2.6, 9.1},
                {4.2, 12.5, 6.7},
                {8.0, 5.5, 3.3}
        };
        double max = matrix[0][0];
        int indexRow = 0; // hàng
        int indexCol = 0; // cột
        // duyệt mảng
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    indexRow = i;
                    indexCol = j;
                }
            }
        }
        System.out.println("Giá trị lớn nhất trong ma trận là: " + max);
        System.out.println("Tại vị trí: Hàng " + indexRow + ", Cột " + indexCol);
    }
}
