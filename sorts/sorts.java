package sorts;

import java.util.List;

public class sorts {
    public void bubblesort(List<Integer> arr) {
        for (int i = 0; i <= (arr.size() - 2); i++) {
            boolean swapped = false;
            for (int j = 1; j <= (arr.size() - 1 - i); j++) {
                if (arr.get(j - 1) > arr.get(j)) {
                    int temp = arr.get(j - 1);
                    arr.set((j - 1), arr.get(j));
                    arr.set(j, temp);
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }

    }
}
