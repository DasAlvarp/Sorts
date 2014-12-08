package hashes;


/**
 * Created by alvaro on 12/7/14.
 */
public class HashSort1
{
    public String[] table = new String[20000];

    private void init()
    {
        for(int x = 0; x < table.length; x++)
        {
            table[x] = null;
        }
    }




    public void fill(int[] sorter)
    {

        init();

        for(int x = 0; x < sorter.length; x++)
        {
            insert(sorter[x]);
        }

    }

    public void insert(int address)
    {
        int point = getValue(address);
        if(table[point] != null)
        {
            insertAdd(address, point);
        }
        else
        {
            table[point] = "" + address;
        }

    }

    private void insertAdd(int address, int point)
    {
        point = fixCollision(address, point);
        if(table[point] != null)
        {
            insertAdd(address + 1, point);
        }
        else
        {
            //System.out.println("added element");
            table[point] = "" + address;
        }
    }





    public int getValue(int address)
    {
        int total = 1;
        String toHash = "" + (address);
        for(int x = 0; x < toHash.length(); x++)
        {
            total *= Math.pow(x * 32, (int) toHash.charAt(x));
        }

        total %= table.length;

        return total;

    }

    public int fixCollision(int address, int failedAddress)
    {
        return (address + failedAddress) % table.length;
    }

}
