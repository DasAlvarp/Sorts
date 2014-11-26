package utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by alvaro on 11/26/14.
 */
public class Misc
{
    public void arToF(int[] toFile) throws IOException
    {
        PrintWriter out = new PrintWriter("numbersSort.txt", "UTF-8");

        for(int x = 0; x < toFile.length; x++)
        {
            out.println(toFile[x]);
        }
        out.close();

    }

}
