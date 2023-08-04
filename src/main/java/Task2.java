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
 *      что вызовет исключение `ArithmeticException`.
 * 2. в коде не представлен массив `intArray`, что может вызвать ошибку во время компиляции.
 */


public class Task2 {
    public static void main(String[] args) {

        try {
            int[] intArray = new int[10];       // инициализируем массив `intArray` размером 10 элементов
            int d = 1;                              // присваиваем переменной `d` значение 1, чтобы избежать деления на 0
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e); // если возникает исключение `ArithmeticException`, код в блоке `catch` будет выполнен и сообщит об ошибке.
        }
    }
}
