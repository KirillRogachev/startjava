public class VariablesTheme {
    
    public static void main(String[] args) {
        System.out.println("1. Вывод значений переменных на консоль");
        byte coresNum = 4;
        short ram = 8;
        int windowsEdition = 10;
        long driveSize = 256L;
        float processorSpeed = 2.1f;
        double screenSize = 15.6;
        char usbType = 'C';
        boolean isTurnedOn = true;
        System.out.println("Количество ядер процессора: " + coresNum);
        System.out.println("Объем оперативной памяти: " + ram);
        System.out.println("Операционная система Windows: " + windowsEdition);
        System.out.println("Объем накопителя SSD: " + driveSize);
        System.out.println("Диагональ экрана: " + screenSize);
        System.out.println("Тактовая частота процессора: " + processorSpeed);
        System.out.println("Поддержка USB, тип " + usbType);
        System.out.println("Компьютер включен? " + isTurnedOn);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int penPrice = 100;
        int bookPrice = 200;
        double discount = 0.11;
        double discountSum = (penPrice+ bookPrice) * discount;
        double purchaseSum = penPrice + bookPrice - discountSum;
        System.out.println("Сумма скидки, руб.: " + discountSum);
        System.out.println("Общая стоимость товаров со скидкой, руб.: " + purchaseSum);

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a   ");
        System.out.println("   J   a a  v   v  a a  ");
        System.out.println("J  J  aaaaa  V V  aaaaa ");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte b = 127;
        short s = 32_767;
        int i = 2_147_483_647;
        long l = 9_223_372_036_854_775_807L;
        System.out.println("- byte\nпервоначальное значение " + b);
        b++;
        System.out.println("значение после инкремента " + b);
        b--;
        System.out.println("значение после декремента " + b);
        System.out.println("- short\nпервоначальное значение " + s);
        s++;
        System.out.println("значение после инкремента " + s);
        s--;
        System.out.println("значение после декремента " + s);
        System.out.println("- int\nпервоначальное значение " + i);
        i++;
        System.out.println("значение после инкремента " + i);
        i--;
        System.out.println("значение после декремента " + i);
        System.out.println("- long\nпервоначальное значение " + l);
        l++;
        System.out.println("значение после инкремента " + l);
        l--;
        System.out.println("значение после декремента " + l);

        System.out.println("\n5. Перестановка значений переменных");
        int x = 3;
        int y = 6;
        System.out.println("- C помощью третьей переменной");
        System.out.println("Исходные значения переменных: " + x + " и " + y);
        int z = x;
        x = y;
        y = z;
        System.out.println("Новые значения переменных: " + x + " и " + y);
        System.out.println("- С помощью арифметических операций");
        System.out.println("Исходные значения переменных: " + x + " и " + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("Новые значения переменных: " + x + " и " + y);
        System.out.println("- С помощью арифметических операций");
        System.out.println("Исходные значения переменных: " + x + " и " + y);
        x = x ^ y;
        y = y ^ x;
        x = x ^ y;
        System.out.println("Новые значения переменных: " + x + " и " + y);

        System.out.println("\n6. Вывод символов и их кодов");
        char ch1 = 35;
        char ch2 = 38;
        char ch3 = 64;
        char ch4 = 94;
        char ch5 = 95;
        System.out.println((int) ch1 + " " + ch1);
        System.out.println((int) ch2 + " " + ch2);
        System.out.println((int) ch3 + " " + ch3);
        System.out.println((int) ch4 + " " + ch4);
        System.out.println((int) ch5 + " " + ch5);

        System.out.println("\n7. Вывод количества сотен, десятков и единиц числа");
        int srcNum = 123;
        int digit1 = srcNum/100;
        int digit2 = srcNum%100/10;
        int digit3 = srcNum%100%10;
        System.out.println("Число " + srcNum + " содержит:");
        System.out.println("\t" + digit1 + " сотен\n\t" + digit2 + " десятков\n\t" + digit3 + " единиц");

        System.out.println("\n8. Вывод в консоль ASCII-арт Дюка");
        char sl = '/';
        char backSl = '\\';
        char under = '_';
        char open = '(';
        char close = ')';
        System.out.println("    " + sl + backSl + "    ");
        System.out.println("   "+ sl + "  " + backSl + "   ");
        System.out.println("  " + sl + under + open + " " + close + backSl + "  ");
        System.out.println(" " + sl + "      " + backSl);
        System.out.println("" + sl + under + under + under + under + sl + backSl + under + under + backSl);

        System.out.println("\n9. Вывод произведения и суммы цифр числа");
        srcNum = 345;
        digit1 = srcNum/100;
        digit2 = srcNum%100/10;
        digit3 = srcNum%100%10;
        int productOfDigits = digit1 * digit2 * digit3;
        int sum = digit1 + digit2 + digit3;
        System.out.println("Сумма цифр числа " + srcNum + " = " + sum);
        System.out.println("Их произведение = " + productOfDigits);


        System.out.println("\n10. Вывод времени");
        int time = 86399;
        int hour = time/60/60;
        int min = time/60%60;
        int sec = time%60;
        System.out.println(hour + ":" + min + ":" + sec);
    }
}