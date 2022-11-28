public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 34;
        boolean isMale = true;
        double height = 1.85;
        char firstLetterOfName = "Mark".charAt(0);

        if(age > 20) {
            System.out.println("Возраст превышает 20 лет");
        } else {
            System.out.println("Возраст меньше либо равен 20 годам");
        }

        if(!isMale) {
            System.out.println("Пол женский");
        } else {
            System.out.println("Пол мужской");
        }

        if(height < 1.8) {
            System.out.println("Рост меньше 180 см");
        } else {
            System.out.println("Рост больше либо равен 180 см");
        }

        if(firstLetterOfName == 'M') {
            System.out.println("Имя начинается на M");
        } else if(firstLetterOfName == 'I') {
            System.out.println("Имя начинается на I");
        } else {
            System.out.println("Первая буква имени не M и не I");
        }
            
        System.out.println("\n2. Поиск max и min числа");
        int num1 = 100;
        int num2 = 55;
        if(num1 > num2) {
            System.out.println("Число " + num1 + " больше числа " + num2);
        } else if(num1 < num2) {
            System.out.println("Число " + num1 + " меньше числа " + num2);
        } else {
            System.out.println("Число " + num1 + " равно числу " + num2);
        }

        System.out.println("\n3. Работа с числом");
        int num = -2;
        if(num == 0) {
            System.out.println("Число равно " + num);
        } else {
            if(num % 2 == 0) {
                System.out.print("Число " + num + " является четным и ");
            } else {
                System.out.print("Число " + num + " является нечетным и ");
            }
            if(num > 0) {
                System.out.println("положительным");
            } else {
                System.out.println("отрицательным");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int x = 101;
        int y = 102;
        int digitx1 = x%10;
        int digitx2 = x/10%10;
        int digitx3 = x/100;
        int digity1 = y%10;
        int digity2 = y/10%10;
        int digity3 = y/100;
        System.out.println("Исходные числа: " + x + ", " + y);
        System.out.println("");
        if(digitx1 == digity1) {
            System.out.println("Одинаковые цифры в 1-м разряде: " + digitx1);
        }
        if(digitx2 == digity2) {
            System.out.println("Одинаковые цифры во 2-м разряде: " + digitx2);
        }
        if(digitx3 == digity3) {
            System.out.println("Одинаковые цифры в 3-м разряде: " + digitx3);
        }
        if(digitx1 != digity1 && digitx2 != digity2 && digitx2 != digity2) {
            System.out.println("Цифры во всех разрядах отличаются");
        }

        System.out.println("\n5. Определение буквы, числа или символа по их коду");
        char c = '\u0057';
        System.out.print(c + " - ");
        if(c >= 'a' && c <= 'z' || c >= 'а' && c <= 'я') {
            System.out.println("маленькая буква");
        } else if(c >= 'A' && c <= 'Z' || c >= 'А' && c <= 'Я') {
            System.out.println("большая буква");
        } else if(c >= '0' && c <= '9') {
            System.out.println("число");
        } else {
            System.out.println("не буква и не число");
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
        int deposit = 300000;
        double rate;
        if(deposit < 100000) {
            rate = 5;
        } else if(deposit < 300000) {
            rate = 7;
        } else {
            rate = 10;
        }
        System.out.println("Сумма вклада = " + deposit);
        System.out.println("Начисленный процент = " + deposit * rate / 100);
        System.out.println("Итоговая сумма с % = " + deposit * (1 + rate / 100));

        System.out.println("\n7. Определение оценки по предметам");
        int historyGrade = 59;
        int programmingGrade = 91;
        int historyMark;
        int programmingMark;
        if(historyGrade <= 60) {
            historyMark = 2;
        } else if(historyGrade <= 73) {
            historyMark = 3;
        } else if(historyGrade <= 91) {
            historyMark = 4;
        } else {
            historyMark = 5;
        }
        if(programmingGrade <= 60) {
            programmingMark = 2;
        } else if(programmingGrade <= 73) {
            programmingMark = 3;
        } else if(programmingGrade <= 91) {
            programmingMark = 4;
        } else {
            programmingMark = 5;
        }
        System.out.println(historyMark + " - оценка по истории");
        System.out.println(programmingMark + " - оценка по программированию");
        System.out.println((historyMark + programmingMark) / 2 + " - средняя оценка по предметам");
        System.out.println((historyGrade + programmingGrade) / 2 + " - средний процент по предметам");

        System.out.println("\n8. Расчет прибыли");
        int monthlyRent = 5000;
        int  monthlyRevenue = 13000;
        int monthlyCost = 9000;
        int annualProfit = (monthlyRevenue - monthlyCost - monthlyRent) * 12;
        System.out.print("Прибыль за год: ");
        if(annualProfit > 0) {
            System.out.print("+");
        }
        System.out.println(annualProfit);

        System.out.println("\n 9. Подсчет количества банкнот");
        int cashWithdrawal = 567;
        int banknotes100 = cashWithdrawal / 100;
        int banknotes10 = cashWithdrawal / 10 % 10;
        int banknotes1 = cashWithdrawal % 10;
        if(banknotes100 > 10) {
             banknotes10 = banknotes10 + (banknotes100 - 10) * 10;
             banknotes100 = 10;
        }
        if(banknotes10 > 5) {
             banknotes1 = banknotes1 + (banknotes10 - 5) * 10;
             banknotes10 = 5;
        }
        boolean isCalculationCorrect = (banknotes100*100 + banknotes10*10 + banknotes1*1) == cashWithdrawal;
        System.out.println("расчет верный? " + isCalculationCorrect);
        System.out.println(banknotes100 + " банкнот по 100 USD");
        System.out.println(banknotes10 + " банкнот по 10 USD");
        System.out.println(banknotes1 + " банкнот по 1 USD");
        System.out.println("Сумма снятия = " + (banknotes100*100 + banknotes10*10 + banknotes1*1) + " USD");
    }
}