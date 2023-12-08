package in.kahl;

import java.util.Arrays;

public class Sack {
    private int[] array = new int[0];

    private int firstAvailableIndex = 0;

    public Sack() {
    }

    public void add(int number) {
        if (firstAvailableIndex == array.length) {
            int[] tmpArray = new int[firstAvailableIndex+1];
            for(int i = 0; i < firstAvailableIndex; i++) {
                tmpArray[i] = array[i];
            }
            array = tmpArray;
        }

        array[firstAvailableIndex] = number;
        firstAvailableIndex++;
    }

    public int get(int index) {
        return array[index];
    }

    public void removeByIndex(int index) {
        int[] tmpArray = new int[array.length-1];
        // get all the elements before the removal candidate
        for(int i = 0; i < index; i++) {
            tmpArray[i] = array[i];
        }
        // get all the elements after the removal candidate
        for(int i = index; i < tmpArray.length; i++) {
            tmpArray[i] = array[i+1];
        }
        firstAvailableIndex--;
        array = tmpArray;
    }

    public void removeLast() {
        removeByIndex(array.length-1);
    }

    public void removeFirst() {
        if (array.length == 0) {
            return;
        }
        removeByIndex(0);
    }

    public int size() {
        return array.length;
    }

    @Override
    public String toString() {
        return "Sack{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
