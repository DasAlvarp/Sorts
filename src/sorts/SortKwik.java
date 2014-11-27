package sorts;

import java.io.File;
import java.io.IOException;

/**
 * Created by alvaro on 11/26/14.
 * From http://www.algolist.net/Algorithms/Sorting/Quicksort. Slightly adjusted with return functions.
 */
public class SortKwik extends Sorter
{
    @Override
    public int[] sort(int[] sorter)
    {

        quickSort(sorter, 0, sorter.length - 1);
        return sorter;
    }

    private void quickSort(int arr[], int left, int right)
    {
        int index = partition(arr, left, right);
        if (left < index - 1)
        {
            quickSort(arr, left, index - 1);
        }
        if (index < right)
        {
            quickSort(arr, index, right);
        }
    }

    private int partition(int arr[], int left, int right)
    {
        int i = left, j = right;
        int tmp;
        int pivot = arr[(left + right) / 2];

        while (i <= j)
        {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i <= j)
            {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }

        return i;
    }


    public int[] sort(File toFiled) throws IOException
    {

        return sort(super.toArray(toFiled));
    }
}
