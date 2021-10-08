package net.imwork.zhanlong.data_structure.sequence_table;

/**
 * 实现接口中的方法
 *
 * @author 展龙
 */
public class ArrTeacherTel implements TeacherTelOperation
{
    /**
     * 顺序表，存放教师电话信息
     */
    private TeacherTel[] teacherTel;

    /**
     * 记录计数器，当前顺序表中的记录个数
     */
    private int count = 0;

    /**
     * 创建指定容量的顺序表
     *
     * @param initialCapacity
     */
    public ArrTeacherTel(int initialCapacity)
    {
        teacherTel = new TeacherTel[initialCapacity];
    }

    /**
     * 获取教师电话记录个数
     *
     * @return
     */
    @Override
    public int getCounts()
    {
        return count;
    }

    /**
     * 在顺序表添加一个教师电话信息记录，并且添加时按教师编号从小到大的顺序插入节点
     *
     * @param node
     */
    @Override
    public void add(TeacherTel node)
    {
        if (count == 0)
        {
            int i = count;
            teacherTel[i] = node;
            count++;
        } else if (count == teacherTel.length)
        {
            System.out.println("存储空间已经满了。");
        } else
        {

            int flag = 0;
            for (int i = 0; i < count; i++)
            {
                if (node.getTeacherNo() < teacherTel[i].getTeacherNo())
                {
                    for (int j = count - 1; j >= i; j--)
                    {
                        teacherTel[j + 1] = teacherTel[j];
                    }
                    teacherTel[i] = node;
                    count++;
                    flag = 1;
                    break;
                }
            }
            if (0 == flag)
            {
                teacherTel[count] = node;
                count++;
            }
        }
    }

    /**
     * 遍历顺序表中所有教师电话记录
     */
    @Override
    public void listAll()
    {
        if (count == 0)
        {
            System.out.println("没有记录！");
        }

        for (int i = 0; i < count; i++)
        {
            System.out.print(teacherTel[i].toString());
            System.out.println();
        }
    }

    /**
     * 根据教师编号查询记录
     *
     * @param index
     */
    @Override
    public void search(int index)
    {
        int flag = 0;
        for (int i = 0; i < count; i++)
        {
            if (teacherTel[i].getTeacherNo() == index)
            {
                System.out.println("您查找信息是：" + teacherTel[i].toString());
                flag = 1;
                break;
            }
        }

        if (flag == 0)
        {
            System.out.println("输入的编号无效！");
        }
    }

    /**
     * 根据教师姓名查询记录
     *
     * @param name
     */
    @Override
    public void search(String name)
    {
        int flag = 0;
        for (int i = 0; i < count; i++)
        {
            if (teacherTel[i].getName().equals(name))
            {
                System.out.println("您查找信息为：" + teacherTel[i].toString());
                flag = 1;
                break;
            }
        }

        if (flag == 0)
        {
            System.out.println("查无此人");
        }
    }

    /**
     * 根据教师编号删除记录
     *
     * @param index
     */
    @Override
    public void delete(int index)
    {
        int flag = 0;
        for (int i = 0; i < count; i++)
        {
            if (teacherTel[i].getTeacherNo() == index)
            {
                for (int j = i; j < count - 1; j++)
                {
                    teacherTel[j] = teacherTel[j + 1];
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

    /**
     * 根据教师姓名删除记录
     *
     * @param name
     */
    @Override
    public void delete(String name)
    {
        int flag = 0;
        for (int i = 0; i < count; i++)
        {
            if (teacherTel[i].getName().equals(name))
            {
                for (int j = i; j < count - 1; j++)
                {
                    teacherTel[j] = teacherTel[j + 1];
                }
                flag = -1;
                count--;
                System.out.println("删除成功！");
                break;
            }
        }

        if (flag == 0)
        {
            System.out.println("查无此人");
        }
    }
}
