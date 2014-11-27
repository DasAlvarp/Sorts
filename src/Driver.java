import sorts.SortBubble;
import sorts.SortInsertion;
import sorts.SortKwik;
import utils.Misc;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 * Created by alvaro on 11/21/14.
 */
public class Driver
{
    public static final int NUMBERNUM = 500;

    public static void main(String[] args) throws IOException
    {
        Random randy = new Random();
        Misc wat = new Misc();


        File numbers = new File("numbers.txt");
        FileWriter writer = new FileWriter(numbers);
        PrintWriter out = new PrintWriter("numbers.txt", "UTF-8");
        numbers.setWritable(true);

        for (int x = 0; x < NUMBERNUM; x++)
        {
            out.println(randy.nextInt(NUMBERNUM));
        }
        out.close();

        double d = System.currentTimeMillis();
        SortBubble theSort = new SortBubble();
        int[] listy = theSort.sort(numbers);
        wat.arToF(listy);
        System.out.println("Bubble Sort: " + (System.currentTimeMillis() - d));

        double q = System.currentTimeMillis();
        SortInsertion inSort = new SortInsertion();
        int[] nList = inSort.sort(numbers);
        wat.arToF(nList);
        System.out.println("Insertion Sort: " + (System.currentTimeMillis() - q));

        double r = System.currentTimeMillis();
        SortKwik kSort = new SortKwik();
        int[] kList = kSort.sort(numbers);
        wat.arToF(kList);
        System.out.println("Insertion Sort: " + (System.currentTimeMillis() - r));
    }

}
