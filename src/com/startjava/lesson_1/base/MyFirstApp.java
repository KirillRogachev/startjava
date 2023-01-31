package src.com.startjava.lesson_1.base;

import java.util.Scanner;
import java.nio.charset.Charset;

public class MyFirstApp {
    public static void main(String[] args) {
        System.out.println("Привет, мир!");
        System.out.println(Charset.defaultCharset().displayName());
        Scanner scanner = new Scanner(System.in, "cp866");
        System.out.print("Введите свое имя: ");
        System.out.println("Привет, " + scanner.nextLine());
    }
}