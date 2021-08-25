package net.imwork.zhanlong.demo1;

/**
 * @author Administrator
 */
public class Demo2
{
    public int age;
    private String name;
    protected String password;

    public Demo2(int age)
    {
        this.age = age;
    }

    public Demo2(int age, String name, String password)
    {
        this.age = age;
        this.name = name;
        this.password = password;
    }

    public Demo2()
    {
    }

    public Demo2(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    public void method(int param)
    {
        System.out.println(++param);
    }

    public static void main(String[] args)
    {
        Demo2 demo2 = new Demo2();
        demo2.method(2);

    }
}



