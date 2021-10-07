package net.imwork.zhanlong.data_structure.sequence_table;

/**
 * 实现接口中的方法
 * @author 展龙
 */
public class ArrTeacherTel implements TeacherTelOperation
{
    private TeacherTel[] teacherTels;
    private int count = 0;

    public ArrTeacherTel(int initialCapacity)
    {
        teacherTels = new TeacherTel[initialCapacity];
    }

    public int getCount()
    {
        return count;
    }

    @Override
    public int getCounts()
    {
        return count;
    }

    @Override
    public void add(TeacherTel node)
    {
        if (count == 0)
        {
            int i = count;
            teacherTels[i] = node;
            count++;
        }else
        {
            int flag = 0;
            for (int i = 0; i < count; i++)
            {
                if (node.getTeacherNo() < teacherTels[i].getTeacherNo())
                {
                    for (int j = count; j >= i; j--)
                    {
                        teacherTels[j + 1] = teacherTels[j];
                    }
                    teacherTels[i] = node;
                    count++;
                    flag = 1;
                    break;
                }
            }
            if (0 == flag)
            {
                teacherTels[count] = node;
                count++;
            }
        }

        if (count == teacherTels.length)
        {
            System.out.println("存储空间已经满了。");
        }
    }

    @Override
    public void listAll()
    {
        if (count == 0)
        {
            System.out.println("没有记录！");
        }

        for (int i = 0; i < count; i++)
        {
            System.out.print(teacherTels[i].toString());
            System.out.println();
        }
    }

    @Override
    public void search(int index)
    {
        int flag = 0;
        for (int i = 0; i < count; i++)
        {
            if (teacherTels[i].getTeacherNo() == index)
            {
                System.out.println("您查找信息是：" + teacherTels[i].toString());
                flag = 1;
                break;
            }
        }

        if (flag == 0)
        {
            System.out.println("输入的编号无效！");
        }
    }

    @Override
    public void search(String name)
    {
        int flag = 0;
        for (int i = 0; i < count; i++)
        {
            if (teacherTels[i].getName().equals(name))
            {
                System.out.println("您查找信息为：" + teacherTels[i].toString());
                flag = 1;
                break;
            }
        }

        if (flag == 0)
        {
            System.out.println("输入的编号无效！");
        }
    }

    @Override
    public void delete(int index)
    {
        int flag = 0;
        for (int i = 0; i < count; i++)
        {
            if (teacherTels[i].getTeacherNo() == index)
            {
                for (int j = i; j < count - 1; j++)
                {
                    teacherTels[j] = teacherTels[j + 1];
                }
                flag = -1;
                count--;
                System.out.println("删除成功！");
                break;
            }
        }

        if (flag == 0)
        {
            System.out.println("查无此人！");
        }
    }

    @Override
    public void delete(String name)
    {
        int flag = 0;
        for (int i = 0; i < count; i++)
        {
            if (teacherTels[i].getName().equals(name))
            {
                for (int j = i; j < count - 1; j++)
                {
                    teacherTels[j] = teacherTels[j + 1];
                }
                flag = -1;
                count--;
                System.out.println("删除成功！");
                break;
            }
        }

        if (flag == 0)
        {
            System.out.println("输入的编号无效！");
        }
    }
}
