package hashes;


import java.util.ArrayList;

/**
 * Created by alvaro on 12/7/14.
 */
public class HashSort2
{
    public ArrayList<String>[] table = new ArrayList[60000];



    public void fill(int[] sorter)
    {

        for(int x = 0; x < sorter.length; x++)
        {
            insert(sorter[x]);
        }

    }

    public void insert(int address)
    {
        int point = getValue(address);
        if(table[point] == null)
        {
            ArrayList<String> f= new ArrayList<String>();
            f.add("" + address);
            table[point] = f;
        }
        else
        {

            table[point].add("" + address);
        }

    }





    public int getValue(int address)
    {
        int total = 1;
        String toHash = "" + (address);
        for(int x = 0; x < toHash.length(); x++)
        {
            total += Math.pow(x , (int)toHash.charAt(x));
            total = total * total;
        }

        total = Math.abs(total);

        total = shrinkTo(total);

        return total;

    }

    public int fixCollision(int address, int failedAddress)
    {
        return shrinkTo(address * 23 + failedAddress * address);
    }

    private int shrinkTo(int toShrink)
    {
        if(toShrink >= table.length)
        {
            toShrink = toShrink / 7;
            toShrink = shrinkTo(toShrink);
        }
        return toShrink;
    }


}
