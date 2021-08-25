package net.imwork.zhanlong.demo1;

/**
 * @author Administrator
 */
public class ExtendsTest
{
    public static void main(String[] args)
    {
        Child child = new Child();

    }
}


class Parent
{
    public Parent(int i)
    {
        super();
        System.out.println("Parent");
    }
}

class Child extends Parent
{
    public Child()
    {
        super(10);
        System.out.println("Child");
    }
}