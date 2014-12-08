package sorts;

import utils.Node;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by alvaro on 11/26/14.
 */
public class SortTree extends Sorter
{
    @Override
    public int[] sort(int[] sorter)
    {

        return treeSort(sorter);
    }


    public int[] sort(File toFiled) throws IOException
    {

        return sort(super.toArray(toFiled));
    }

    public int[] treeSort(int[] toSort)
    {
        Node n = new Node(toSort[0]);
        for(int x = 1; x < toSort.length; x++)
        {
            n.add(toSort[x]);
        }

        ArrayList<Integer> toRe = n.getTraversal();

        int[] r = new int[toSort.length];
        for(int x = 0; x < r.length; x++)
        {
            r[x] = toRe.get(x);
        }
        return r;

    }

}