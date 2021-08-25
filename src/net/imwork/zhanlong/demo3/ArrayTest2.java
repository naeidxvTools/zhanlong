package net.imwork.zhanlong.demo3;

/**
 * @author Administrator
 */
public class ArrayTest2
{
    public static void main(String[] args)
    {
        Student[] students = new Student[100];

        for(int i = 0; i < students.length; i++)
        {
            students[i] = new Student();
        }

        for (int i = 0; i < students.length; i++)
        {
            if (i % 2 == 0)
            {
                students[i].name = "lisi";
            } else
            {
                students[i].name = "zhangsan";
            }
        }

        for(int i = 0; i < students.length; i++)
        {
            System.out.print(students[i].name + " ");
        }
    }

}
