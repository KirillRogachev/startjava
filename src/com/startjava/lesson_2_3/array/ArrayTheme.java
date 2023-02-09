package src.com.startjava.lesson_2_3.array;

import java.util.Arrays;

public class ArrayTheme {
    
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArr = {7, 4, 3, 6, 2, 1, 5};
        int length = intArr.length;
        for(int num : intArr) {
            System.out.print(num + " ");
        }
        System.out.println();
        for(int i = 0; i < length / 2; i++) {
            intArr[i] ^= intArr[length - i - 1];
            intArr[length - i - 1] ^= intArr[i];
            intArr[i] ^= intArr[length - i - 1];
        }
        for(int num : intArr) {
            System.out.print(num + " ");
        }

        System.out.println("\n\n2. Вывод произведения элементов массива");
        intArr = new int[10];
        length = intArr.length;
        for(int i = 0; i < length; i++) {
            intArr[i] = i;
        }
        int result = 1;
        for(int i = 1; i < length - 1; i++) {
            result *= intArr[i];
            System.out.print(intArr[i]);
            System.out.print(i < length - 2 ? " * " : " = ");
        }
        System.out.println(result);
        System.out.println(intArr[0]);
        System.out.println(intArr[9]);

        System.out.println("\n3. Удаление элементов массива");
        double[] doubleArr = new double[15];
        length = doubleArr.length;
        for(int i = 0; i < length; i++) {
            doubleArr[i] = Math.random();
            if(i == 8) {
                System.out.println();
            }
            System.out.printf("%7.3f", doubleArr[i]);
        }
        System.out.println("\n");
        double middleCell = doubleArr[length / 2];
        int counter = 0;
        for(int i = 0; i < length; i++) {
            if(doubleArr[i] > middleCell) {
                doubleArr[i] = 0;
                counter++;
            }
            if(i == 8) {
                System.out.println();
            }
            System.out.printf("%7.3f", doubleArr[i]);
        }
        System.out.println("\nКоличество обнуленных ячеек: " + counter);

        System.out.println("\n 4. Вывод элементов массива лесенкой в обратном порядке");
        char[] charArr = new char[26];
        length = charArr.length;
        for(int i = 0; i < length; i++) {
            charArr[i] = (char) ('A' + i);
        }
        String previousLine = "";
        for(int i = length - 1; i >= 0; i--) {
            System.out.println(previousLine += charArr[i]);
            }

        System.out.println("\n 5. Генерация уникальных чисел");
        intArr = new int[30];
        length = intArr.length;
        for(int i = 0; i < length; i++) {
            boolean isUnique;
            do {
                intArr[i] = (int) (Math.random() * 40 + 60);
                isUnique = true;
                for(int j = 0; j < i; j++){
                    if(intArr[i] == intArr[j]) {
                        isUnique = false;
                    }
                }
            } while(!isUnique);
        }
        int temp;
        for(int i = length - 1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(intArr[j] > intArr[j + 1]) {
                    temp = intArr[j];
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
        length = 0;
        for(int i = 0; i < srcStringArr.length; i++) {
            if(!srcStringArr[i].isBlank()) {
                length++;
            }
        }
        String[] destStringArr = new String[length];
        int destPos = 0;
        int blockLength;
        for(int i = 0; i < srcStringArr.length; ) {
            if(!srcStringArr[i].isBlank()){
                blockLength = 0;
                for(int j = i; !srcStringArr[j].isBlank() && j < srcStringArr.length; j++) {
                    blockLength++;
                }
                System.arraycopy(srcStringArr, i, destStringArr, destPos, blockLength);
                destPos += blockLength;
                i += blockLength;
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(srcStringArr));
        System.out.println(Arrays.toString(destStringArr));
    }
}