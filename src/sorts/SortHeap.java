package sorts;

import java.io.File;
import java.io.IOException;

/**
 * Created by alvaro on 11/26/14.
 * From http://en.wikibooks.org/wiki/Algorithm_Implementation/Sorting/Heapsort#Java_2
 * Basically looked at that thing line by line...
 */
public class SortHeap extends Sorter
{
    @Override
    public int[] sort(int[] sorter)
    {

        heapSort(sorter);
        return sorter;
    }


    public int[] sort(File toFiled) throws IOException
    {

        return sort(super.toArray(toFiled));
    }

    private void heapSort(int[] array)
    {

        //insertion
        for (int heapBigness = 0; heapBigness < array.length; heapBigness++)
        {

            int currentIndex = heapBigness;
            while (currentIndex > 0)
            {
                int p = (currentIndex - 1) / 2;
                if (array[currentIndex] > array[p])
                { // child is larger than parent
                    switchTwo(array, currentIndex, p);
                    currentIndex = p;
                }
                else // parent is larger than child
                {
                    break; // all is good in the heap
                }
            }
        }

        //removal
        for (int bigness = array.length; bigness > 0; )
        {
            switchTwo(array, 0, --bigness);
            int currentIndex = 0;
            while (true)
            {
                int left = (currentIndex * 2) + 1;
                if (left >= bigness)
                {
                    break; // heap'd
                }
                int right = left + 1;
                if (right >= bigness)
                {
                    if (array[left] > array[currentIndex])
                    {
                        switchTwo(array, left, currentIndex);
                    }
                    break; // heap'd
                }
                if (array[left] > array[currentIndex])
                {
                    if (array[left] > array[right])
                    {
                        switchTwo(array, left, currentIndex);
                        currentIndex = left;
                    }
                    else
                    {
                        switchTwo(array, right, currentIndex);
                        currentIndex = right;
                    }
                }
                else
                {
                    if (array[right] > array[currentIndex])
                    {
                        switchTwo(array, right, currentIndex);
                        currentIndex = right;
                    }
                    else
                    {
                        break;
                    }
                }
            }
        }
    }
}
