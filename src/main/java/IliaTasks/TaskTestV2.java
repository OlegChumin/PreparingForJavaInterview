package IliaTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Задача: с клавиатуры вводятся строки содержащие буквы или строки содержащие и первую букву i  и затем цифры
 * 1. Считать строку с консоли и сохранить ее в переменную.
 * 2. Если строка содержит первый символ == 'i' то удалить этот символ, преобразовать в число и к полученному числовому значению добавить 1 и вывести число на экран
 * 3. Если первый символ строки содержит == 's' то удалить этот символ и вывести остаток строки в обратном порядке символов
 * 4. Если введена пустая строка или другие строки без символов как в пп.1 или 2. то просто вывести ее на экран.
 * <p>
 * Рекомендации: в Java использовать Scanner, switch() { }, и методы string или StringBuilder (методы deleteCharAt(), reverse())= которые можно подсмотреть в IDEA если около вашей введенной строки поставить точку
 * Примеры ввода и результата:
 * Ввод: "i123"
 * Вывод: 124
 * <p>
 * Ввод: "sabc"
 * Вывод: cba
 * <p>
 * Ввод: "    "
 * Вывод:
 */
public class TaskTestV2 {
    private final static int INDEX_OF_CHAR_0 = 0;
    private final static int INDEX_OF_CHAR_1 = 1;
    private final static int ADD_VALUE = 1;

    public static void main(String[] args) {
        System.out.println(stringProcess());
    }

    private static String stringProcess() {
        StringBuilder stringBuilder = null;
        try {
            stringBuilder = new StringBuilder(new BufferedReader(new InputStreamReader(System.in)).readLine());
        } catch (IOException ioException) {
            System.err.println("Error in input from console/keyboard!" + ioException);
        }
        switch (stringBuilder.charAt(INDEX_OF_CHAR_0)) {
            case 'i':
                return (Integer.parseInt(stringBuilder
                        .delete(INDEX_OF_CHAR_0, INDEX_OF_CHAR_1)
                        .toString()) + ADD_VALUE) + "";
            case 's':
                return stringBuilder
                        .delete(INDEX_OF_CHAR_0, INDEX_OF_CHAR_1)
                        .reverse()
                        .toString();
            default:
                return stringBuilder.toString();
        }
    }
}