import java.util.Scanner;

/**
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
 * Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */
public class Task1 {
    public static void main(String[] args) {
        float number = getFloatInput();
        System.out.println("Введенное число: " + number);
    }

    public static float getFloatInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дробное число: ");

        while (true) {
            try {
                float inputNumber = Float.parseFloat(scanner.nextLine());
                if (inputNumber % 1.0 != 0) {
                    return inputNumber;
                } else {
                    System.out.print("Ошибка! Введите дробное число: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Ошибка! Введите дробное число: ");
            }
        }
    }
}

