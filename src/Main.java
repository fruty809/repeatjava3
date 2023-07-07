public class Main {
    public static void main(String[] args) {
        // Основное задание
        double[] numbers = {8, -2, -4, 2, 3, 6, -7};

        boolean negativeNumberFound = false;
        double sum = 0;
        int count = 0;

        for (double number : numbers) {
            if (negativeNumberFound) {
                if (number > 0) {
                    sum += number;
                    count++;
                }
            } else if (number < 0) {
                negativeNumberFound = true;
            }
        }

        double average = sum / count;
        System.out.println("Среднее арифметическое положительных чисел после первого отрицательного числа: " + average);

        // Задание на сообразительность
        int[] array = {-7, -4, -2, 2, 3, 6, 8};

        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;

            printArray(array);
        }
    }

    private static void printArray(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
