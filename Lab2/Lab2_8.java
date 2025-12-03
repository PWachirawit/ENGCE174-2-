package Lab2;

import java.util.Scanner;

class TempConvertor {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }
}

public class Lab2_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mode (C_TO_F or F_TO_C): ");
        String mode = scanner.next().trim();

        System.out.print("Temperature: ");
        double temperature = scanner.nextDouble();

        if (mode.equalsIgnoreCase("C_TO_F")) {
            double result = TempConvertor.celsiusToFahrenheit(temperature);
            System.out.printf("Converted Temp: %.2f\n", result);
        } else if (mode.equalsIgnoreCase("F_TO_C")) {
            double result = TempConvertor.fahrenheitToCelsius(temperature);
            System.out.printf("Converted Temp: %.2f\n", result);
        } else {
            System.out.println("Invalid mode! Please enter C_TO_F or F_TO_C.");
        }

        scanner.close();
    }
}
