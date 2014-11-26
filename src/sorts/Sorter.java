package sorts;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by alvaro on 11/21/14.
 */
public class Sorter
{
    protected int[] toArray(File toSort) throws IOException
    {
        BufferedReader sortRead = new BufferedReader(new FileReader(toSort));
        ArrayList<Integer> toArray = new ArrayList<Integer>();
        while(sortRead.ready())
        {
            toArray.add(Integer.parseInt(sortRead.readLine()));
        }
        int[] returner = new int[toArray.size()];

        for(int x = 0; x < toArray.size(); x++)
        {
            returner[x] = toArray.get(x);
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
