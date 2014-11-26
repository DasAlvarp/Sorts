import intGen.Generator;
import sorts.SortBubble;
import sorts.SortSelection;

import java.security.Timestamp;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

/**
 * Created by alvaro on 11/21/14.
 */
public class Driver
{
    public static void main(String[] args)
    {
        Generator toGen = new Generator();

        int[] toSort = toGen.generate(4);
        SortBubble soSelect = new SortBubble();
        double first = System.currentTimeMillis();
        toSort = soSelect.sort(toSort);

        System.out.println("Sort took" + (first - System.currentTimeMillis()));

        for(int x = 0; x < toSort.length; x++)
        {
            System.out.println(toSort[x] + " WEEEEEEEE");
        }
    }


}
