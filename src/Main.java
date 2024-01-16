import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    private static final int MAX_VALUE = 100000;
    private static final int MAX_LENGTH = 100000;
    private static final long MAX_TIME = 60000L; // stop after 1 minute
    private static final int MISSING_VALUE = -1;
    private static final Random random = new Random();

    private static boolean isSorted(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    // this assumes the list has at least one element
    private static int getListMin(List<Integer> list) {
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        return min;
    }

    public static List<Integer> randomSort(List<Integer> list) {
        // Copy the original list instead of changing it.
        List<Integer> newList = new ArrayList<>(list);
        while (!isSorted(newList)) {
            Collections.shuffle(newList);
        }
        return newList;
    }

    public static List<Integer> insertionSort(List<Integer> list) {
        // Copy the original list instead of changing it.
        List<Integer> newList = new ArrayList<>(list);
        List<Integer> resultList = new ArrayList<>();
        while (!newList.isEmpty()) {
            int min = getListMin(newList);
            resultList.add(min);
            newList.remove(newList.indexOf(min));
        }
        return resultList;
    }

    public static List<Integer> makeRandomList(int length) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            list.add(random.nextInt());
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println("length, randomSort, insertionSort, librarySort");
        boolean doRandom = true;
        for (int length = 1; length < MAX_LENGTH; length++) {
            List<Integer> myList = makeRandomList(length);
            long startTime = System.currentTimeMillis();
            if (doRandom) {
                randomSort(myList);
            }
            long randomTime = doRandom ? System.currentTimeMillis() - startTime : MISSING_VALUE;
            if (randomTime > MAX_TIME) {
                doRandom = false;
            }
            startTime = System.currentTimeMillis();
            insertionSort(myList);
            long insertionTime = System.currentTimeMillis() - startTime;
            startTime = System.currentTimeMillis();
            Collections.sort(myList);
            long sortTime = System.currentTimeMillis() - startTime;
            System.out.printf("%d, %s, %d, %d\n", length, randomTime, insertionTime, sortTime);
        }
    }
}