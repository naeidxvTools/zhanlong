package net.imwork.zhanlong.data_structure.linked_list;

/**
 * 定义链表中的数据元素类型
 * @author Administrator
 */
public class TeacherTel
{
    private String name;
    private int teacherNo;
    private String telephone;
    private TeacherTel next;

    public TeacherTel()
    {
    }

    public TeacherTel(int teacherNo, String name, String telephone)
    {
        this.name = name;
        this.teacherNo = teacherNo;
        this.telephone = telephone;
    }

    public TeacherTel getNext()
    {
        return next;
    }

    public void setNext(TeacherTel next)
    {
        this.next = next;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getTeacherNo()
    {
        return teacherNo;
    }

    public void setTeacherNo(int teacherNo)
    {
        this.teacherNo = teacherNo;
    }

    public String getTelephone()
    {
        return telephone;
    }

    public void setTelephone(String telephone)
    {
        this.telephone = telephone;
    }

    @Override
    public String toString()
    {
        return teacherNo + "," + name + "," + telephone;
    }
}
