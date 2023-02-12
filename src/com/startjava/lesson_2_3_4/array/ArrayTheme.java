package src.com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {
    
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArr = {7, 4, 3, 6, 2, 1, 5};
        int length = intArr.length;
        printIntArr(intArr);
        System.out.println();
        for(int i = 0; i < length; i++) {
            length--;
            int temp = intArr[i]; 
            intArr[i] = intArr[length];
            intArr[length] = temp;
        }
        printIntArr(intArr);

        System.out.println("\n\n2. Вывод произведения элементов массива");
        intArr = new int[10];
        length = intArr.length;
        for(int i = 0; i < length; i++) {
            intArr[i] = i;
        }
        int result = 1;
        for(int i = 1; i < length - 1; i++) {
            result *= intArr[i];
            System.out.print(intArr[i] + (i < length - 2 ? " * " : " = "));
        }
        System.out.println(result);
        System.out.println(intArr[0] + "\n" + intArr[9]);

        System.out.println("\n3. Удаление элементов массива");
        double[] doubleArr = new double[15];
        length = doubleArr.length;
        for(int i = 0; i < length; i++) {
            doubleArr[i] = Math.random();
        }
        printDoubleArr(doubleArr);
        System.out.println("\n");
        double middleCell = doubleArr[length / 2];
        int counter = 0;
        for(int i = 0; i < length; i++) {
            if(doubleArr[i] > middleCell) {
                doubleArr[i] = 0;
                counter++;
            }
        }
        printDoubleArr(doubleArr);
        System.out.println("\nКоличество обнуленных ячеек: " + counter);

        System.out.println("\n 4. Вывод элементов массива лесенкой в обратном порядке");
        char[] alphabet = new char[26];
        length = alphabet.length;
        for(int i = 0; i < length; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        String previousLine = "";
        for(int i = length - 1; i >= 0; i--) {
            System.out.println(previousLine += alphabet[i]);
        }

        System.out.println("\n 5. Генерация уникальных чисел");
        intArr = new int[30];
        length = intArr.length;
        for(int i = 0; i < length; i++) {
            boolean unique;
            int random;
            do {
                random = (int) (Math.random() * 40 + 60);
                unique = true;
                for(int j = 0; j < i; j++){
                    if(random == intArr[j]) {
                        unique = false;
                        break;
                    }
                }
            } while(!unique);
            intArr[i] = random;
        }
        for(int i = length - 1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(intArr[j] > intArr[j + 1]) {
                    int temp = intArr[j];
                    intArr[j] = intArr[j + 1];
                    intArr[j + 1] = temp;
                }
            }
        }
        for(int i = 0; i < length; i++) {
            System.out.print(intArr[i] + " ");
            if((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println("\n6.Сдвиг элементов массива");
        String[] srcStringArr = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        int srcArrLen = srcStringArr.length;
        int destArrLen = 0;
        for(String string: srcStringArr) {
            if(!string.isBlank()) {
                destArrLen++;
            }
        }

        String[] destStringArr = new String[destArrLen];
        int destPos = 0;
        int blockLength;
        for(int i = 0; i < srcArrLen; i = i + blockLength + 1) {
            blockLength = 0;
            for(int j = i; !srcStringArr[j].isBlank() && j < srcArrLen; j++) {
                blockLength++;
            }
            System.arraycopy(srcStringArr, i, destStringArr, destPos, blockLength);
            destPos += blockLength;
        }
        System.out.println(Arrays.toString(srcStringArr));
        System.out.println(Arrays.toString(destStringArr));
    }

    private static void printIntArr(int[] intArr) {
        for(int num : intArr) {
            System.out.print(num + " ");
        }
    }

    private static void printDoubleArr(double[] doubleArr) {
        for(int i = 0; i < doubleArr.length; i++) {
            if(i == 8) {
                System.out.println();
            }
            System.out.printf("%7.3f", doubleArr[i]);
        }
    }
}