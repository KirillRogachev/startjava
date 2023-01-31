package src.com.startjava.lesson_1.final_;

public class MyFirstGame {
    public static void main(String[] args) {
        int compNum = 46;
        int userNum = 15;
        while(userNum != compNum) {
            if(userNum < compNum) {
                System.out.println("Число " + userNum + " меньше того, что загадал компьютер");
                userNum += 3;
            } else if(userNum > compNum) {
                System.out.println("Число " + userNum + " больше того, что загадал компьютер");
                userNum -= 2;
            } 
        }
        System.out.println("Вы победили! Загадано число " + compNum);
    }
}