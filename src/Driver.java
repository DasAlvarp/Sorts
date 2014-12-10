import hashes.HashSort1;
import hashes.HashSort2;
import sorts.*;
import utils.Misc;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 * Created by alvaro on 11/21/14.
 */
public class Driver
{
    public static final int NUMBERNUM = 50000;

    public static void main(String[] args) throws IOException
    {
        Random randy = new Random();
        Misc wat = new Misc();






        File numbers = new File("f.txt");
        PrintWriter out = new PrintWriter("numbers.txt", "UTF-8");
        numbers.setWritable(true);

        for (int x = 0; x < NUMBERNUM; x++)
        {
            out.println(randy.nextInt(NUMBERNUM));
        }
        out.close();

        Sorter genericSort = new Sorter();


        SortFlip treSort = new SortFlip();
        int[] treList = treSort.sort(new File("numbers.txt"));
        wat.arToF(treList);


        double d = System.currentTimeMillis();
        SortBubble theSort = new SortBubble();
        int[] listy = theSort.sort(numbers);
        wat.arToF(listy);
        System.out.println("Bubble Sort: " + (System.currentTimeMillis() - d));

        wat.arToF(treList);

        double q = System.currentTimeMillis();
        SortInsertion inSort = new SortInsertion();
        int[] nList = inSort.sort(numbers);
        wat.arToF(nList);
        System.out.println("Insertion Sort: " + (System.currentTimeMillis() - q));

        wat.arToF(treList);


        double r = System.currentTimeMillis();
        SortKwik kSort = new SortKwik();
        int[] kList = kSort.sort(numbers);
        wat.arToF(kList);
        System.out.println("KwikSort: " + (System.currentTimeMillis() - r));

        wat.arToF(treList);

        double t = System.currentTimeMillis();
        SortMerge mSort = new SortMerge();
        int[] mList = mSort.sort(numbers);
        wat.arToF(mList);
        System.out.println("MergSort: " + (System.currentTimeMillis() - t));

        wat.arToF(treList);

        double h = System.currentTimeMillis();
        SortHeap hSort = new SortHeap();
        int[] hList = hSort.sort(numbers);
        wat.arToF(hList);
        System.out.println("HeapSort: " + (System.currentTimeMillis() - h));

        wat.arToF(treList);


        double tr = System.currentTimeMillis();
        SortTree trSort = new SortTree();
        int[] trList = trSort.sort(numbers);
        wat.arToF(trList);
        System.out.println("TreeSort: " + (System.currentTimeMillis() - tr));
/*

        int[] toHash = genericSort.toArray(numbers);
        double hash1 = System.currentTimeMillis();
        HashSort1 h1 = new HashSort1();
        h1.fill(toHash);
        System.out.println("Hash 1: " + (System.currentTimeMillis() - hash1));

        int[] toHash2 = genericSort.toArray(numbers);
        double hash2 = System.currentTimeMillis();
        HashSort2 h2 = new HashSort2();
        h2.fill(toHash2);
        System.out.println("Hash 2: " + (System.currentTimeMillis() - hash2));



*/







    }

}
