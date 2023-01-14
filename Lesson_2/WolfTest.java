public class WolfTest {
    public static void main(String args[]) {
    Wolf wolf = new Wolf();

    wolf.gender = "самец";
    wolf.name = "волк";
    wolf.weight = 20;
    wolf.age = 5;
    wolf.color = "серый";

    System.out.println(wolf.gender);
    System.out.println(wolf.name);
    System.out.println(wolf.weight);
    System.out.println(wolf.age);
    System.out.println(wolf.color);

    wolf.walk();
    wolf.sit();
    wolf.run();
    wolf.howl();
    wolf.hunt();
    }
}