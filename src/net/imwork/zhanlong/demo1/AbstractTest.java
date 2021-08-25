package net.imwork.zhanlong.demo1;

/**
 * @author Administrator
 */
public class AbstractTest
{
    public static void main(String[] args)
    {
        Dog dog = new Dog()
        {
            @Override
            public String show(String name)
            {
                return "你好： " + name;
            }
        };
    }
}

abstract class Animal
{
    public String name;

    /**
     * 显示用户名
     * @param name
     * @return
     */
    public abstract String show(String name);


}

abstract class Dog extends Animal
{
    @Override
    public String show(String name)
    {
        return null;
    }
}
