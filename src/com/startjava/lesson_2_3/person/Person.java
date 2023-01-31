package src.com.startjava.lesson_2_3.person;

public class Person {

    String gender = "Male";
    String name = "Name";
    int height = 180;
    int weight = 80;
    int age = 18;

    void walk() {
        System.out.println("Человек идет");
    }

    void sit() {
        System.out.println("Человек сидит");
    }

    void run() {
        System.out.println("Человек бежит");
    }

    void talk() {
        System.out.println("Человек говорит");
    }

    String learnJava() {
        return "Человек учит Java";
    }
}