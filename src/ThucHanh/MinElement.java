package ThucHanh;

public class MinElement {
    public static void main(String[] args) {
        int[] array = {4, 12, 7, 8, 1, 6, 9};
        int index = minElement(array);
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + index);
    }

    public static int minElement(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
