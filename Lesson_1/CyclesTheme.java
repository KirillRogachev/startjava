public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int sumEven = 0;
        int sumOdd = 0;
        int i = -10;
        do {
            if(i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
            i++;
        } while(i <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sumEven + ", а нечетных = " + sumOdd);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5; 
        int num3 = -1;
        int max, min;
        if(num1 >= num2 && num1 >= num3) {
            max = num1;
        } else if(num2 >= num1 && num2 >= num3) {
            max = num2;
        } else {
            max = num3;
        }
        if(num1 <= num2 && num1 <= num3) {
            min = num1;
        } else if(num2 <= num1 && num2 <= num3) {
            min = num2;
        } else {
            min = num3;
        }
        for(i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int sum = 0;
        int digit;
        while(num > 0) {
            digit = num % 10;
            System.out.print(digit);
            num /= 10;
            sum += digit;
        }
        System.out.println("\nСумма всех цифр: " + sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int j = 0;
        for(i = 1; i < 24; i+=2) {
            System.out.printf("%2d ", i);
            j++;
            if(j % 5 == 0) {
                System.out.println("");
            }
        }
        while(j % 5 != 0) {
            System.out.printf("%2d ", 0);
            j++;
        }

        System.out.println("\n\n5. Проверка количества двоек на четность");
        num = 3242592;
        System.out.print("Число " + num);
        int evenDigitsCount = 0;
        while(num > 0) {
            if(num % 10 == 2) {
                evenDigitsCount++;
            }
            num = num / 10;
        }
        if(evenDigitsCount == 0) {
            System.out.println(" не содержит двоек");
        } else if(evenDigitsCount % 2 == 0) {
            System.out.println(" содержит четное количество двоек");
        } else {
            System.out.println(" содержит нечетное количество двоек");
        }

        System.out.println("\n6. Отображение фигур в консоли\n");
        for(i = 0; i < 5; i++) {
            for(j = 0; j < 10; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
        i = 0;
        while(i < 5) {
            j = 5 - i;
            while(j > 0) {
                System.out.print("#");
                j--;
            }
            System.out.println("");
            i++;
        }
        System.out.println("");
        i = 1;
        do {
            j = 1;
            do {
                System.out.print("$");
                    j++;
                } while(j <= i);
            System.out.println("");
            i++;
        } while(i <= 3);
        do {
            do {
                System.out.print("$");
                    j--;
                } while(j >= i - 1);
            System.out.println("");
            i++;
        } while(i <= 5);
        

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.printf("%4s%4s%n", "Dec ", "Char");
        for(i = 1; i < 48; i += 2) {
            System.out.printf("%4d%4c%n", i, (char)i);
        }
        for(i = 98; i < 123; i += 2) {
            System.out.printf("%4d%4c%n", i, (char)i);
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int initialNum = 1234321;
        int mirroredNum = 0;
        int multiplier = 1000000;
        num = initialNum;
        while(num > 0) {
                digit = num % 10;
                mirroredNum += digit * multiplier;
                num /= 10;
                multiplier /= 10;
            }
        if(mirroredNum == initialNum) {
            System.out.println("Число " + initialNum + " является палиндромом");
        } else {
            System.out.println("Число " + initialNum + " не является палиндромом");
        }
        
        System.out.println("\n9. Определение, является ли число счастливым");
        num = 145334;
        int first3Sum = 0;
        int last3Sum = 0;
        while(num >= 1000) {
            last3Sum += num % 10;
            num /= 10;
        }
        System.out.println(" ");
        while(num > 0) {
            first3Sum += num % 10;
            num /= 10;
        }
        System.out.println("Сумма первых 3 цифр = " + first3Sum);
        System.out.println("Сумма последних 3 цифр = " + first3Sum);
        if(first3Sum == last3Sum) {
            System.out.println("Число счастливое");
        } else {
            System.out.println("Число не является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        System.out.printf("   |");
        for(i = 2; i <= 9; i++) {
            System.out.printf(" %2s", i);
        }
        System.out.println("\n___|________________________");
        for(i = 2; i <= 9; i++) {
            System.out.printf("%2s |", i);
            for(j = i * 2; j <= i * 9; j += i) {
                System.out.printf(" %2s", j);
            }
            System.out.println("");
        }
        System.out.println("");
    } 
}