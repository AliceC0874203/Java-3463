import java.util.*;

public class EX1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] array = {2, 7, 5, 6, 7, 1, 6, 2, 1, 7};

        System.out.println("The most frequent number in the table is:");

        Map<Integer, Integer> numbers = new HashMap<Integer, Integer>();

        for (int i = 0; i < array.length; i++) {
            int tmp = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    ++tmp;
                    numbers.put(array[i], tmp);
                }
            }
        }

        Map.Entry<Integer, Integer> maxEntry = null;
        for (Map.Entry<Integer, Integer> number : numbers.entrySet())
        {
            if (maxEntry == null || number.getValue().compareTo(maxEntry.getValue()) > 0)
            {
                maxEntry = number;
            }
        }

        System.out.println(maxEntry.getKey() + "(" + maxEntry.getValue() + "x)");
    }
}