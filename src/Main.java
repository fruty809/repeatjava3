public class Main {
    public static void main(String[] args) {
        double[] array = {-7, -4, -2, 2, 3, 6, 8};

        System.out.println("Исходный массив: ");
        printArray(array);

        //Алгоритм сортировки
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                double temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
            System.out.println("Текущее состояние массива после итерации " + (i + 1) + ":");
            printArray(array);
        }
        System.out.println("Отсортированный массив:");
        printArray(array);
    }
    public static void printArray(double[]array){
        for (double num : array){
            System.out.println(num +"");
        }
        System.out.println();
    }
}