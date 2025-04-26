import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortEvenNumbers {
    public static int[] sortEven(int[] arr) {
        List<Integer> evenNumbers = new ArrayList<>();

        // Збираємо всі парні числа
        for (int num : arr) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }

        // Сортуємо парні числа
        Collections.sort(evenNumbers);

        // Вставляємо їх назад у масив
        int evenIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = evenNumbers.get(evenIndex++);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 8, 1, 4};
        arr = sortEven(arr);
        System.out.println(Arrays.toString(arr));
        // Вивід: [5, 3, 2, 4, 1, 8]
    }
}
