package net.imwork.zhanlong.demo3;

/**
 * @author Administrator
 */
public class ArrayTest3
{
    public static void main(String[] args)
    {
        int[][] a = new int[2][3];

        System.out.println(a[0] instanceof int[]);

        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                a[i][j] = 2 * j + 2 + i * 6;
            }
        }

        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print(a[i][j] + " ");
            }
        }
        System.out.println();

        int[][] b = new int[10][];

        b[1] = new int[2];

        int[][] c = new int[][]{{1,2,3},{4},{5,6,7}};

        for (int i = 0; i < c.length; i++)
        {
            for (int j = 0; j < c[i].length; j++)
            {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }


    }
}
