/**
 * Если необходимо, исправьте данный код: try {
 *    int d = 0;
 *    double catchedRes1 = intArray[8] / d;
 *    System.out.println("catchedRes1 = " + catchedRes1);
 * } catch (ArithmeticException e) {
 *    System.out.println("Catching exception: " + e);
 * }
 *
 * Ошибки в коде:
 * 1. Объявлена переменная `int d = 0`, и в строке `double catchedRes1 = intArray[8] / d` происходит деление на 0,
 *      что вызовет исключение `ArithmeticException`. (не ошибка для проверки блока `catch`)
 * 2. в коде не представлен массив `intArray`, что может вызвать ошибку во время компиляции.
 * 3. При вызове элемента за размерами массива не предусмотрен перехват исключения IndexOutOfBoundsException
 */


public class Task2 {
    public static void main(String[] args) {

        try {
            int[] intArray = new int[10];       // инициализируем массив `intArray` размером 10 элементов (можно < 8 для `IndexOutOfBoundsException`)
            int d = 1;                              // присваиваем переменной `d` значение 1, чтобы избежать деления на 0 (или исключение `ArithmeticException` при 0).
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e.getMessage()); // если возникает исключение `ArithmeticException`, код в блоке `catch` будет выполнен и сообщит об ошибке.
        } catch (IndexOutOfBoundsException e){
            System.out.println("Catching exception: " + e.getMessage()); // если возникает исключение `IndexOutOfBoundsException`, код в блоке `catch` будет выполнен и сообщит об ошибке.
        }
    }
}
