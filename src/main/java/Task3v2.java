import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Дан следующий код, исправьте его там, где требуется :
 * public static void main(String[] args) throws Exception {
 *    try {
 *        int a = 90;
 *        int b = 3;
 *        System.out.println(a / b);
 *        printSum(23, 234);
 *        int[] abc = { 1, 2 };
 *        abc[3] = 9;
 *    } catch (Throwable ex) {
 *        System.out.println("Что-то пошло не так...");
 *    } catch (NullPointerException ex) {
 *        System.out.println("Указатель не может указывать на null!");
 *    } catch (IndexOutOfBoundsException ex) {
 *        System.out.println("Массив выходит за пределы своего размера!");
 *    }
 * }
 * public static void printSum(Integer a, Integer b) throws FileNotFoundException {
 *    System.out.println(a + b);
 * }
 *
 * Ошибки в коде:
 * 1. Метод `printSum` объявлен с выбрасыванием исключения `FileNotFoundException`, но в реализации метода исключения нет.
 * 2. Исключение `IndexOutOfBoundsException` должно быть обработано перед `Throwable`, так как оно является его подклассом.
 * 3. Массив `abc` имеет размер 2, значение в `abc[3]` вызовет `ArrayIndexOutOfBoundsException`.(не ошибка для проверки блока `catch`)
 */
// Вариант 2

/**
 * Этот код использует `Scanner` для чтения данных из файла "file.txt".
 * Если файл не найден, будет выброшено исключение `FileNotFoundException`, которое затем будет обработано в блоке `catch` в методе `main`.
 */
public class Task3v2 {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[2] = 9;
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не найден!");
        } catch (ArithmeticException ex) {
            System.out.println("Деление на ноль!");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        // Чтение данных из файла
        File file = new File("file.txt");   // используем `Scanner` для чтения данных из файла "file.txt"
        Scanner scanner = new Scanner(file);
        int sum = 0;
        while (scanner.hasNextInt()) {
            sum += scanner.nextInt();
        }
        scanner.close();

        // Вывод суммы
        System.out.println("Сумма из файла: " + sum);
        System.out.println(a + b);
    }
}

