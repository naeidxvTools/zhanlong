package net.imwork.zhanlong.demo2;

/**
 * @author Administrator
 */
public class SingletonTest
{
    public static void main(String[] args)
    {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);
    }
}
