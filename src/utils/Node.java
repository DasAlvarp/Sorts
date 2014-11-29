package utils;

import java.util.ArrayList;

/**
 * Created by alvaro on 11/26/14.
 */
public class Node
{
    public int item;
    public Node left;
    public Node right;

    // CONSTRUCTORS
    public Node(int item) {
        this(item, null, null);
    }

    public Node(int toItem, Node lLink, Node rLink) {
        item = toItem;
        this.left = lLink;
        this.right = rLink;
    }

    public ArrayList<Integer> getTraversal()
    {
        ArrayList<Integer> toTraverse = new ArrayList<Integer>();
        if(left != null)
        {
            traverse(this.left, toTraverse);
        }
        toTraverse.add(this.item);
        if(right != null)
        {
            traverse(this.right, toTraverse);
        }
        return toTraverse;
    }

    private void traverse(Node head, ArrayList<Integer> addHere)
    {
        if(head.left != null)
        {
            traverse(head.left, addHere);
        }
        addHere.add(head.item);
        if(head.right != null)
        {
            traverse(head.right, addHere);
        }
    }

    public void add(int n)
    {
        if(n > this.item)
        {
            if(this.right != null)
            {
                this.right.add(n);
            }
            else
            {
                Node temp = new Node(n);
                this.right = temp;
            }
        }
        else
        {
            if(this.left != null)
            {
                this.left.add(n);
            }
            else
            {
                Node temp = new Node(n);
                this.left = temp;
            }
        }
    }





}
