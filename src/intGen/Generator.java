package intGen;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by alvaro on 11/21/14.
 */
public class Generator
{
    Random randy = new Random();


    public int[] generate(int num)
    {
        return generateInList(num);
    }

    private int[] generateInList(int num)
    {
        int[] toFile = new int[num];
        for (int x = 0; x < num; x++)
        {
            toFile[x] = randy.nextInt(num * num);
            System.out.println(toFile[x]);
        }
        if (toFile.length == num)
        {
            return toFile;
        }
        else
        {
            System.out.println("Failure!");
            return null;
        }

    }



}
