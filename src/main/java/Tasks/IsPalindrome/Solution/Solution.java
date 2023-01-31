package Tasks.IsPalindrome.Solution;

import java.sql.SQLOutput;
import java.util.*;

/**
Палиндром? Объяви и реализуй логику приватного статического метода Set<Integer> getRadix(String number), в котором нужно
 определить, в каких системах счисления (от 2 до 36 включительно) представление числа number (передается в десятичной системе
 счисления) является палиндромом и добавить индекс таких систем в результат.
 Если переданное число некорректно - возвращай пустой HashSet.
 В системах счисления с основанием большим 10 в качестве цифр используются латинские буквы. К примеру, числу 35 в
 десятичной системе соответствует число "Z" в системе с основанием 36.

 Метод main не принимает участие в тестировании.

 P.S.: В методе getRadix перехватывай NumberFormatException. Стек-трейс выводить не нужно.


 Requirements:
 1. Необходимо объявить приватный статический метод Set<Integer> getRadix(String number).
 2. Метод getRadix в случае некорректных входных данных должен возвращать пустой HashSet.
 3. Методе getRadix не должен бросать NumberFormatException.
 4. Метод getRadix не должен ничего выводить в консоль.
 5. Метод getRadix должен возвращать множество согласно условию задачи.
*/

public class Solution {
    public static void main(String[] args) {
//        int numberToProcess = Integer.parseInt("112");
//        System.out.println(numberToProcess);
//        for (int i = 2; i < 36; i++) {
//            String temp = Integer.toString(numberToProcess, i);
//
//            System.out.println(numberToProcess + " = " + temp + " in " + i +" digit system" + " Palindrome? = " + isPalindrom(temp));
//        }

        System.out.println(getRadix("112"));        //expected output: [3, 27, 13, 15]
        System.out.println(getRadix("123"));        //expected output: [6]
        System.out.println(getRadix("5321"));       //expected output: []
        System.out.println(getRadix("1A"));         //expected output: []
    }

    private static Set<Integer> getRadix(String number) {
        Set<Integer> result = new TreeSet<>(); // интерфейс Set -> реализация TreeSet (HashSet  -> Map(Key, Const))
        try {
            int numberToProcess = Integer.parseInt(number); // получаем строку из параметров и парсим ее в число
            for (int i = 2; i < 36; i++) { //проходимся по всем системам счисления (от 2 до 36 включительно)
                String temp = Integer.toString(numberToProcess, i); //Возвращает строковое представление первого
                // аргумента в системе счисления, заданной вторым аргументом.
                if (isPalindrom(temp)) { // проверяем на "палиндромность"
                    result.add(i); // добавляем ту систему счисления в которой исходная строка является палиндромом
                }
            }
        } catch (NumberFormatException e) {
        } // ловим исключение, если строка не парсится в число
        return result; //Если переданное число некорректно - возвращается пустой HashSet.
    }

    private static boolean isPalindrom(String number) {
        return number.equals(new StringBuilder(number).reverse().toString()); //StringBuilder работает быстрее, но
        // потоконебезопасен, StringBuffer работает медленнее, но потокобезопасен
    }
}