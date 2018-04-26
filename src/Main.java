import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Use main to run and test the below functions
    }

    /**
     * Puts the elements in the arrayList in sorted order from smallest to greatest.
     * This function uses selection sort to sort the arrayList.
     * @param arrayList the ArrayList to be sorted. arrayList cannot contain duplicates
     */
    public static void selectionSort(ArrayList<Integer> arrayList) {
        throw new UnsupportedOperationException("SelectionSort() has not been implemented yet");
    }

    /**
     * Returns the index that value is located in the arrayList. This function searches linearly in
     * the arrayList to find the value.
     * @param arrayList the ArrayList containing the list of values to search. arrayList cannot contain duplicates
     * @param value the value we are looking for in the array list
     */
    public static int linearSearch(ArrayList<Integer> arrayList, int value) {
        throw new UnsupportedOperationException("LinearSearch() has not been implemented yet");
    }

    /**
     * Returns the index that value is located in the arrayList. This function uses binary search in
     * the arrayList to find the value.
     * @param arrayList the ArrayList containing the list of values to search. THIS ARRAYLIST MUST BE
     *                  IN SORTED ORDER. arrayList cannot contain duplicates
     * @param value the value we are looking for in the array list
     */
    public static int binarySearch(ArrayList<Integer> arrayList, int value) {
        throw new UnsupportedOperationException("LinearSearch() has not been implemented yet");
    }

    /**
     * Puts the elements in the arrayList in sorted order from smallest to greatest.
     * This function uses MergeSort to sort the arrayList.
     * @param arrayList the ArrayList to be sorted. arrayList cannot contain duplicates
     */
    public static void mergeSort(ArrayList<Integer> arrayList) {
        sort(arrayList, 0, arrayList.size());
        //throw new UnsupportedOperationException("mergeSort() has not been implemented yet");
    }


    /**
     * This function is a helper function used to help you implement mergeSort.
     * The function sorts the portion of arrayList specified by the range [lo, hi). The range
     * includes lo but excludes hi (arrayList[lo] is the first element in the range, but
     * arrayList[hi] is the first element after the last element in the range).
     * @param arrayList the ArrayList to be sorted.
     * @param lo the index of the first element in the range
     * @param hi the index of the last element in the range + 1.
     */
    public static void sort(ArrayList<Integer> arrayList, int lo, int hi) {
        if (lo+1 >= hi)
        {
            return;
        }
        int mid = lo + (hi-lo+1)/2;
        sort(arrayList, lo, mid);
        sort(arrayList, mid, hi);
        merge(arrayList, lo, mid, hi);
    }

    //>=, +1

    /**
     * This function is a helper function used to help you implement mergeSort.
     * The function merges two consecutive, sorted ranges in the arrayList into one sorted range. The ranges
     * are specified as [lo, mid) and [mid, hi). Each range includes the first element, but excludes
     * the last element (the same way as in sort()).
     * @param arrayList the ArrayList to be sorted.
     * @param lo the index of the first element in the first range
     * @param mid the boundary point of the two ranges. arrayList[mid] is in the second range.
     * @param hi the index of the last element in the second range + 1.
     */
    public static void merge(ArrayList<Integer> arrayList, int lo, int mid, int hi) {
        ArrayList<Integer> hold = new ArrayList<Integer>();
        int x = lo;
        int y = mid;
        int z = hi;
        while (x <= y && y <= z)
        {
            if (arrayList.get(x)>= arrayList.get(y))
            {
                hold.add(arrayList.get(y));
                y++;
            }
            else
            {
                hold.add(arrayList.get(x));
                x++;
            }
            if (x==y && y != z)
            {
                for (int i = y; i < z; i++)
                {
                    hold.add(arrayList.get(i));
                }
                y=z;
            }
            if (y==z && x != y)
            {
                for (int i = x; i < y; i++)
                {
                    hold.add(arrayList.get(i));
                }
                x=y;
            }
        }
        for (int i = lo; i <= hi; i++)
        {
            arrayList.set(i, hold.get(i-lo));
        }
    }
}
