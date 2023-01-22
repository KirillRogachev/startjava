import java.util.Scanner;
import java.nio.charset.Charset;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "cp866");
        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.nextLine());
        GuessNumber game = new GuessNumber(player1, player2);
        String userAnswer;
        do {
            game.launchGame();
            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                userAnswer = scanner.nextLine();
                if(userAnswer.equals("yes") || userAnswer.equals("no")) {
                    break;
                }
                System.out.println("Введен недопустимый ответ");
            } while(true);
        } while(userAnswer.equals("yes"));
    }
}