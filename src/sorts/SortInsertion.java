package sorts;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by alvaro on 11/26/14.
 */
public class SortInsertion extends Sorter
{
    @Override
    public int[] sort(int[] sorter)
    {

        int[] currentList = new int[1];
        currentList[0] = sorter[0];
        for (int x = 1; x < sorter.length; x++)
        {
            currentList = add(currentList, sorter[x]);
        }
        return currentList;
    }


    public int[] sort(File toFiled) throws IOException
    {

        return sort(super.toArray(toFiled));
    }


    public int[] add(int[] currList, int toAdd)
    {
        int[] returnList = new int[currList.length + 1];
        int centerIndex = 0;
        for (int x = 0; x < currList.length && currList[x] < toAdd; x++)
        {
            returnList[x] = currList[x];
            centerIndex = x;
        }

        returnList[centerIndex] = toAdd;

        for (int x = centerIndex + 1; x < currList.length; x++)
        {
            returnList[x + 1] = currList[x];
        }
        return returnList;

    }
}
