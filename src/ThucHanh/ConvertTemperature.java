package ThucHanh;

import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int celsius;
        int fahrenheit;
        int choice;

        do {
            System.out.println("Menu");
            System.out.println("-------------");
            System.out.println("1. Độ C sang độ F");
            System.out.println("2. Độ F sang độ C");
            System.out.println("0. Thoát");

            System.out.print("Nhập giá trị: ");
            choice = sc.nextInt();

            while (choice < 0 || choice > 2) {
                System.out.print("Không hợp lệ, vui lòng nhập lại: ");
                choice = sc.nextInt();
            }

            switch (choice) {
                case 1:
                    System.out.print("Nhập giá trị: ");
                    celsius = sc.nextInt();

                    System.out.println(celsius + " độ C = " + celsiusToFahrenheit(celsius) + " độ F");
                    break;
                case 2:
                    System.out.print("Nhập giá trị: ");
                    fahrenheit = sc.nextInt();
                    while (fahrenheit < 0) {
                        System.out.println("Không hợp lệ, vui lòng nhập lại: ");
                        fahrenheit = sc.nextInt();
                    }
                    System.out.println(fahrenheit + " độ F = " + farenheitToCelsius(fahrenheit) + " độ C");
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double farenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
