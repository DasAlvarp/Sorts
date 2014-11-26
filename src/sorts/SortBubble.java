package sorts;

import java.io.File;
import java.io.IOException;

/**
 * Created by alvaro on 11/21/14.
 */
public class SortBubble extends Sorter
{
    @Override
    public int[] sort(int[] sorter)
    {
        boolean didStuff = false;
        for(int x = 0; x < sorter.length; x++)
        {
            for(int y = 0; y < sorter.length - 1 - x; y++)
            {
                if (sorter[y] > sorter[y + 1])
                {
                    sorter = switchTwo(sorter, y, y + 1);
                    didStuff = true;
                }

            }
            if(!didStuff)
            {
                return sorter;
            }
        }
        return sorter;
    }

    public int[] sort(File toFiled) throws IOException
    {

        return sort(super.toArray(toFiled));
    }


}
