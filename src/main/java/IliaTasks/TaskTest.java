package IliaTasks;

import java.util.Scanner;

public class TaskTest {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("Write something:");
        String string = s.nextLine();
        if (string.isEmpty()) {
            System.out.println("string");
        } else {

            char c = string.charAt(0);
            switch (c) {
                case 'i' : String first = string.replace("i", "");
                Integer second = Integer.parseInt(first);
                    System.out.println(second+1);
break;
                case 's' : String reverse = string.replace("s",""); StringBuilder input = new StringBuilder(); input.append(reverse);
                reverse = input.reverse().toString();
                    System.out.println(reverse);
                    break;
                default:
                    System.out.println("You entered something out of bounds");
            } ;


           // System.out.println(string);
        }
    }
}