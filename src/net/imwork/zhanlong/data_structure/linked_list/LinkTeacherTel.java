package net.imwork.zhanlong.data_structure.linked_list;

/**
 * 实现接口中的方法
 *
 * @author 展龙
 */
public class LinkTeacherTel implements TeacherTelOperation
{
    /**
     * 链表的头
     */
    private TeacherTel head;

    /**
     * 记录数计数器
     */
    private int count = 0;

    /**
     * 构造方法，创建一个空链表
     */
    public LinkTeacherTel()
    {
        head = null;
        count = 0;
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
     * 在链表中添加一个教师电话信息记录，并且添加时按教师编号从小到大的顺序插入结点
     *
     * @param node
     */
    @Override
    public void add(TeacherTel node)
    {
        TeacherTel prior = head, current = head;

        // 空表
        if (head == null)
        {
            head = node;
        } else // 非空表
        {
            // 寻找插入位置
            while (current != null)
            {
                // 查找node的插入位置，将node插入到current前
                if (node.getTeacherNo() < current.getTeacherNo())
                {
                    break;
                }
                prior = current;
                current = current.getNext();
            }

            // 插入结点node
            if (current == head)
            {
                // 在表头结点前插入node
                node.setNext(head);
                head = node;
            }else // 在表中和表尾处插入node
            {
                prior.setNext(node);
                node.setNext(current);
            }
        }
        count++;
    }

    /**
     * 遍历链表中所有教师电话记录
     */
    @Override
    public void listAll()
    {
        TeacherTel current = head;

        while (current != null)
        {
            System.out.println(current);
            current = current.getNext();
        }
        System.out.println("共有记录" + count + "条");
    }

    /**
     * 根据教师编号查询记录
     *
     * @param teacherNo
     */
    @Override
    public void search(int teacherNo)
    {
        int flag = 0;
        TeacherTel current = head;

        while (current != null)
        {
            if (current.getTeacherNo() == teacherNo)
            {
                System.out.println("您要查找的信息为：" + current);
                flag = 1;
                break;
            }
            current = current.getNext();
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
        TeacherTel current = head;
        int flag = 0;
        while (current != null)
        {
            if (current.getName().equals(name))
            {
                System.out.println("您要查找的信息为：" + current);
                flag = 1;
            }
            current = current.getNext();
        }

        if (flag == -1)
        {
            System.out.println("查无此人");
        }
    }

    /**
     * 根据教师编号删除记录
     *
     * @param teacherNo
     */
    @Override
    public void delete(int teacherNo)
    {
        TeacherTel pre = null;
        TeacherTel current = head;
        pre = current;
        int flag = 0;

        while (current != null)
        {
            if (current.getTeacherNo() == teacherNo)
            {
                flag = 1;
                if (current == head)
                {
                    head = current.getNext();
                }else
                {
                    pre.setNext(current.getNext());
                }
            }
            pre = current;
            current = current.getNext();
        }

        if (flag == 0)
        {
            System.out.println("查无此人！");
        }else
        {
            System.out.println("删除成功！");
            count--;
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
        TeacherTel pre = null;
        TeacherTel current = head;
        pre = current;
        int flag = 0;

        while (current != null)
        {
            if (current.getName().equals(name))
            {
                flag = 1;
                if (current == head)
                {
                    head = current.getNext();
                }else
                {
                    pre.setNext(current.getNext());
                }
            }
            pre = current;
            current = current.getNext();
        }

        if (flag == 0)
        {
            System.out.println("查无此人！");
        }else
        {
            System.out.println("删除成功！");
            count--;
        }
    }
}
