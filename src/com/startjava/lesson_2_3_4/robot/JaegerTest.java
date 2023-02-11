package src.com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger robot1 = new Jaeger();
        robot1.setModelName("Gipsy Danger");
        robot1.setMark("Mark-3");
        robot1.setOrigin("USA");
        robot1.setHeight(260);
        robot1.setWeight(1980);
        robot1.setStrength(8);
        robot1.setArmor(6);
        Jaeger robot2 = new Jaeger("Striker Eureka", "Mark-5", "Australia", 250, 1850, 10, 9);
        System.out.println(robot1.getModelName() + " origin before change: " + robot1.getOrigin());
        robot1.setOrigin("Canada");
        System.out.println(robot1.getModelName() + " origin after change: " + robot1.getOrigin());
        System.out.println(robot2.getModelName() + " strength before change: " + robot2.getStrength());
        robot2.setStrength(11);
        System.out.println(robot2.getModelName() + " strength after change: " + robot2.getStrength());
        robot2.move();
        robot1.useVortexCannon();
    }
}