package sorts;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by alvaro on 11/21/14.
 */
public class Sorter
{
    public int[] toArray(File toSort) throws IOException
    {
        BufferedReader sortRead = new BufferedReader(new FileReader(toSort));
        ArrayList<Integer> arrayToChange = new ArrayList<Integer>();


        while(sortRead.ready())
        {
            arrayToChange.add(Integer.parseInt(sortRead.readLine()));
        }

        int[] returner = new int[arrayToChange.size()];

        for(int x = 0; x < arrayToChange.size(); x++)
        {
            returner[x] = arrayToChange.get(x);
        }

        return returner;
    }
    public int[] sort(int[] sorted)
    {
        return sorted;
    }
    public int[] switchTwo(int[] toSwitch, int ind1, int ind2)
    {
        int temp = toSwitch[ind1];
        toSwitch[ind1] = toSwitch[ind2];
        toSwitch[ind2] = temp;
        return toSwitch;
    }

}