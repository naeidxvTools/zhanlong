package net.imwork.zhanlong.demo3;

/**
 * @author Administrator
 */
public class Swap
{
    public static void swap(int a, int b)
    {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args)
    {
        int x = 3;
        int y = 4;
        Swap.swap(x, y);

        System.out.println(x);
        System.out.println(y);

        int[] i = new int[0];


    }
}
