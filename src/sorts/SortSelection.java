package sorts;

import java.util.ArrayList;

/**
 * Created by alvaro on 11/21/14.
 */
public class SortSelection
{
    int[] toSort;
    public SortSelection(int[] tbs)
    {
        toSort = tbs;
    }

    public int[] sortList()
    {


        int[] newList = new int[toSort.length];

        for(int i = 0; i < toSort.length; i++)
        {
            newList[i] = toSort[i];
        }

        int loops = 0;
        int[] smallestOnes = {-1, -1};
        int temps = 0;
        boolean hasChanged = false;

        int maxDist = newList.length - 1;
        for(int tot = 0; tot < newList.length; tot++)
        {
            for (int l = tot; l < maxDist; l++)
            {
                if (newList[l] < smallestOnes[1] || smallestOnes[1] == -1)
                {
                    smallestOnes[0] = l;
                    smallestOnes[1] = newList[l];
                    hasChanged = true;
                }


            }



            if(hasChanged)
            {
                temps = newList[tot];
                newList[tot] = smallestOnes[1];
                newList[smallestOnes[0]] = temps;
                hasChanged = false;
                maxDist--;
            }


            for(int x = 0; x < newList.length; x++)
            {
                System.out.println(newList[x] + " WEEEEEEEEoooo");
            }


            System.out.println("");
        }
        return newList;
    }
}
