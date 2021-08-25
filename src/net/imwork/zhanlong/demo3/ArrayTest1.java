package net.imwork.zhanlong.demo3;

/**
 * @author Administrator
 */
public class ArrayTest1
{
    public static void main(String[] args)
    {

        int[] a = new int[10];

        // int a[] = new int[10];

        for (int i = 0; i < a.length; i++)
        {
            a[i] = i + 1;
        }

        for (int i = 0; i < a.length; i++)
        {
            System.out.println("a[" + i + "] = " + a[i]);
        }

        int[] b = new int[]{1, 3, 5, 7};

        System.out.println(b.length);


        Person[] pArray = new Person[3];

        pArray[0] = new Person(10);
        pArray[1] = new Person(20);
        pArray[2] = new Person(30);

        for (int i = 0; i < pArray.length; i++)
        {
            System.out.println(pArray[i].age + " ");
        }

    }
}

class Person
{
    public int age;

    public Person(int age)
    {
        this.age = age;
    }
}