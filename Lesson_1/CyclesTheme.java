public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int sumEven = 0;
        int sumOdd = 0;
        int counter = -10;
        do {
            if(counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while(counter <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sumEven + ", а нечетных = " + sumOdd);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5; 
        int num3 = -1;
        int max = num1;
        int min = num2;
        if(num1 < num2) {
            max = num2;
            min = num1;
        }
        if(num3 > max) {
            max = num3;
        }
        if(num3 < min) {
            min = num3;
        }
        for(int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int sum = 0;
        while(num > 0) {
            int digit = num % 10;
            System.out.print(digit);
            num /= 10;
            sum += digit;
        }
        System.out.println("\nСумма всех цифр: " + sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int column = 0;
        for(num = 1; num < 24; num += 2) {
            System.out.printf("%2d ", num);
            column++;
            if(column % 5 == 0) {
                System.out.println();
            }
        }
        while(column % 5 != 0) {
            System.out.printf("%2d ", 0);
            column++;
        }

        System.out.println("\n\n5. Проверка количества двоек на четность");
        num = 3242592;
        System.out.print("Число " + num);
        int countTwos = 0;
        while(num > 0) {
            if(num % 10 == 2) {
                countTwos++;
            }
            num /= 10;
        }
        if(countTwos == 0) {
            System.out.println(" не содержит двоек");
        } else if(countTwos % 2 == 0) {
            System.out.println(" содержит четное количество двоек");
        } else {
            System.out.println(" содержит нечетное количество двоек");
        }

        System.out.println("\n6. Отображение фигур в консоли\n");
        int row; 
        for(row = 0; row < 5; row++) {
            for(column = 0; column < 10; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        row = 0;
        column = 0;
        while(row < 5) {
            column = 5 - row;
            while(column > 0) {
                System.out.print("#");
                column--;
            }
            System.out.println();
            row++;
        }
        System.out.println();

        row = 1;
        do {
            column = 1;
            do {
                System.out.print("$");
                column++; 
            } while(column <= row && column <= 6 - row);
            System.out.println();
            row++;
        } while(row <= 5);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.printf("%4s%4s%n", "Dec ", "Char");
        for(int i = 1; i < 48; i += 2) {
            System.out.printf("%4d%4c%n", i, i);
        }
        for(int i = 98; i < 123; i += 2) {
            System.out.printf("%4d%4c%n", i, i);
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        num = 1234321;
        int reversedNum = 0;
        int copyNum = num;
        while(copyNum > 0) {
            int digit = copyNum % 10;
            reversedNum *= 10;
            reversedNum += digit;
            copyNum /= 10;
        }
        if(reversedNum == num) {
            System.out.println("Число " + num + " является палиндромом");
        } else {
            System.out.println("Число " + num + " не является палиндромом");
        }
        
        System.out.println("\n9. Определение, является ли число счастливым");
        num = 145334;
        int leftHalfNum = 0;
        int rightHalfNum = 0;
        counter = 0;
        while(num > 0) {
            int digit = num % 10;
            num /= 10;
            counter++;
            if(counter <= 3) {
                rightHalfNum += digit;
            } else {
                leftHalfNum += digit;
            }
        }
        System.out.println("Сумма первых 3 цифр = " + leftHalfNum);
        System.out.println("Сумма последних 3 цифр = " + rightHalfNum);
        if(leftHalfNum == rightHalfNum) {
            System.out.println("Число счастливое");
        } else {
            System.out.println("Число не является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        System.out.printf("   |");
        for(int i = 2; i <= 9; i++) {
            System.out.printf(" %2s", i);
        }
        System.out.println("\n___|________________________");
        for(int i = 2; i <= 9; i++) {
            System.out.printf("%2s |", i);
            for(int j = i * 2; j <= i * 9; j += i) {
                System.out.printf(" %2s", j);
            }
            System.out.println();
        }
        System.out.println();
    } 
}