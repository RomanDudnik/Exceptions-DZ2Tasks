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

public class Task3 {
    public static void main(String[] args) {
        //Вариант 1
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
            // изменил порядок блоков `catch`, чтобы `IndexOutOfBoundsException` обрабатывалось до `Throwable`.
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

    /** удалил выбрасывание `FileNotFoundException` из сигнатуры метода `printSum`
    поскольку в его реализации не генерируется это исключение*/
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

    // Вариант 2 - файл Task3v2.java

}
