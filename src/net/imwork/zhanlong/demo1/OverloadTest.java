package net.imwork.zhanlong.demo1;

/**
 * @author Administrator
 */
@SuppressWarnings("unused")
public class OverloadTest
{
    public OverloadTest()
    {
    }

    public OverloadTest(int a, int c)
    {
        this();
        System.out.println("");
    }
    public int add(int a, int b)
    {
        return a + b;
    }

    public int add(int a, int b, int c)
    {
        return a + b + c;
    }

    public int add(float a, int y)
    {
        return 0;
    }


}
