import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;


public class Main {

    public static void main(String[] args) {
        int[] arr = new int[10];
//        int[] arr = {4, 1, 3, 2};
        Random random = new Random();
        arr[0] = 55;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            System.out.println(arr[i]);

        }
        Main.bubleSort(arr);
//        Main.insertionSort(arr);
        binarySearch(arr, 55);
    }

    //Сортировка пузырьком
    public static void bubleSort(int arr[]) {
        int a;
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    a = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = a;
                    i++;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //Сортировка подстановкой
//    public static void insertionSort(int[] arr){
//        int index = 0;
//        int a = 0;
//        for(index = 0; index < arr.length; ) {
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[index] < arr[i]) {
//                    a = arr[index];
//                    arr[index] = arr[i];
//                    arr[i] = a;
//                    i++;
//                }
//                index++;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//    }

    public static int binarySearch(int[] arr, int elemValue) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        int middleIndex;

        while (startIndex <= endIndex) {
            middleIndex = startIndex + (endIndex - startIndex) / 2;
            System.out.println("startIndex: " + startIndex + ", endIndex: " + endIndex + ", middleIndex: " + middleIndex);

            if (arr[middleIndex] == elemValue) {
                System.out.println("found " + elemValue + " at " + middleIndex);
                return middleIndex;
            }

            if (arr[middleIndex] > elemValue) {
                endIndex = middleIndex - 1;
            } else {
                startIndex = middleIndex + 1;
            }
        }
        return -1;

    }
}
