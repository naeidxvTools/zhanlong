package net.imwork.zhanlong.demo3;

/**
 * @author Administrator
 */
public class CopyArrayTest
{
    public static void main(String[] args)
    {
        int[] a = {1, 2, 3, 4};

        // 报错
        int[] b = null;

        System.arraycopy(a, 0, b, 0, 4);



        for (int i = 0; i < b.length; i++)
        {
            System.out.print(b[i] + " ");
        }

    }
}
