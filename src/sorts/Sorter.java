package sorts;

/**
 * Created by alvaro on 11/21/14.
 */
public class Sorter
{
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
