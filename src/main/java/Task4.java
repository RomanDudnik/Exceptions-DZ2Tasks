import java.util.Scanner;

/**
 * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        try {
            while (input.isEmpty()) {
                System.out.print("Введите строку: ");
                input = scanner.nextLine();

                if (input.isEmpty()) {
                    throw new Exception("Пустые строки вводить нельзя!");
                }
            }

            System.out.println("Вы ввели: " + input);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

