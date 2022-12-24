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
        num1 = 101;
        num2 = 102;
        int num1Ones = num1 % 10;
        int num1Tens = num1 / 10 % 10;
        int num1Hundreds = num1 / 100;
        int num2Ones = num2 % 10;
        int num2Tens = num2 / 10 % 10;
        int num2Hundreds = num2 / 100;
        System.out.println("Исходные числа: " + num1 + ", " + num2);
        System.out.println("");
        if(num1Ones == num2Ones) {
            System.out.println("Одинаковые цифры в 1-м разряде: " + num1Ones);
        }
        if(num1Tens == num2Tens) {
            System.out.println("Одинаковые цифры во 2-м разряде: " + num1Tens);
        }
        if(num1Hundreds == num2Hundreds) {
            System.out.println("Одинаковые цифры в 3-м разряде: " + num1Hundreds);
        }
        if(num1Ones != num2Ones && num1Tens != num2Tens && num1Hundreds != num2Hundreds) {
            System.out.println("Цифры во всех разрядах отличаются");
        }

        System.out.println("\n5. Определение буквы, числа или символа по их коду");
        char symbol = '\u0057';
        System.out.print(symbol + " - ");
        if((symbol >= 'a' && symbol <= 'z') || (symbol >= 'а' && symbol <= 'я')) {
            System.out.println("маленькая буква");
        } else if((symbol >= 'A' & symbol <= 'Z') || (symbol >= 'А' & symbol <= 'Я')) {
            System.out.println("большая буква");
        } else if(symbol >= '0' & symbol <= '9') {
            System.out.println("число");
        } else {
            System.out.println("не буква и не число");
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
        int deposit = 300000;
        double rate = 10;
        if(deposit < 100000) {
            rate = 5;
        } else if(deposit < 300000) {
            rate = 7;
        } 
        System.out.println("Сумма вклада = " + deposit);
        System.out.println("Начисленный процент = " + deposit * rate / 100);
        System.out.println("Итоговая сумма с % = " + deposit * (1 + rate / 100));

        System.out.println("\n7. Определение оценки по предметам");
        int historyGrade = 59;
        int programmingGrade = 91;
        int historyMark = 5;
        int programmingMark = 5;
        if(historyGrade <= 60) {
            historyMark = 2;
        } else if(historyGrade <= 73) {
            historyMark = 3;
        } else if(historyGrade <= 91) {
            historyMark = 4;
        } 
        if(programmingGrade <= 60) {
            programmingMark = 2;
        } else if(programmingGrade <= 73) {
            programmingMark = 3;
        } else if(programmingGrade <= 91) {
            programmingMark = 4;
        } 
        System.out.println(historyMark + " - оценка по истории");
        System.out.println(programmingMark + " - оценка по программированию");
        System.out.println((historyMark + programmingMark) / 2 + " - средняя оценка по предметам");
        System.out.println((historyGrade + programmingGrade) / 2 + " - средний процент по предметам");

        System.out.println("\n8. Расчет прибыли");
        int monthlyRent = 5000;
        int monthlyRevenue = 13000;
        int monthlyCost = 9000;
        int annualProfit = (monthlyRevenue - monthlyCost - monthlyRent) * 12;
        System.out.print("Прибыль за год: ");
        if(annualProfit > 0) {
            System.out.print("+");
        }
        System.out.println(annualProfit);

        System.out.println("\n 9. Подсчет количества банкнот");
        int hundredsStock = 10;
        int tensStock = 5;
        int onesStock = 50;
        int totalWithdrawalAmount = 567;
        int hundredsWithdrawal = totalWithdrawalAmount / 100;
        int tensWithdrawal = totalWithdrawalAmount / 10 % 10;
        int onesWithdrawal = totalWithdrawalAmount % 10;
        if(hundredsWithdrawal > hundredsStock) {
             tensWithdrawal += (hundredsWithdrawal - hundredsStock) * 10;
             hundredsWithdrawal = hundredsStock;
        }
        if(tensWithdrawal > tensStock) {
             onesWithdrawal += (tensWithdrawal - tensStock) * 10;
             tensWithdrawal = tensStock;
        }
        if(onesWithdrawal > onesStock) {
            System.out.println("В банкомате закончились банкноты номиналом 1 доллар");
        } else {
            boolean isCalculationCorrect = (hundredsWithdrawal * 100 + tensWithdrawal * 10 + 
                                            onesWithdrawal) == totalWithdrawalAmount;
            System.out.println("расчет верный? " + isCalculationCorrect);
            System.out.println(hundredsWithdrawal + " банкнот по 100 USD");
            System.out.println(tensWithdrawal + " банкнот по 10 USD");
            System.out.println(onesWithdrawal + " банкнот по 1 USD");
            System.out.println("Сумма снятия = " + totalWithdrawalAmount + " USD");
        }
    }
}