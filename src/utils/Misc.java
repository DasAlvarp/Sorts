package utils;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 * Created by alvaro on 11/26/14.
 */
public class Misc
{
    public void arToF(int[] toFile) throws IOException
    {
        Random randy = new Random();
        String name = "f" + ".txt";
        PrintWriter out = new PrintWriter(name, "UTF-8");

        for(int x = 0; x < toFile.length; x++)
        {
            out.println(toFile[x]);
        }
        out.close();

    }

}
